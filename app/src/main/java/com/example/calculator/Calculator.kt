package com.example.calculator

class Calculator {
    fun operate(num1: Int, operator: String, num2: Int): String {
        return when (operator) {
            "+" -> "${num1} 더하기 ${num2} 결과는 ${addOperation(AddOperation(), num1, num2)}입니다."
            "-" -> "${num1} 빼기 ${num2} 결과는 ${substractOperation(SubstractOperation(), num1, num2)}입니다."
            "*" -> "${num1} 곱하기 ${num2} 결과는 ${multiplyOperation(MultiplyOperation(), num1, num2)}입니다."
            "/" -> "${num1} 나누기 ${num2} 결과는 ${divideOperation(DivideOperation(), num1, num2)}입니다."
            "%" -> "${num1} 나누기 ${num2}의 나머지는 ${remainderOperation(RemainderOperation(), num1, num2)}입니다"
            else -> "지원하지 않는 연산입니다."
        }
    }

    fun addOperation(addOperation: AddOperation, num1: Int, num2: Int): Double {
        return addOperation.operate(num1, num2)
    }
    fun substractOperation(substractOperation: SubstractOperation, num1: Int, num2: Int): Double {
        return substractOperation.operate(num1, num2)
    }
    fun multiplyOperation(multiplyOperation: MultiplyOperation, num1: Int, num2: Int): Double {
        return multiplyOperation.operate(num1, num2)
    }
    fun divideOperation(divideOperation: DivideOperation, num1: Int, num2: Int): Double {
        return divideOperation.operate(num1, num2)
    }
    fun remainderOperation(remainderOperation: RemainderOperation, num1: Int, num2: Int): Double {
        return remainderOperation.operate(num1, num2)
    }
}