package com.freddydev.transaact.icons

import androidx.compose.ui.graphics.vector.ImageVector
import com.freddydev.transaact.icons.myiconpack.Call
import com.freddydev.transaact.icons.myiconpack.Close
import com.freddydev.transaact.icons.myiconpack.Frame
import com.freddydev.transaact.icons.myiconpack.Home
import com.freddydev.transaact.icons.myiconpack.Infosquare
import com.freddydev.transaact.icons.myiconpack.Message
import com.freddydev.transaact.icons.myiconpack.Notification
import com.freddydev.transaact.icons.myiconpack.Paper
import com.freddydev.transaact.icons.myiconpack.Paperplus
import com.freddydev.transaact.icons.myiconpack.Playstore
import com.freddydev.transaact.icons.myiconpack.Plus
import com.freddydev.transaact.icons.myiconpack.Profile
import com.freddydev.transaact.icons.myiconpack.Send
import com.freddydev.transaact.icons.myiconpack.Setting
import com.freddydev.transaact.icons.myiconpack.Share
import com.freddydev.transaact.icons.myiconpack.Ticket
import com.freddydev.transaact.icons.myiconpack.Wallet
import com.freddydev.transaact.icons.myiconpack._2user
import com.freddydev.transaact.icons.myiconpack.Menu
import kotlin.collections.List as ____KtList

public object MyIconPack

private var __AllIcons: ____KtList<ImageVector>? = null

public val MyIconPack.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Playstore, Plus, Call, Menu, Notification, Share, _2user, Home,
        Infosquare, Wallet, Message, Paper, Ticket, Setting, Send, Profile, Paperplus, Frame, Close)
    return __AllIcons!!
  }
