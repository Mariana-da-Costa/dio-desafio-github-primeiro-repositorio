package com.example.api_collections

fun main() {
    val values = intArrayOf(2, 3, 4, 1, 10, 5)

    values.forEach {
        println(it)
    }

    println("---------------------")
    values.sort()
    values.forEach {
        println(it)
    }
}