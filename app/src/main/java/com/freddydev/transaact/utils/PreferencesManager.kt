package com.freddydev.transaact.utils

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
//import com.google.gson.GsonBuilder

//object PreferencesManager {

//  //Shared Preference field used to save and retrieve JSON string
//  lateinit var preferences: SharedPreferences
//
//  //Name of Shared Preference file
//  private const val SDN_SHARE_PREF = "sdn_share_pref"
//
//  /**
//   * Call this first before retrieving or saving object.
//   *
//   * @param application Instance of application class
//   */
//  fun with(application: Application): SharedPreferences {
//    preferences = application.getSharedPreferences(
//      SDN_SHARE_PREF, Context.MODE_PRIVATE
//    )
//
//    return preferences
//  }
//
//  /**
//   * Saves object into the Preferences.
//   *
//   * @param `object` Object of model class (of type [T]) to save
//   * @param key Key with which Shared preferences to
//   **/
//  fun <T> put(`object`: T, key: String) {
//    //Convert object to JSON String.
//    val jsonString = GsonBuilder().create().toJson(`object`)
//    //Save that String in SharedPreferences
//    preferences.edit().putString(key, jsonString).apply()
//  }
//
//  /**
//   * Used to retrieve object from the Preferences.
//   *
//   * @param key Shared Preference key with which object was saved.
//   **/
//  inline fun <reified T> get(key: String): T? {
//    //We read JSON String which was saved.
//    val value = preferences.getString(key, null)
//    //JSON String was found which means object can be read.
//    //We convert this JSON String to model object. Parameter "c" (of
//    //type Class < T >" is used to cast.
//    return GsonBuilder().create().fromJson(value, T::class.java)
//  }
//}