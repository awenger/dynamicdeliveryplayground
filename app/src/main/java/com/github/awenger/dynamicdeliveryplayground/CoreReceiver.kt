package com.github.awenger.dynamicdeliveryplayground

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class CoreReceiver : BroadcastReceiver() {
    override fun onReceive(p0: Context?, p1: Intent?) {
        Log.d("CoreReceiver", "got intent $p1")
    }

}