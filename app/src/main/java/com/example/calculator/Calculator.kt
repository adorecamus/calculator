package com.example.calculator

class Calculator {
    fun operate(num1: Int, operator: String, num2: Int): String {
        return when (operator) {
            "+" -> "${num1} 더하기 ${num2} 결과는 ${add(num1, num2)}입니다."
            "-" -> "${num1} 빼기 ${num2} 결과는 ${substract(num1, num2)}입니다."
            "*" -> "${num1} 곱하기 ${num2} 결과는 ${multiply(num1, num2)}입니다."
            "/" -> "${num1} 나누기 ${num2} 결과는 ${divide(num1, num2)}입니다."
            else -> "지원하지 않는 연산입니다."
        }
    }

    fun add(num1: Int, num2: Int): Double = (num1 + num2).toDouble()
    fun substract(num1: Int, num2: Int): Double = (num1 - num2).toDouble()
    fun multiply(num1: Int, num2: Int): Double = (num1 * num2).toDouble()
    fun divide(num1: Int, num2: Int): Double = num1 / num2.toDouble()
}