package com.freddydev.transaact.ui.components

import androidx.compose.material.DrawerState
import androidx.compose.material.DrawerValue
import androidx.compose.material.rememberDrawerState
import androidx.compose.runtime.Composable
import com.freddydev.transaact.ui.theme.TransaactTheme

@Composable
fun TransaactScaffold(
  drawerState: DrawerState = rememberDrawerState(initialValue = DrawerValue.Closed),
//  onProfileClicked: (String) -> Unit,
//  onChatClicked: (String) -> Unit,
  content: @Composable () -> Unit
) {
  TransaactTheme {
//    ModalDrawer(
//      drawerState = drawerState,
//      // drawerContent = { MainDrawer() },
//      content = content
//    )
  }
}