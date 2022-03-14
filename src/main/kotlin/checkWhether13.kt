fun main() {
    val c= '1'

    if (c in 'a'..'z' || c in 'A'..'Z')
        println("$c is an alphabet.")
    else
        println("$c is not an alphabet.")

}