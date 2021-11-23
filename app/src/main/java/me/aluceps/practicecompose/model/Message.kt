package me.aluceps.practicecompose.model

sealed class Message {
    abstract val author: String
    abstract val body: String

    data class Me(override val author: String, override val body: String) : Message()
    data class You(override val author: String, override val body: String) : Message()
}
