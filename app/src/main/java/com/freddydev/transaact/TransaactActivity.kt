package com.freddydev.transaact

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import com.freddydev.transaact.components.MainAppBar
import com.freddydev.transaact.components.bottomsheet.ChangeOperator
import com.freddydev.transaact.data.transaction.Transaction
import com.freddydev.transaact.data.transaction.transactions
import com.freddydev.transaact.theme.TransaactTheme

@OptIn(ExperimentalMaterialApi::class)
class TransaactActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    // WindowCompat.setDecorFitsSystemWindows(window, false)
    setContent {
      TransaactApp {
        ChangeOperator { state, scope ->
          Scaffold(
            topBar = { MainAppBar(state, scope) },
            drawerContent = {
              DrawerContent()
            },
          ) {
            MainContent()
          }
        }
      }
    }
  }

  @Composable
  fun DrawerContent() {
    // TODO("Not yet implemented")
  }

  // Render UI
  private fun renderUi()  = setContent {
    val showSettingsDialog = remember { mutableStateOf(false) }
    TransaactTheme {
      Surface(color = MaterialTheme.colors.background) {
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

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MainContent() {
  Surface(
    modifier = Modifier.fillMaxWidth()
  ) {
    LazyVerticalGrid(
      cells = GridCells.Fixed(2),
      contentPadding = PaddingValues(8.dp),
      modifier = Modifier.fillMaxHeight()
    ) {
      items(transactions.size) { index ->
        TranslationCard(transaction = transactions[index])
      }
    }
  }
}

@Composable
fun TranslationCard(transaction: Transaction) {

  BoxWithConstraints(
    modifier = Modifier
      .padding(8.dp)
      .aspectRatio(1f)
      .clip(RoundedCornerShape(CornerSize(12.dp)))
      .background(transaction.color)
      .clickable(
        onClickLabel = "Clicked",
        role = Role.Button,
        onClick = {}
      ),
    contentAlignment = Alignment.Center
  ) {
    Column(
      modifier = Modifier.padding(10.dp),
      verticalArrangement = Arrangement.Center,
      horizontalAlignment = Alignment.CenterHorizontally
    ) {
      Icon(
        transaction.icon,
        modifier = Modifier.size(28.dp),
        tint = transaction.iconColor,
        contentDescription = ""
      )
      Spacer(modifier = Modifier.height(5.dp))
      Text(
        text = transaction.type,
        style = MaterialTheme.typography.body1,
        textAlign = TextAlign.Center,
        // modifier = Modifier.padding(24.dp)
      )
    }
  }
}

