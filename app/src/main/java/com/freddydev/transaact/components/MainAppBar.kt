package com.freddydev.transaact.components

import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.freddydev.transaact.R
import com.freddydev.transaact.icons.MyIconPack
import com.freddydev.transaact.icons.myiconpack.Menu
import com.freddydev.transaact.theme.JosefinSans
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun MainAppBar(state: ModalBottomSheetState, scope: CoroutineScope) {

    Surface(
      modifier = Modifier.fillMaxWidth(),
      color = MaterialTheme.colors.primary
    ) {
      Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.SpaceBetween
      ) {
        Row(
          modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 10.dp),
          horizontalArrangement = Arrangement.SpaceBetween,
          verticalAlignment = Alignment.CenterVertically
        ) {
          Text("Logo", fontFamily = JosefinSans)
          Text(
            "Bienvenue",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = JosefinSans
          )
          IconButton(onClick = {}) {
            Icon(
              MyIconPack.Menu, modifier = Modifier
                .size(28.dp), contentDescription = "Add"
            )
          }
        }

        OperatorCard(state = state, scope = scope)
      }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun OperatorCard(state: ModalBottomSheetState, scope: CoroutineScope) {
  Card(
    modifier = Modifier
      .fillMaxWidth()
      .padding(16.dp)
      .clip(RoundedCornerShape(CornerSize(12.dp)))
      .clickable {
        scope.launch {
          state.animateTo(targetValue = ModalBottomSheetValue.Expanded, tween(durationMillis = 300))
        }
      },
    elevation = 4.dp,
    // backgroundColor = Color.White.copy(alpha = 0.6f)

  ) {
    Row(
      modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp),
      verticalAlignment = Alignment.CenterVertically,
      horizontalArrangement = Arrangement.Center
    ) {
      OperatorIcon(icon = R.drawable.mtn_momo)
      Spacer(Modifier.width(4.dp))
      Column(
        modifier = Modifier
          .fillMaxWidth()
          .padding(6.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center
      ) {
        Text(
          text = "MTN Money",
          style = MaterialTheme.typography.subtitle1,
        )
        // Click to change operator
        Text(
          text = "Appuyez pour changer d'opérateur",
          style = MaterialTheme.typography.caption.copy(
            color = Color.Gray
          ),
        )
      }
    }
  }
}

@Composable
fun OperatorIcon(icon: Int) {
  Surface(
    modifier = Modifier,
    shape = RoundedCornerShape(corner = CornerSize(10.dp)),
    elevation = 2.dp,
  ) {
    Image(painter = painterResource(icon), contentDescription = "")
  }
}


//@Preview
//@Composable
//fun AppBarPreview() {
//  TransaactTheme {
//    MainAppBar()
//  }
//}
//
//@Preview
//@Composable
//fun AppBarPreviewDark() {
//  TransaactTheme(darkTheme = true) {
//    MainAppBar()
//  }
//}