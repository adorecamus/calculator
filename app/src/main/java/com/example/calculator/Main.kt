package com.example.calculator

fun main() {
    while (true) {
        var calculator = Calculator()

        println("숫자를 입력하세요.")
        var num1 = readln().toInt()
        println("연산자를 입력하세요.")
        var operator = readln()
        println("숫자를 입력하세요.")
        var num2 = readln().toInt()

        println(calculator.operate(num1, operator, num2))

        println("계속하려면 y를 입력하세요.")
        if (readln() != "y") break
    }
}