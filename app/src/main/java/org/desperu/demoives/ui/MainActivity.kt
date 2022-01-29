package org.desperu.demoives.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.unity3d.player.UnityPlayer.UnitySendMessage
import org.desperu.demoives.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val unityButton = findViewById<Button>(R.id.unity_button)
        unityButton.setOnClickListener {
            startActivity(Intent(this, UnityActivity::class.java))
        }
    }
}
