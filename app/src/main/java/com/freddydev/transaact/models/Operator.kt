package com.freddydev.transaact.models

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Immutable
import com.freddydev.transaact.R

@Immutable
data class Operator(
  val id: Int,
  val name: String,
  @DrawableRes val logo: Int?,
)

// define the operator list
val operators = listOf(
  Operator(id = 1, name = "MTN Money", logo = R.drawable.mtn_momo),
  Operator(id = 2, name = "Orange Money", logo = R.drawable.orange_money),
)
