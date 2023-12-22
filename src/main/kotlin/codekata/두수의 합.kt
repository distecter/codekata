package codekata

fun main() {
    val value = `두 수의 합`()
    val result = value.solution(100, 2)
    print(result)
}
class `두 수의 합` {
    fun solution(num1: Int, num2: Int): Int {
        var answer: Int = num1 + num2
        return answer
    }
}