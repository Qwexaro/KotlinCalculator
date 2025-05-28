package ru.topacademy.calculator.operation.mathoperations

import ru.topacademy.calculator.operation.Operation

object Addition : Operation {
    override fun invoke(a: Int, b: Int) {
        println("Сумма: ${a + b}")
    }
}