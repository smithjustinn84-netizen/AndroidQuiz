package com.example.androidquiz.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = MediumGray,
    secondary = DarkSurface,
    tertiary = DarkSurface,
    background = AlmostBlack,
    surface = DarkSurface,
    onPrimary = AlmostBlack, // Text/icons on top of primary color
    onSecondary = PureWhite, // Text/icons on top of secondary color
    onTertiary = PureWhite,  // Text/icons on top of tertiary color
    onBackground = PureWhite, // Text/icons on top of background color
    onSurface = PureWhite    // Text/icons on top of surface color (e.g., cards)
)

private val LightColorScheme = lightColorScheme(
    primary = MediumGray,
    secondary = SubtleGray,
    tertiary = SubtleGray,
    background = LightBackground,
    surface = PureWhite,
    onPrimary = PureWhite,   // Text/icons on top of primary color
    onSecondary = AlmostBlack, // Text/icons on top of secondary color
    onTertiary = AlmostBlack,  // Text/icons on top of tertiary color
    onBackground = AlmostBlack, // Text/icons on top of background color
    onSurface = AlmostBlack    // Text/icons on top of surface color (e.g., cards)
)

@Composable
fun AndroidQuizTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true, // Set to false if you want to force the minimalistic theme
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography, // Assuming Typography.kt is defined and suitable
        content = content
    )
}
