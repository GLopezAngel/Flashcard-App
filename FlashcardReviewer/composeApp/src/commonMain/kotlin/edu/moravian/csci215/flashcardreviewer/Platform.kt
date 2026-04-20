package edu.moravian.csci215.flashcardreviewer

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform