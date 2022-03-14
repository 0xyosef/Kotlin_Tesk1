fun main() {
    println("Enter String convert to char")
    var s= readln()!!.toString()
    val chars=CharArray(s.length)
    for (i in s.indices){
        chars[i]=s[i]
    }
    print(chars.contentToString())

    /*
    or use method

    val char: CharArray = s.toCharArray()

    println(chars.contentToString())

     */

}