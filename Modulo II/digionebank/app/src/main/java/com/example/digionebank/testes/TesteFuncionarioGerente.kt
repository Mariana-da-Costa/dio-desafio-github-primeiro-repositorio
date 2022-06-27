package com.example.digionebank.testes

import com.example.digionebank.Funcionario
import com.example.digionebank.Gerente

fun main() {

    val maria = Gerente("Maria Aparecida", "111.222.333.-99", 9000.0)
    imprimeRelatorioFuncionario.imprime(maria)
}