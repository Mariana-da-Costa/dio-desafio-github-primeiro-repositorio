package com.example.api_collections

fun main() {
    val joao = Funcionario("Mariana", 6000.0, "CLT")
    val pedro = Funcionario("Ana", 2500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios = listOf(joao, pedro, maria)
    val listaDeFuncionario = listOf(
        Funcionario("Rafael", 9000.0, "CLT"),
        Funcionario("Pandora", 7000.0, "PJ"),
        Funcionario("Princesa", 7000.0, "CLT")
    )

    funcionarios.forEach { println(it) }

    println("------------------")
    println(funcionarios.find { it.nome == "Maria" })

    println("------------------")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("------------------")
    funcionarios
        .groupBy { tipo -> tipo.tipoContratacao }
        .forEach { println(it) }

    println("------------------")
    println(listaDeFuncionario.find { it.nome == "Rafael" })

    println("------------------")
    listaDeFuncionario
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("------------------")
    listaDeFuncionario
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }
}