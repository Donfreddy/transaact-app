package com.freddydev.transaact.models

import androidx.compose.ui.graphics.Color

data class Transaction(
  val id: Int,
  val type: String,
  val icon: Int?,
  val iconColor: Color?,
  val color: Color,
  val operator: Array<String>,
) {
  override fun equals(other: Any?): Boolean {
    if (this === other) return true
    if (javaClass != other?.javaClass) return false

    other as Transaction

    if (id != other.id) return false
    if (type != other.type) return false
    if (icon != other.icon) return false
    if (iconColor != other.iconColor) return false
    if (color != other.color) return false
    if (!operator.contentEquals(other.operator)) return false

    return true
  }

  override fun hashCode(): Int {
    var result = id
    result = 31 * result + type.hashCode()
    result = 31 * result + (icon ?: 0)
    result = 31 * result + (iconColor?.hashCode() ?: 0)
    result = 31 * result + color.hashCode()
    result = 31 * result + operator.contentHashCode()
    return result
  }
}

// Declare a list of transactions
val transactions = listOf(
  Transaction(
    id = 1,
    type = "Transfert d'argent",
    icon = null,
    iconColor = null,
    color = Color(0xFFF44336),
    operator = arrayOf("Orange", "MTN")
  ),
  Transaction(
    id = 2,
    type = "Achat de crédit téléphonique",
    icon = null,
    iconColor = null,
    color = Color(0xFFF44336),
    operator = arrayOf("Orange", "MTN")
  ),
//  Transaction(
//    id = 3,
//    type = "Paiement des factures",
//    icon = null,
//    iconColor = null,
//    color = Color(0xFFF44336),
//    operator = arrayOf("Orange", "MTN")
//  ),
//  Transaction(
//    id = 4,
//    type = "Opérations bancaires",
//    icon = null,
//    iconColor = null,
//    color = Color(0xFFF44336),
//    operator = arrayOf("Orange", "MTN")
//  ),
//  Transaction(
//    id = 5,
//    type = "Paiement marchant",
//    icon = null,
//    iconColor = null,
//    color = Color(0xFFF44336),
//    operator = arrayOf("Orange", "MTN")
//  ),
)