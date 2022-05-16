package com.freddydev.transaact

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.freddydev.transaact.ui.theme.TransaactTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      TransaactApp {

      }
    }
  }
}

@Composable
fun TransaactApp(content: @Composable () -> Unit) {
  TransaactTheme {
    content()
  }
}

@Composable
fun MainContent() {
  CustomTopBar() {

  }
}

@Composable
fun ToolbarWidget() {
  Scaffold(
    topBar = { MyTopAppBar() },
    drawerContent = {
      Text("Drawer title", modifier = Modifier.padding(16.dp))
      Divider()

      // Drawer items
    }
  ) {
    Surface(color = MaterialTheme.colors.background) {
      Text("Hello World")
    }
  }
}

@Composable
fun MyTopAppBar(
) {
  val scaffoldState = rememberScaffoldState()
  val scope = rememberCoroutineScope()
  TopAppBar(
    // modifier = Modifier.height(100.dp),
    title = { Text(text = "Transaact", fontWeight = FontWeight.Bold) },
    actions = {
      Row(
        horizontalArrangement = Arrangement.End
      ) {
        IconButton(onClick = {
          scope.launch {
            scaffoldState.drawerState.apply {
              if (isClosed) open() else close()
            }
          }
        }) {
          Icon(Icons.Default.Add, contentDescription = "Add")
        }
        IconButton(onClick = {}) {
          Icon(Icons.Default.MoreVert, contentDescription = "Add")
        }
      }
    }
  )
}

@Composable
fun CustomTopBar(modifier: Modifier = Modifier, content: @Composable () -> Unit) {
  Layout(
    modifier = modifier,
    content = content
  ) { measurables, constraints ->
    layout(constraints.maxWidth, constraints.maxHeight) {

    }
  }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
  TransaactApp {
    MainContent()
  }
}