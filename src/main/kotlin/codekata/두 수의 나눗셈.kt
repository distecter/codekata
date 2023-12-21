package codekata

fun main() {
    val value = Solution()
    val result = value.Solution(3, 2)
    print(result)
}

class Solution {
    fun Solution(num1: Int, num2: Int): Int {
        var answer: Int = 0
        answer= (num1.toDouble()/num2.toDouble()*1000).toInt()
        return answer
    }
}