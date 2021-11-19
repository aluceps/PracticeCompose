package me.aluceps.practicecompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.ui.platform.setContent
import com.example.compose.tutorial.SampleData
import me.aluceps.practicecompose.ui.view.Conversation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Conversation(SampleData.conversationSample)
            }
        }
    }
}
