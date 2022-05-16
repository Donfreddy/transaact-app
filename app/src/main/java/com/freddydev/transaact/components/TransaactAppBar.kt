package com.freddydev.transaact.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.freddydev.transaact.theme.TransaactTheme

@Composable
fun TransaactAppBar() {
}


@Preview
@Composable
fun AppBarPreview() {
  TransaactTheme {
    TransaactAppBar()
  }
}

@Preview
@Composable
fun AppBarPreviewDark() {
  TransaactTheme(darkTheme = true) {
    TransaactAppBar()
  }
}