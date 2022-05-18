package com.freddydev.transaact

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.tween
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.freddydev.transaact.components.MainAppBar
import com.freddydev.transaact.components.bottomsheet.ChangeOperator
import com.freddydev.transaact.icons.MyIconPack
import com.freddydev.transaact.icons.myiconpack.Menu
import com.freddydev.transaact.theme.TransaactTheme
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterialApi::class)
class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      TransaactApp {
        ChangeOperator { state, scope ->
          Scaffold(
            topBar = { MainAppBar(state, scope) }
          ) {
            MainContent()
          }
        }
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

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MainContent() {
  val data = listOf(
    "Item 1",
    "Item 2",
    "Item 3",
    "Item 4",
    "Item 5",
    "Item 6",
    "Item 7",
    "Item 8",
    "Item 9",
    "Item 10",
    "Item 11",
    "Item 12",
    "Item 13",
    "Item 14",
    "Item 15",
    "Item 16",
    "Item 17",
    "Item 18",
    "Item 19",
    "Item 20"
  )
  Surface(
    modifier = Modifier
      .fillMaxWidth()
      .padding(top = 0.dp),
  ) {
    LazyVerticalGrid(
      cells = GridCells.Fixed(2),
      state = LazyListState(
        firstVisibleItemIndex = 0,
        firstVisibleItemScrollOffset = 10,
      ),
      contentPadding = PaddingValues(8.dp)
    ) {
      itemsIndexed(data) { _, item ->
        TranslationCard(item = item)
      }
    }
  }
}

@Composable
fun TranslationCard(item: String) {

  Card(
    modifier = Modifier
      .padding(6.dp)
      .clip(RoundedCornerShape(CornerSize(12.dp)))
      .clickable {},
    elevation = 4.dp,
    backgroundColor = Color.LightGray
  ) {
    Column(
      modifier = Modifier.padding(34.dp),
      verticalArrangement = Arrangement.Center,
      horizontalAlignment = Alignment.CenterHorizontally
    ) {
      Icon(
        MyIconPack.Menu, modifier = Modifier
          .size(30.dp), contentDescription = "Add"
      )
      Text(
        text = item,
        fontSize = 24.sp,
        textAlign = TextAlign.Center,
        // modifier = Modifier.padding(24.dp)
      )
    }
  }
}

