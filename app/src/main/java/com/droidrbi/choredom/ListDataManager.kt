package com.droidrbi.choredom

import android.content.Context
import androidx.preference.PreferenceManager


class ListDataManager(private val context: Context) {

    fun saveList(list: TaskList){
        val sharedPrefs = PreferenceManager.getDefaultSharedPreferences(context).edit()
        // PreferenceManager does not save arraylists but saves sets

        sharedPrefs.putStringSet(list.name, list.tasks.toHashSet())
        sharedPrefs.apply()
    }

}