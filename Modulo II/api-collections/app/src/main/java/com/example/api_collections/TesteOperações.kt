package com.example.api_collections

fun main() {
    val salarios = doubleArrayOf(2000.0, 4000.0, 6000.0)

    for (salario in salarios) {
        println(salario)
    }
    println("-------------------------------")
    println("Maior salário: ${salarios.max()}")
    println("Menos salário: ${salarios.min()}")
    println("Media salarial: ${salarios.average()}")

    val salarioMaior2500 = salarios.filter { it > 2500.0 }
    println("-------------------------------")
    salarioMaior2500.forEach { println(it) }

}
