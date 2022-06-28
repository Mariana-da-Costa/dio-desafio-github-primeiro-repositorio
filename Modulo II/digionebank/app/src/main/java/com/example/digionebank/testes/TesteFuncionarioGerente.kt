package com.example.digionebank.testes

import com.example.digionebank.Gerente

fun main() {
    val maria = Gerente("Maria Aparecida", "111.222.333.-99", 9000.0, "senha123")

    imprimeRelatorioFuncionario.imprime(maria)

    TesteAutenticacao().autentica(maria)
}