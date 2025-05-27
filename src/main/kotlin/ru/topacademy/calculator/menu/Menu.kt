package ru.topacademy.calculator.menu

import ru.topacademy.calculator.operations.*
import java.util.Scanner

fun Menu() {

    println("Введи значения для первого числа")

    val number1 = Scanner(System.`in`).nextInt()

    println("Введи значения для второго числа")

    val number2 = Scanner(System.`in`).nextInt()

    do {
        println("исходные переменные: a=$number1, b=$number2")
        println(
            "Выберите операцию:\n" +
                    "\n1 - Сложение" +
                    "\n2 - Вычитание" +
                    "\n3 - Умножение" +
                    "\n4 - Деление" +
                    "\n0 - Выход"
        )
        val operation = Scanner(System.`in`).nextInt()

        when (operation) {
            1 -> addition(number1, number2)
            2 -> substraction(number1, number2)
            3 -> multiply(number1, number2)
            4 -> division(number1, number2)
        }

    } while (operation != 0)
}