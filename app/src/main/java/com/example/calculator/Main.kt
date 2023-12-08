package com.example.calculator

import com.example.calculator.calculation.AddOperation
import com.example.calculator.calculation.Calculator
import com.example.calculator.calculation.DivideOperation
import com.example.calculator.calculation.MultiplyOperation
import com.example.calculator.calculation.RemainderOperation
import com.example.calculator.calculation.SubtractOperation

fun main() {
    val addCalculator = Calculator(AddOperation())
    val subtractCalculator = Calculator(SubtractOperation())
    val multiplyCalculator = Calculator(MultiplyOperation())
    val divideCalculator = Calculator(DivideOperation())
    val remainderCalculator = Calculator(RemainderOperation())

    while (true) {
        println("숫자를 입력하세요.")
        val num1 = readln().toInt()
        println("연산자를 입력하세요. + - * / % 만 입력 가능합니다.")
        val operator = readln()
        println("숫자를 입력하세요.")
        val num2 = readln().toInt()

        when (operator) {
            "+" -> {
                println("${num1} 더하기 ${num2} 결과는 ${addCalculator.operate(num1, num2)}입니다.")
            }

            "-" -> {
                println("${num1} 빼기 ${num2} 결과는 ${subtractCalculator.operate(num1, num2)}입니다.")
            }

            "*" -> {
                println("${num1} 곱하기 ${num2} 결과는 ${multiplyCalculator.operate(num1, num2)}입니다.")
            }

            "/" -> {
                println("${num1} 나누기 ${num2} 결과는 ${divideCalculator.operate(num1, num2)}입니다.")
            }

            "%" -> {
                println("${num1} 나누기 ${num2}의 나머지는 ${remainderCalculator.operate(num1, num2)}입니다.")
            }

            else -> {
                println("그럴 리가")
            }
        }

        println("계속하려면 y를 입력하세요.")
        if (readln() != "y") break
    }
}