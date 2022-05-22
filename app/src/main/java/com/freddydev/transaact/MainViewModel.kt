package com.freddydev.transaact

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import androidx.lifecycle.viewModelScope
import com.freddydev.transaact.data.operator.Operator
import com.freddydev.transaact.data.operator.OperatorPrefsRepo
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

/**
 * Used to communicate between screens.
 */
class MainViewModel(
  private val operatorPrefsRepo: OperatorPrefsRepo
) : ViewModel() {

  val operatorPrefsFlow = operatorPrefsRepo.operatorPrefsFlow
  val initialSetupEvent = liveData {
    emit(operatorPrefsRepo.fetchInitialPreferences())
  }

  private val _drawerShouldBeOpened = MutableStateFlow(false)
  val drawerShouldBeOpened: StateFlow<Boolean> = _drawerShouldBeOpened

  fun openDrawer() {
    _drawerShouldBeOpened.value = true
  }

  fun resetOpenDrawerAction() {
    _drawerShouldBeOpened.value = false
  }

  // Save operator preferences
  fun saveOperatorPrefs(operatorPrefs: Operator) {
    println(operatorPrefs)
    viewModelScope.launch {
      operatorPrefsRepo.saveOperatorPrefs(operatorPrefs)
    }
  }
}


//class MainViewModelFactory(private val operatorPrefsRepo: OperatorPrefsRepo) : ViewModelProvider.Factory {
//
//  override fun <T : ViewModel> create(modelClass: Class<T>): T {
//    if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
//      @Suppress("UNCHECKED_CAST")
//      return MainViewModel(operatorPrefsRepo) as T
//    }
//    throw IllegalArgumentException("Unknown ViewModel class")
//  }
//}