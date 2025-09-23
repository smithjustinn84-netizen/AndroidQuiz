package com.example.androidquiz.ui.components

import android.speech.tts.TextToSpeech
import android.util.Log
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext

@Composable
    fun TextToSpeechButton(
    textToSpeak: String,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    var tts by remember { mutableStateOf<TextToSpeech?>(null) }
    var ttsInitialized by remember { mutableStateOf(false) }

    // Initialize TextToSpeech
    DisposableEffect(Unit) {
        tts = TextToSpeech(context) { status ->
            if (status == TextToSpeech.SUCCESS) {
                ttsInitialized = true
                // You can set language, pitch, speech rate here if needed
                // For example, to set the language to US English:
                // tts?.language = Locale.US
            } else {
                // Handle TTS initialization failure
                Log.e("TTS", "Initialization failed")
            }
        }
        onDispose {
            tts?.stop()
            tts?.shutdown()
        }
    }

    // FloatingActionButton to trigger speech
    FloatingActionButton(
        modifier = modifier,
        onClick = {
            if (ttsInitialized && textToSpeak.isNotBlank()) {
                tts?.speak(textToSpeak, TextToSpeech.QUEUE_FLUSH, null, null)
            }
        },
        // Consider if you still need the enabled state or if the FAB should always be visible
        // and handle the uninitialized state within the onClick if necessary.
        // For a FAB, it's common to always be enabled visually.
        // enabled = ttsInitialized // You might want to remove this or adjust behavior
    ) {
        Icon(
            imageVector = Icons.Filled.PlayArrow,
            contentDescription = "Speak Text" // Content description for accessibility
        )
    }
}
