package com.freddydev.transaact.components

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
