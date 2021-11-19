package me.aluceps.practicecompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.ui.platform.setContent
import me.aluceps.practicecompose.model.Message
import me.aluceps.practicecompose.ui.view.MessageCard

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                MessageCard(Message("Android", "Jetpack Compose"))
            }
        }
    }
}
