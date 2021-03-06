package me.aluceps.practicecompose.ui.view

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import androidx.compose.animation.animateAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import me.aluceps.practicecompose.R
import me.aluceps.practicecompose.model.Message

@Composable
fun MessageCard(msg: Message) {
    Row(
        modifier = Modifier
            .padding(all = 8.dp)
            .fillMaxWidth(),
        horizontalArrangement = when (msg) {
            is Message.Me -> Arrangement.End
            is Message.You -> Arrangement.Start
        }
    ) {
        if (msg is Message.You) {
            Image(
                painter = painterResource(R.drawable.ic_launcher_foreground),
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .border(1.5.dp, MaterialTheme.colors.secondary, CircleShape)
            )

            Spacer(modifier = Modifier.width(8.dp))
        }

        var isExpanded by remember { mutableStateOf(false) }
        val surfaceColor: Color by animateAsState(
            if (isExpanded) MaterialTheme.colors.primary else when (msg) {
                is Message.Me -> MaterialTheme.colors.surface
                is Message.You -> MaterialTheme.colors.secondary
            },
        )

        Column(
            modifier = Modifier.clickable { isExpanded = !isExpanded },
            horizontalAlignment = when (msg) {
                is Message.Me -> Alignment.End
                is Message.You -> Alignment.Start
            }
        ) {
            Text(
                text = msg.author,
                color = MaterialTheme.colors.secondaryVariant,
                style = MaterialTheme.typography.subtitle2
            )

            Spacer(modifier = Modifier.height(4.dp))

            Surface(
                shape = MaterialTheme.shapes.medium,
                elevation = 1.dp,
                color = surfaceColor,
                modifier = Modifier
                    .animateContentSize()
                    .padding(1.dp)
            ) {
                Text(
                    text = msg.body,
                    modifier = Modifier.padding(all = 4.dp),
                    style = MaterialTheme.typography.body2,
                    maxLines = if (isExpanded) Int.MAX_VALUE else 1
                )
            }
        }

        if (msg is Message.Me) {
            Spacer(modifier = Modifier.width(8.dp))

            Image(
                painter = painterResource(R.drawable.ic_launcher_foreground),
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .border(1.5.dp, MaterialTheme.colors.secondary, CircleShape)
            )
        }
    }
}

@Preview(uiMode = UI_MODE_NIGHT_NO, showBackground = true)
@Composable
fun PreviewMessageCardYou() {
    MaterialTheme {
        MessageCard(
            msg = Message.You(
                "Colleague",
                "Hey, take a look at Jetpack Compose, it's gread!"
            )
        )
    }
}

@Preview(uiMode = UI_MODE_NIGHT_NO, showBackground = true)
@Composable
fun PreviewMessageCardMe() {
    MaterialTheme {
        MessageCard(msg = Message.Me("Me", "It's available from API 21+ :)"))
    }
}
