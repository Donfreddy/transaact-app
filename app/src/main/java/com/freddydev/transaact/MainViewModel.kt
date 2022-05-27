package com.freddydev.transaact

import android.os.Bundle
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.*
import androidx.savedstate.SavedStateRegistryOwner
import com.freddydev.transaact.data.operator.Operator
import com.freddydev.transaact.data.operator.OperatorPrefsRepo
import com.freddydev.transaact.operator_prefs.OperatorPrefs
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

/**
 * Used to communicate between screens.
 */
class MainViewModel(
  private val operatorPrefsRepo: OperatorPrefsRepo
) : ViewModel() {

  val initialOperatorPrefs = liveData {
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

  companion object {
    fun provideFactory(
      operatorPrefsRepo: OperatorPrefsRepo,
      owner: SavedStateRegistryOwner,
      defaultArgs: Bundle? = null,
    ): AbstractSavedStateViewModelFactory =
      object : AbstractSavedStateViewModelFactory(owner, defaultArgs) {
        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel> create(
          key: String,
          modelClass: Class<T>,
          handle: SavedStateHandle
        ): T {
          return MainViewModel(operatorPrefsRepo) as T
        }
      }
  }
}
