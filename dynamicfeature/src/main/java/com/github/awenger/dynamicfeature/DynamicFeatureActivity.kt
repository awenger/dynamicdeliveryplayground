package com.github.awenger.dynamicfeature

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_dynamic_feature.*


class DynamicFeatureActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamic_feature)

        send_core_broadcast_button.setOnClickListener {
            val i = Intent("$packageName.core_receiver")
            i.setPackage(packageName)
            sendBroadcast(i)
        }

        send_dynamic_feature_broadcast.setOnClickListener {
            val i = Intent("$packageName.dynamic_module_receiver")
            i.setPackage(packageName)
            sendBroadcast(i)
        }
    }
}
