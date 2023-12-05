package com.example.calculator

class Calculator(abstractOperation: AbstractOperation) {

    val operation = abstractOperation

    fun operate(num1: Int, num2: Int): Double {
        return operation.operate(num1, num2)
    }
}