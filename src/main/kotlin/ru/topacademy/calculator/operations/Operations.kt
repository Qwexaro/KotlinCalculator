package ru.topacademy.calculator.operations

fun addition(a: Int, b: Int) {
    println("Сумма: ${a + b}")
}

fun substraction(a: Int, b: Int) {
    println("Вычитание: ${a - b}")
}

fun multiply(a: Int, b: Int) {
    println("Умножение: ${a * b}")
}

fun division(a: Int, b: Int) {
    if (a == 0 || b == 0) println("Операция с нулем проводиться не будет.")
    println("Деление: ${a / b} и его остаток: ${a % b}")
}