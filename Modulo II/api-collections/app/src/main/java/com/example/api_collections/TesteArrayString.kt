package com.example.api_collections

fun main() {
    val nomes = Array(3) { "" }
    nomes[0] = "Maria"
    nomes[1] = "Mariana"
    nomes[2] = "Ana"

    for (nome in nomes) {
        println(nome)
    }

    nomes.sort()
    nomes.forEach { println(it) }

    nomes[0] = "Ana"
    nomes[1] = "Maria"
    nomes[2] = "Mariana"

    println("----------------------------")
    println("----------------------------")

    nomes[2] = "Mari"

    for (nome in nomes) {
        println(nome)
    }

    println("Tamanho do array = " + nomes.size)
}