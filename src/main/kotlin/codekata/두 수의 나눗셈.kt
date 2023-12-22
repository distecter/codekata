package codekata

fun main() {
    val value = `두 수의 나눗셈`()
    val result = value.solution(3, 2)
    print(result)
}

class `두 수의 나눗셈` {
    fun solution(num1: Int, num2: Int): Int {
        var answer: Int = 0
        answer = (num1.toDouble() / num2.toDouble() * 1000).toInt()
        return answer
    }
}