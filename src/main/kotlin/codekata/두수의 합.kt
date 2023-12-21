package codekata

fun main() {
    val value = Solution()
    val result = value.Solution(100, 2)
    print(result)
}
class Solution {
    fun Solution(num1: Int, num2: Int): Int {
        var answer: Int = num1 + num2
        return answer
    }
}