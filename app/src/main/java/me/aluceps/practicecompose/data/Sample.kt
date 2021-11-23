package me.aluceps.practicecompose.data

import me.aluceps.practicecompose.model.Message

object SampleData {
    // Sample conversation data
    val conversationSample = listOf(
        Message.You(
            "Colleague",
            "Test...Test...Test..."
        ),
        Message.Me(
            "Me",
            "List of Android versions:\n" +
                    "Android KitKat (API 19)\n" +
                    "Android Lollipop (API 21)\n" +
                    "Android Marshmallow (API 23)\n" +
                    "Android Nougat (API 24)\n" +
                    "Android Oreo (API 26)\n" +
                    "Android Pie (API 28)\n" +
                    "Android 10 (API 29)\n" +
                    "Android 11 (API 30)\n" +
                    "Android 12 (API 31)\n"
        ),
        Message.You(
            "Colleague",
            "I think Kotlin is my favorite programming language.\n" +
                    "It's so much fun!"
        ),
        Message.You(
            "Colleague",
            "Searching for alternatives to XML layouts..."
        ),
        Message.You(
            "Colleague",
            "Hey, take a look at Jetpack Compose, it's great!\n" +
                    "It's the Android's modern toolkit for building native UI." +
                    "It simplifies and accelerates UI development on Android." +
                    "Less code, powerful tools, and intuitive Kotlin APIs :)"
        ),
        Message.Me(
            "Me",
            "It's available from API 21+ :)"
        ),
        Message.You(
            "Colleague",
            "Writing Kotlin for UI seems so natural, Compose where have you been all my life?"
        ),
        Message.Me(
            "Me",
            "Android Studio next version's name is Arctic Fox"
        ),
        Message.You(
            "Colleague",
            "Android Studio Arctic Fox tooling for Compose is top notch ^_^"
        ),
        Message.You(
            "Colleague",
            "I didn't know you can now run the emulator directly from Android Studio"
        ),
        Message.You(
            "Colleague",
            "Compose Previews are great to check quickly how a composable layout looks like"
        ),
        Message.You(
            "Colleague",
            "Previews are also interactive after enabling the experimental setting"
        ),
        Message.You(
            "Colleague",
            "Have you tried writing build.gradle with KTS?"
        ),
    )
}
