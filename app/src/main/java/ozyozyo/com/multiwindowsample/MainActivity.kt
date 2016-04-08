@file:JvmName("MainActivity")
package ozyozyo.com.multiwindowsample

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log

class MainActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "onCreate")

        findViewById(R.id.button).setOnClickListener {
            val i = Intent(this, PopupActivity::class.java)
                    .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                    .addFlags(Intent.FLAG_ACTIVITY_LAUNCH_ADJACENT)
            startActivity(i)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy")
    }

    override fun onMultiWindowChanged(inMultiWindow: Boolean) {
        super.onMultiWindowChanged(inMultiWindow)
        Log.i(TAG, if(inMultiWindow) "in multi window" else "out multi window")
    }

    companion object {
        private const val TAG = ".MainActivity"
    }
}
