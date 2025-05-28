package ru.topacademy.calculator.operation.mathoperations

import ru.topacademy.calculator.operation.Operation

object Division : Operation {
    override fun invoke(a: Int, b: Int) {
        if (a == 0 || b == 0) println("Операция с нулем проводиться не будет.")
        println("Деление: ${a / b} и его остаток: ${a % b}")
    }
}