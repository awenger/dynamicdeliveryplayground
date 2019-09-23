package com.github.awenger.dynamicdeliveryplayground

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        start_dynamic_feature_activity_button.setOnClickListener {
            val i = Intent(
                this,
                Class.forName("com.github.awenger.dynamicfeature.DynamicFeatureActivity")
            )
            startActivity(i)
        }

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
