package com.example.api_collections

fun main() {
    val nomes = Array(3) {""}
    nomes[0] = "Maria"
    nomes[1] = "Mariana"
    nomes[2] = "Ana"

    for (nome in nomes) {
        println(nome)
    }

    nomes.sort()
    nomes.forEach { println(it) }

}