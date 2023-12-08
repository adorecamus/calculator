package com.example.calculator.calculation

import com.example.calculator.abstract.AbstractOperation

class SubtractOperation : AbstractOperation() {
    override fun operate(num1: Int, num2: Int): Double = (num1 - num2).toDouble()
}