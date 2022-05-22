package com.freddydev.transaact

import androidx.compose.foundation.layout.*
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.google.accompanist.permissions.*

@OptIn(ExperimentalPermissionsApi::class)
@Composable
fun RequestPermission(
  permission: String,
  deniedMessage: String = "Give this app a permission to proceed. It's required for the app to work. Please go to settings and grant the permission.",
  rationaleMessage: String = "To use this feature, you need to grant the permission.",
) {
  val permissionState = rememberPermissionState(permission)

  HandleRequest(
    permissionState = permissionState,
    deniedContent = { shouldShowRationale ->
      PermissionDeniedContent(
        deniedMessage = deniedMessage,
        rationaleMessage = rationaleMessage,
        shouldShowRationale = shouldShowRationale,
        onRequestPermission = { permissionState.launchPermissionRequest() }
      )
    },
    content = {
      Content(
        text = "PERMISSION GRANTED!",
        showButton = false
      ) {}
    }
  )


}


@OptIn(ExperimentalPermissionsApi::class)
@Composable
fun HandleRequest(
  permissionState: PermissionState,
  deniedContent: @Composable (Boolean) -> Unit,
  content: @Composable () -> Unit
) {
  if (permissionState.hasPermission) {
    content()
  } else {
    deniedContent(permissionState.shouldShowRationale)
  }

}


@Composable
fun PermissionDeniedContent(
  deniedMessage: String,
  rationaleMessage: String,
  shouldShowRationale: Boolean,
  onRequestPermission: () -> Unit
) {
  if (shouldShowRationale) {
    AlertDialog(
      onDismissRequest = {},
      title = {
        Text(
          text = "Permission Request",
          style = TextStyle(
            fontSize = MaterialTheme.typography.h6.fontSize,
            fontWeight = FontWeight.Bold
          )
        )
      },
      text = {
        Text(text = rationaleMessage)
      },
      confirmButton = {
        Button(onClick = onRequestPermission) {
          Text(text = "Give Permission")
        }
      }
    )
  } else {
    Content(text = deniedMessage, onClick = onRequestPermission)
  }
}

@Composable
fun Content(text: String, showButton: Boolean = true, onClick: () -> Unit) {
  Column(
    modifier = Modifier
      .fillMaxSize()
      .padding(50.dp),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally
  ) {
    Text(text = text, textAlign = TextAlign.Center)
    Spacer(modifier = Modifier.height(12.dp))
    if (showButton) {
      Button(onClick = onClick) {
        Text(text = "Request")
      }
    }
  }
}

