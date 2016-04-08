@file:JvmName("PopupActivity")
package ozyozyo.com.multiwindowsample

import android.app.Activity
import android.os.Bundle
import android.util.Log

class PopupActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_popup)
        Log.i(TAG, "onCreate")

        findViewById(R.id.close).setOnClickListener { finish() }
        findViewById(R.id.pip).setOnClickListener {
            enterPictureInPicture()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume")
        Log.i(TAG, if(inPictureInPicture()) "inPiP" else "not inPiP");
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

    override fun onPictureInPictureChanged(inPictureInPicture: Boolean) {
        super.onPictureInPictureChanged(inPictureInPicture)
        Log.i(TAG, if(inPictureInPicture) "in PiP" else "out PiP")
    }

    companion object {
        private const val TAG = ".MainActivity"
    }
}
