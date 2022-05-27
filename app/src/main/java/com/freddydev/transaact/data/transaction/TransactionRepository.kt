package com.freddydev.transaact.data.transaction

import androidx.compose.ui.graphics.Color
import com.freddydev.transaact.icons.MyIconPack
import com.freddydev.transaact.icons.myiconpack.Call
import com.freddydev.transaact.icons.myiconpack.Send
import com.freddydev.transaact.ui.theme.Orange
import com.freddydev.transaact.ui.theme.Purple1
import kotlinx.coroutines.flow.flowOf

object TransactionRepository {

  val transactions = flowOf(
    listOf(
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
  )
}