package com.freddydev.transaact.components.bottomsheet

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.freddydev.transaact.OperatorIcon
import com.freddydev.transaact.models.Transaction
import com.freddydev.transaact.models.transactions
import com.freddydev.transaact.theme.JosefinSans
import kotlinx.coroutines.CoroutineScope

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ChangeOperator(
  content: @Composable (
    state: ModalBottomSheetState,
    scope: CoroutineScope
  ) -> Unit,
) {
  val sate = rememberModalBottomSheetState(initialValue = ModalBottomSheetValue.Hidden)
  val scope = rememberCoroutineScope()

  ModalBottomSheetLayout(
    sheetState = sate,
    sheetBackgroundColor = Color.White,
    sheetShape = RoundedCornerShape(topStart = 15.dp, topEnd = 15.dp),
    sheetElevation = 5.dp,
    sheetContent = {
      Column(
//        modifier = Modifier
//          .fillMaxWidth()
//          .padding(16.dp),
//        horizontalAlignment = Alignment.CenterHorizontally
      ) {
        Text(
          text = "Liste des opérateurs disponibles",
          modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
          textAlign = TextAlign.Center,
          fontFamily = JosefinSans,
          color = Color.Gray,
        )
        Divider(
          modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
          color = Color.Gray.copy(alpha = 0.2f),
        )
        LazyColumn(
          modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp),
        ) {
          items(transactions.size) { index ->
            ChangeOperatorCard(transaction = transactions[index])
          }
        }
      }
    },
    content = { content(state = sate, scope = scope) },
  )
}

@Composable
fun ChangeOperatorCard(transaction: Transaction) {

  Card(
    modifier = Modifier
      .fillMaxWidth()
      .padding(vertical = 4.dp)
      .clip(RoundedCornerShape(CornerSize(12.dp)))
      .clickable {}
      .shadow(elevation = 4.dp),
    backgroundColor = Color.Green,
//    elevation = 4.dp,
  ) {

    Row(
      modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp),
      verticalAlignment = Alignment.CenterVertically,
      horizontalArrangement = Arrangement.Center,
    ) {
      OperatorIcon()
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
          style = MaterialTheme.typography.caption.copy(
            fontWeight = FontWeight.Bold,
          )
        )
        // Click to change operator
        Text(
          text = "Sélectionner",
          style = MaterialTheme.typography.body2,
        )
      }
    }
  }
}
