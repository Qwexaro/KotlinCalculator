package ru.topacademy.calculator.operation.mathoperations

import ru.topacademy.calculator.operation.Operation

object Multiply : Operation {
    override fun invoke(a: Int, b: Int) {
        println("Умножение: ${a * b}")
    }
}