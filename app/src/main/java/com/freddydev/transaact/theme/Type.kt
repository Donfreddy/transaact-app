package com.freddydev.transaact.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.freddydev.transaact.R

// Set fonts
val JosefinSans = FontFamily(
  fonts = listOf(
    Font(R.font.josefin_sans_regular),
    Font(R.font.josefin_sans_medium, FontWeight.W500),
    Font(R.font.josefin_sans_semibold, FontWeight.W600)
  )
)

// Set of Material typography styles to start with
val Typography = Typography(
  defaultFontFamily = JosefinSans,
  body1 = TextStyle(
    fontFamily = JosefinSans,
    fontWeight = FontWeight.Normal,
    fontSize = 16.sp
  )
  /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)