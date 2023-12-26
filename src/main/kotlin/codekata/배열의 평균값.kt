package codekata

fun main() {
    val value = `배열의 평균값`()
    val result = value.solution(intArrayOf(1, 2, 3, 4, 5))
    print(result)
}
class `배열의 평균값` {
    fun solution(arr: IntArray): Double {
        return arr.average()
    }
}