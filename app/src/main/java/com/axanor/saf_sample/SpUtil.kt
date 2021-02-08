package com.axanor.saf_sample

import android.net.Uri



/**
 * 6/4/19
 * @author Pavel Borzenkov
 */


object SpUtil {

    const val PREFS_FILENAME = "com.device.myapplication.prefs"
    const val FOLDER_URI = "folder_uri"

    @JvmStatic
    fun storeString(key: String, text: String) {
        val editor = App.instance.getSharedPreferences(PREFS_FILENAME, 0)!!.edit()
        editor.putString(key, text)
        editor.commit()
    }

    @JvmStatic
    fun getString(key: String, def:String): String {
        val text = App.instance.getSharedPreferences(PREFS_FILENAME, 0).getString(key, def)?:""
        return text
    }


}
