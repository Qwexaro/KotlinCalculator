package ru.topacademy.calculator.operation.mathoperations

import ru.topacademy.calculator.operation.Operation

object Substraction : Operation {
    override fun invoke(a: Int, b: Int) {
        println("Вычитание: ${a - b}")
    }
}