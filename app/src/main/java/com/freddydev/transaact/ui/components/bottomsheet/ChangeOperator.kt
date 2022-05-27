package com.freddydev.transaact.ui.components.bottomsheet

import androidx.compose.foundation.border
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.freddydev.transaact.ui.components.OperatorIcon
import com.freddydev.transaact.data.operator.Operator
import com.freddydev.transaact.data.operator.OperatorPrefsRepo
import com.freddydev.transaact.data.operator.operators
import com.freddydev.transaact.ui.theme.White
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ChangeOperator(
  content: @Composable (
    state: ModalBottomSheetState,
    scope: CoroutineScope
  ) -> Unit,
) {
  val mContext = LocalContext.current
  val dataStore = OperatorPrefsRepo(mContext)
  val sate = rememberModalBottomSheetState(initialValue = ModalBottomSheetValue.Hidden)
  val scope = rememberCoroutineScope()

  ModalBottomSheetLayout(
    sheetState = sate,
    sheetBackgroundColor = White,
    // scrimColor = Color.Transparent,
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
          style = MaterialTheme.typography.body2.copy(
            color = Color.Gray,
          ),
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
          items(operators.size) { index ->
            val operator = operators[index]
            ChangeOperatorCard(
              operator = operator,
              onClick = {
                scope.launch {
                  dataStore.saveOperatorPrefs(operator)
                  sate.hide()
                }
              })
          }
        }
      }
    },
    content = { content(state = sate, scope = scope) },
  )
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ChangeOperatorCard(operator: Operator, onClick: () -> Unit = {}) {
  Card(
    modifier = Modifier
      .fillMaxWidth()
      .padding(vertical = 4.dp)
      .clip(RoundedCornerShape(CornerSize(12.dp)))
      .border(
        width = 1.dp,
        color = Color.Gray.copy(alpha = 0.2f),
        shape = RoundedCornerShape(CornerSize(12.dp)),
      )
      .clickable { onClick() },
    elevation = 4.dp,
  ) {
    Row(
      modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp),
      verticalAlignment = Alignment.CenterVertically,
      horizontalArrangement = Arrangement.Center,
    ) {
      OperatorIcon(icon = operator.icon)
      Spacer(Modifier.width(4.dp))
      Column(
        modifier = Modifier
          .fillMaxWidth()
          .padding(6.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center
      ) {
        Text(
          text = operator.name,
          style = MaterialTheme.typography.subtitle1,
        )
        Text(
          text = "Sélectionner", // 'Choisi'
          style = MaterialTheme.typography.caption.copy(
            color = Color.Gray
          ),
        )
      }
    }
  }
}
