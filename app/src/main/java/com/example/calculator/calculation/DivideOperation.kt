package com.example.calculator.calculation

import com.example.calculator.abstract.AbstractOperation

class DivideOperation : AbstractOperation() {
    override fun operate(num1: Int, num2: Int): Double {
        require(num2 != 0) {
            ArithmeticException("0으로 나눌 수 없습니다")
        }
        return num1 / num2.toDouble()
    }
}