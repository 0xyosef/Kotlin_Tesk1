fun main() {
    var a= readln().toInt()!!
    var b= readln().toInt()!!
    var c= readln().toInt()!!
    if (a>b && a>c)
        println("$a is largest number")
    else if (b>a&&b>c)
        println("$b is largest number")
    else if (c>a&&c>b)
        println("$c is largest number")
    else
        println("numbers $a=$b=$c")
}