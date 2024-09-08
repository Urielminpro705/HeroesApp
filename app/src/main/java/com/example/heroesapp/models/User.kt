package com.example.heroesapp.models

data class User(val email : String, val password : String, val name : String) {
    companion object {
        val staticUsers = listOf(
            User(email="pepito23@gmail.com", password = "12345", name = "Pepito"),
            User(email="juan23@gmail.com", password = "12345", name = "Juan"),
            User(email="pedro23@gmail.com", password = "12345", name = "Pedro"),
            User(email="luis23@gmail.com", password = "12345", name = "Luis")
        )
    }
}