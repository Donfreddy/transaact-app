package com.freddydev.transaact.data.transaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import com.freddydev.transaact.icons.MyIconPack
import com.freddydev.transaact.icons.myiconpack.*
import com.freddydev.transaact.theme.*

data class Transaction(
  val id: Int,
  val type: String,
  val icon: ImageVector,
  val iconColor: Color,
  val color: Color,
)

// Declare a list of transactions
val transactions = listOf(
  Transaction(
    id = 1,
    type = "Transfert d'argent",
    icon = MyIconPack.Send,
    iconColor = Purple1,
    color = Color(0xFFDCDFFF),
  ),
  Transaction(
    id = 2,
    type = "Achat de crédit téléphonique",
    icon = MyIconPack.Call,
    iconColor = Orange,
    color = Color(0xFFFFF3E8),
  ),
//  Transaction(
//    id = 3,
//    type = "Paiement des factures",
//    icon = MyIconPack.Paper,
//    iconColor = Green1,
//    color = Color(0xFFDDFFEC),
//  ),
//  Transaction(
//    id = 4,
//    type = "Opérations bancaires",
//    icon = MyIconPack.Wallet,
//    iconColor = Red,
//    color = Color(0xFFFFEBEB),
//  ),
//  Transaction(
//    id = 5,
//    type = "Paiement marchant",
//    icon = MyIconPack.Frame,
//    iconColor = Blue1,
//    color = Color(0xFFDCEBFF),
//  ),
)