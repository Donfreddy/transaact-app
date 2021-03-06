package com.freddydev.transaact.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun InputField(
  modifier: Modifier = Modifier,
  valueState: MutableState<String>,
  labelId: String,
  enabled: Boolean = true,
  isSingleLined: Boolean = true,
  keyBoardType: KeyboardType = KeyboardType.Number,
  imeAction: ImeAction = ImeAction.Next,
  onAction: KeyboardActions = KeyboardActions.Default
) {
  OutlinedTextField(
    value = valueState.value,
    label = { Text(text = labelId) },
    leadingIcon = {
      Icon(
        imageVector = Icons.Rounded.Phone,
        contentDescription = "Money Icon"
      )
    },
    onValueChange = { valueState.value = it },
    modifier = modifier
      .fillMaxWidth()
      .padding(bottom = 10.dp, start = 10.dp, end = 10.dp),
    enabled = enabled,
    singleLine = isSingleLined,
    textStyle = TextStyle(fontSize = 18.sp, color = MaterialTheme.colors.onBackground),
    keyboardOptions = KeyboardOptions(
      keyboardType = keyBoardType,
      imeAction = imeAction
    ),
    keyboardActions = onAction
  )
}
