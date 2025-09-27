package com.example.androidquiz.ui.components

import android.content.Intent
import android.speech.tts.TextToSpeech
import android.speech.tts.UtteranceProgressListener
import android.util.Log
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Stop
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

@Composable
fun TextToSpeechButton(
    textToSpeak: String,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    var ttsEnabled by remember { mutableStateOf(false) }
    // Inside your Composable function
    val ttsCheckLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == TextToSpeech.Engine.CHECK_VOICE_DATA_PASS) {
            // TTS is available and ready to use
            Log.i("TTS_Check", "TTS engine is available.")
            ttsEnabled = true
        } else {
            // TTS data is missing or corrupted, prompt the user to install it
            Log.w("TTS_Check", "TTS data is missing or corrupted. Prompting user to install.")
            val installIntent = Intent()
            installIntent.action = TextToSpeech.Engine.ACTION_INSTALL_TTS_DATA
            ttsEnabled = false
            context.startActivity(installIntent)
        }
    }

    // Function to initiate the TTS check
    fun checkTtsAvailability() {
        val checkIntent = Intent()
        checkIntent.action = TextToSpeech.Engine.ACTION_CHECK_TTS_DATA
        ttsCheckLauncher.launch(checkIntent)
    }

    LaunchedEffect(Unit) {
        checkTtsAvailability()
    }

    if (!ttsEnabled) return // TTS unavailable skipping the rest

    var tts by remember { mutableStateOf<TextToSpeech?>(null) }
    var ttsInitialized by remember { mutableStateOf(false) }
    var isSpeaking by remember { mutableStateOf(false) }

    DisposableEffect(Unit) {
        tts = TextToSpeech(context) { status ->
            if (status == TextToSpeech.SUCCESS) {
                Log.i("TTS_Button", "TextToSpeech Initialization SUCCESS")
                ttsInitialized = true
                tts?.setOnUtteranceProgressListener(createTtsListener {
                    isSpeaking = it
                })
            } else {
                Log.e("TTS_Button", "TextToSpeech Initialization FAILED. Status: $status")
            }
        }
        onDispose {
            tts?.stop()
            tts?.shutdown()
            tts = null
        }
    }

    FloatingActionButton(
        modifier = modifier,
        containerColor = Color.Transparent,
        onClick = {
            if (ttsInitialized) {
                if (isSpeaking) {
                    val stopResult = tts?.stop()
                    if (stopResult == TextToSpeech.SUCCESS) {
                        isSpeaking = false // Manually update state after successful stop
                    }
                } else {
                    if (textToSpeak.isNotBlank()) {
                        val utteranceId = "textToSpeechButtonUtteranceId"
                        val speakResult = tts?.speak(textToSpeak, TextToSpeech.QUEUE_FLUSH, null, utteranceId)
                        if (speakResult == TextToSpeech.ERROR) {
                            Log.e("TTS_Button_Action", "tts.speak() call returned ERROR.")
                        }
                        // isSpeaking will be set to true by the onStart listener callback
                    } else {
                        Log.w("TTS_Button_Action", "textToSpeak is blank. Not speaking.")
                    }
                }
            } else {
                Log.w("TTS_Button_Action", "TTS not initialized. Click ignored.")
            }
        }
    ) {
        Icon(
            imageVector = if (isSpeaking) Icons.Filled.Stop else Icons.Filled.PlayArrow,
            contentDescription = if (isSpeaking) "Stop Text" else "Speak Text",
        )
    }
}

private fun createTtsListener(
    setIsSpeaking: (Boolean) -> Unit
): UtteranceProgressListener {
    return object : UtteranceProgressListener() {
        override fun onStart(utteranceId: String?) {
            setIsSpeaking(true)
        }

        override fun onDone(utteranceId: String?) {
            setIsSpeaking(false)
        }

        @Deprecated("Deprecated in Java")
        override fun onError(utteranceId: String?) {
            Log.e("TTS_Listener_Callback", "onError (deprecated) called. UtteranceId: $utteranceId")
            setIsSpeaking(false)
        }
    }
}
