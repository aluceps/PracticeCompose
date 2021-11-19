package me.aluceps.practicecompose.ui.view

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose.tutorial.SampleData
import me.aluceps.practicecompose.model.Message

@Composable
fun Conversation(messages: List<Message>) {
    LazyColumn {
        items(messages) { message ->
            MessageCard(msg = message)
        }
    }
}

@Preview
@Composable
fun PreviewConversation() {
    MaterialTheme {
        Conversation(SampleData.conversationSample)
    }
}
