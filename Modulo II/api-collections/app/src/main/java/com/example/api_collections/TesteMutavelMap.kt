package com.example.api_collections

fun main() {
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    val pandora = Funcionario("Pandora", 5000.0, "PJ")
    val princesa = Funcionario("Princesa", 5000.0, "PJ")

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(maria.nome))

    println("----------------------")
    repositorio.findAll().forEach { println(it) }

    println("----------------------")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach { println(it) }
    
    println("---------Adicionando funcionários-------------")

    repositorio.create(pandora.nome, pandora)
    repositorio.create(princesa.nome, princesa)

    repositorio.findAll().forEach { println(it) }

    val listaFuncionario = listOf(
        Funcionario("Rafael", 9000.0, "CLT"),
        Funcionario("Pandora", 7000.0, "PJ"),
        Funcionario("Princesa", 7000.0, "CLT")
    )

    val repositorio2 = Repositorio<List<Funcionario>>()
    repositorio2.create(listaFuncionario[0].nome, listaFuncionario)

    println("-----Adicionando lista de funcionário no Map-----")
    repositorio2.findAll().forEach { println(it) }
}