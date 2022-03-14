import java.util.Collections.reverse

fun main() {
    val sentence= readln()!!.toString()
    val r=reverse(sentence)
    println("The reverse=$r")
}

fun reverse(sentence: String):String {
       if (sentence.isEmpty())
           return sentence
    else
        return reverse(sentence.substring(1))+sentence[0]
}
