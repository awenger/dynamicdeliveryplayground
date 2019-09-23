package com.github.awenger.dynamicfeature

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class DynamicFeatureReceiver : BroadcastReceiver() {
    override fun onReceive(p0: Context?, p1: Intent?) {
        Log.d("DynFeatureReceiver", "received intent $p1")
    }

}