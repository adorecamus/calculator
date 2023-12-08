package com.example.calculator.calculation

import com.example.calculator.abstract.AbstractOperation

class MultiplyOperation : AbstractOperation() {
    override fun operate(num1: Int, num2: Int): Double = (num1 * num2).toDouble()
}