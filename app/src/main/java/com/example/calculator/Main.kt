package com.example.calculator

fun main() {
    var calculator = Calculator()

    while (true) {
        println("숫자를 입력하세요.")
        var num1 = readln().toInt()
        println("연산자를 입력하세요. + - * / % 만 입력 가능합니다.")
        var operator = readln()
        println("숫자를 입력하세요.")
        var num2 = readln().toInt()

        println(calculator.operate(num1, operator, num2))

        println("계속하려면 y를 입력하세요.")
        if (readln() != "y") break
    }
}