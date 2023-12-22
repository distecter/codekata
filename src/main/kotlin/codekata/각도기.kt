package codekata

fun main() {
    val value = `각도기`()
    val result = value.solution(90)
    print(result)
}
class `각도기` {
    fun solution(angle: Int): Int {

        if(angle < 90){
            return 1
        } else if(angle == 90){
            return 2
        } else if(angle < 180){
            return 3
        } else if(angle == 180){
            return 4
        } else {
            return 0
        }
    }
}
