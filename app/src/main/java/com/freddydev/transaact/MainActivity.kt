package com.freddydev.transaact

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.freddydev.transaact.components.MainAppBar
import com.freddydev.transaact.icons.MyIconPack
import com.freddydev.transaact.icons.myiconpack.Share
import com.freddydev.transaact.models.Operator
import com.freddydev.transaact.theme.JosefinSans
import com.freddydev.transaact.theme.TransaactTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      TransaactApp {
        MainContent()
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
  MainAppBar()

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
fun OperatorIcon() {
  Surface(
    modifier = Modifier,
    shape = RoundedCornerShape(corner = CornerSize(10.dp)),
    elevation = 2.dp,
  ) {
    Image(painter = painterResource(id = R.drawable.mtn_momo), contentDescription = "")
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
          Icon(MyIconPack.Share, contentDescription = "Add")
        }
        IconButton(onClick = {}) {
          Icon(Icons.Default.MoreVert, contentDescription = "Add")
        }
      }
    }
  )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
  TransaactApp {
    //MainContent()
  }
}