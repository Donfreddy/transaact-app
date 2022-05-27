package com.freddydev.transaact.ui.theme

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

val TransaactTypography = Typography(
  h1 = TextStyle(
    fontFamily = JosefinSans,
    fontSize = 96.sp,
    fontWeight = FontWeight.Light,
    lineHeight = 117.sp,
    letterSpacing = (-1.5).sp
  ),
  h2 = TextStyle(
    fontFamily = JosefinSans,
    fontSize = 60.sp,
    fontWeight = FontWeight.Light,
    lineHeight = 73.sp,
    letterSpacing = (-0.5).sp
  ),
  h3 = TextStyle(
    fontFamily = JosefinSans,
    fontSize = 48.sp,
    fontWeight = FontWeight.Normal,
    lineHeight = 59.sp
  ),
  h4 = TextStyle(
    fontFamily = JosefinSans,
    fontSize = 30.sp,
    fontWeight = FontWeight.SemiBold,
    lineHeight = 37.sp
  ),
  h5 = TextStyle(
    fontFamily = JosefinSans,
    fontSize = 24.sp,
    fontWeight = FontWeight.SemiBold,
    lineHeight = 29.sp
  ),
  h6 = TextStyle(
    fontFamily = JosefinSans,
    fontSize = 20.sp,
    fontWeight = FontWeight.SemiBold,
    lineHeight = 24.sp
  ),
  subtitle1 = TextStyle(
    fontFamily = JosefinSans,
    fontSize = 16.sp,
    fontWeight = FontWeight.SemiBold,
    lineHeight = 20.sp,
    letterSpacing = 0.5.sp
  ),
  subtitle2 = TextStyle(
    fontFamily = JosefinSans,
    fontSize = 14.sp,
    fontWeight = FontWeight.Medium,
    lineHeight = 17.sp,
    letterSpacing = 0.1.sp
  ),
  body1 = TextStyle(
    fontFamily = JosefinSans,
    fontSize = 16.sp,
    fontWeight = FontWeight.Medium,
    lineHeight = 20.sp,
    letterSpacing = 0.15.sp
  ),
  body2 = TextStyle(
    fontFamily = JosefinSans,
    fontSize = 14.sp,
    fontWeight = FontWeight.SemiBold,
    lineHeight = 20.sp,
    letterSpacing = 0.25.sp
  ),
  button = TextStyle(
    fontFamily = JosefinSans,
    fontSize = 14.sp,
    fontWeight = FontWeight.SemiBold,
    lineHeight = 16.sp,
    letterSpacing = 1.25.sp
  ),
  caption = TextStyle(
    fontFamily = JosefinSans,
    fontSize = 12.sp,
    fontWeight = FontWeight.SemiBold,
    lineHeight = 16.sp,
    letterSpacing = 0.sp
  ),
  overline = TextStyle(
    fontFamily = JosefinSans,
    fontSize = 12.sp,
    fontWeight = FontWeight.SemiBold,
    lineHeight = 16.sp,
    letterSpacing = 1.sp
  )
)