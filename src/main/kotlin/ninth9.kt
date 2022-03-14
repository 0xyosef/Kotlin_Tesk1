fun main() {
   var num:Long= readln()!!.toLong()
    val decimal = convertBinaryToDecimal(num)
    println("decimal is $decimal ")

}
fun convertBinaryToDecimal(num:Long):Int {
    var num=num
      var decimalNumber=0
    var i=0
    var remainder:Long
            while (num.toInt() !=0){
                remainder = num % 10
                num /= 10
    decimalNumber += (remainder * Math.pow(2.0, i.toDouble())).toInt()
                ++i
            }
      return decimalNumber
}