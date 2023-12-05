package com.example.calculator

fun main() {
    while (true) {
        println("숫자를 입력하세요.")
        val num1 = readln().toInt()
        println("연산자를 입력하세요. + - * / % 만 입력 가능합니다.")
        val operator = readln()
        println("숫자를 입력하세요.")
        val num2 = readln().toInt()

        when (operator) {
            "+" -> println("${num1} 더하기 ${num2} 결과는 ${Calculator(AddOperation()).operate(num1, num2)}입니다.")
            "-" -> println("${num1} 빼기 ${num2} 결과는 ${Calculator(SubstractOperation()).operate(num1, num2)}입니다.")
            "*" -> println("${num1} 곱하기 ${num2} 결과는 ${Calculator(MultiplyOperation()).operate(num1, num2)}입니다.")
            "/" -> println("${num1} 나누기 ${num2} 결과는 ${Calculator(DivideOperation()).operate(num1, num2)}입니다.")
            "%" -> println("${num1} 나누기 ${num2}의 나머지는 ${Calculator(RemainderOperation()).operate(num1, num2)}입니다.")
            else -> println("지원하지 않는 연산입니다.")
        }

        println("계속하려면 y를 입력하세요.")
        if (readln() != "y") break
    }
}