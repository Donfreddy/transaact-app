package com.freddydev.transaact.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable

private val DarkColorPalette = darkColors(
  primary = Purple1,
  primaryVariant = Purple2,
//  secondary = Teal200
)

private val LightColorPalette = lightColors(
  primary = Purple1,
  background = BgColor,
  onBackground = textColor,
  onSurface = textColor
//  primaryVariant = Purple700,
//  secondary = Teal200

  /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

/**
 * A [MaterialTheme] for Transaac.
 */
@Composable
fun TransaactTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
//  val systemUiController = rememberSystemUiController()
//
//  systemUiController.setSystemBarsColor(
//    color = Black
//  )
//  systemUiController.setStatusBarColor(
//    color = Purple1
//  )

  val colors = if (darkTheme) {
    DarkColorPalette
  } else {
    LightColorPalette
  }

  MaterialTheme(
    colors = colors,
    typography = TransaactTypography,
    shapes = TransaactShapes,
    content = content
  )
}

/**
 * Transaact custom Color Palette
 */
@Stable
class TransaactColors()
