package codekata

fun main() {
    val value = `짝수의 합`()
    val result = value.solution(10)
    print(result)
}

class `짝수의 합` {
    fun solution(n: Int): Int {
        var answer: Int = 0

        for(a:Int in 1..n){
            if(a%2==0)
                answer +=a
        }
        return answer
    }
}