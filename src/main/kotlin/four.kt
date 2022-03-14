fun main() {

    val num= intArrayOf(1,2,3,4,5)
    println(" Enter number")
    val toFind:Int= readln()!!.toInt()
    var found=false
    for (n in num){
        if (n==toFind){
           found=true
            break
        }
    }
    if (found)
        println("$toFind is found")
    else
        println("$toFind is not found")


}