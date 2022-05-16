package com.freddydev.transaact.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.freddydev.transaact.theme.TransaactTheme

@Composable
fun TransaactDrawer() {

  Spacer(Modifier.height(16.dp))
  DrawerHeader()
  DividerItem()
  DrawerItemHeader(text = "Transaact")
  DrawerItemHeader(text = "Budget")
}

@Composable
private fun DrawerHeader() {
  Row(modifier = Modifier.padding(16.dp), verticalAlignment = Alignment.CenterVertically) {
    Text(text = "logo")
    Text(text = "Transaact", modifier = Modifier.padding(start = 8.dp))
  }
}

@Composable
fun DividerItem(modifier: Modifier = Modifier) {
  Divider(
    modifier = modifier,
    color = MaterialTheme.colors.onSurface.copy(alpha = 0.12f)
  )
}

@Composable
private fun DrawerItemHeader(text: String) {
  Box(
    modifier = Modifier
      .heightIn(min = 52.dp)
      .padding(horizontal = 28.dp),
    contentAlignment = Alignment.CenterStart
  ) {
    Text(
      text,
      style = MaterialTheme.typography.body2,
      color = MaterialTheme.colors.onSurface
    )
  }
}

@Preview
@Composable
fun DrawerPreview() {
  TransaactTheme {
    Surface {
      Column {
        TransaactDrawer()
      }
    }
  }
}

@Preview
@Composable
fun DrawerPreviewDark() {
  TransaactTheme(darkTheme = true) {
    Surface {
      Column {
        TransaactDrawer()
      }
    }
  }
}