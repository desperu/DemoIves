package org.desperu.demoives.ui

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.os.PersistableBundle
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.unity3d.player.UnityPlayer
import com.unity3d.player.UnityPlayerActivity
import org.desperu.demoives.R
import org.desperu.demoives.extension.design.bindView
import org.desperu.demoives.utils.CommunicationBridge.callToUnityWithMessage
import org.desperu.demoives.utils.CommunicationBridge.callToUnityWithNoMessage

class UnityActivity : UnityPlayerActivity() {

    // FOR DATA
    private var toggle = false

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_unity)
    }

    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {
        addButton()

        return super.onCreateView(name, context, attrs)
    }

    private fun addButton() {
        val button = Button(this)
        button.layoutParams = ConstraintLayout.LayoutParams(
            ConstraintLayout.LayoutParams.WRAP_CONTENT,
            ConstraintLayout.LayoutParams.WRAP_CONTENT)
        button.text = "Call with no message"
        button.setOnClickListener {
            if(toggle) {
                button.text = "Call with Message"
                callToUnityWithNoMessage()
            } else {
                button.text = "Call with no message"
                callToUnityWithMessage("Hello Unity!")
            }
            toggle = !toggle
        }

        button.setBackgroundColor(Color.GREEN)
        button.setTextColor(Color.RED)
        mUnityPlayer.addView(button)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finishAffinity()
    }
}