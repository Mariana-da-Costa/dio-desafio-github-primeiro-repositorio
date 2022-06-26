package com.example.digionebank

class Pessoa{
    var nome: String = "Mariana"
    var cpf: String = "123.456.789-00"

    fun pessoaInfo() = "$nome e $cpf"
}

fun main() {
    val mariana = Pessoa()

    println(mariana.pessoaInfo())

}