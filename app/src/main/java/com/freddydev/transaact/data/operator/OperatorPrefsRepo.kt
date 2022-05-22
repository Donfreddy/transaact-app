package com.freddydev.transaact.data.operator

import android.util.Log
import androidx.datastore.core.DataStore
import com.freddydev.transaact.operator_prefs.OperatorPrefs
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.first
import java.io.IOException

/**
 * Class that handles saving and retrieving operator preferences
 */
class OperatorPrefsRepo(private val operatorPrefsStore: DataStore<OperatorPrefs>) {

  val operatorPrefsFlow: Flow<OperatorPrefs> = operatorPrefsStore.data
    .catch { exception ->
      // dataStore.data throws an IOException when an error is encountered when reading data
      if (exception is IOException) {
        Log.e("OperatorPrefsRepo", "Error reading operator preferences.", exception)
        emit(OperatorPrefs.getDefaultInstance())
      } else {
        throw exception
      }
    }

  /**
   * Saves the operator preferences
   * @param operatorPrefs the operator preferences to save
   */
  suspend fun saveOperatorPrefs(operatorPrefs: Operator) {
    operatorPrefsStore.updateData { operator ->
      operator.toBuilder()
        .setId(operatorPrefs.id)
        .setName(operatorPrefs.name)
        .setIcon(operatorPrefs.icon)
        .build()
    }
  }

  suspend fun fetchInitialPreferences() = operatorPrefsStore.data.first()
}