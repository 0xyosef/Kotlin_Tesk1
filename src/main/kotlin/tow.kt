fun main() {
    println("Enter Number to check")
    var number:Int= readln()!!.toInt()
    if (number%2==0)
        println("$number is even")
    else
        println("$number is odd")

}