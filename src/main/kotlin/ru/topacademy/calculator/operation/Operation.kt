package ru.topacademy.calculator.operation

interface Operation {
    operator fun invoke(a: Int, b: Int)
}