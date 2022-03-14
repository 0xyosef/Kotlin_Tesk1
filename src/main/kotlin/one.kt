fun main() {
    println("To + Enter 1,To - Enter 2,To * Enter 3,To / Enter 4")
    var numEnter:Int= readln()!!.toInt()
    when(numEnter){
        1->addNumber()
        2->subtract()
        3->multiply()
        4->divide()
        else->
            println("Invalid value")

    }

}
        fun addNumber(){
         println("Enter Number1")
            var n1:Double= readln()!!.toDouble()
            println("Enter Number2")
            var n2:Double= readln()!!.toDouble()
            var sum=n1+n2
            println("Result= $sum")
        }
        fun subtract(){
            println("Enter Number1")
            var n1:Double= readln()!!.toDouble()
            println("Enter Number2")
            var n2:Double= readln()!!.toDouble()
            var sub=n1+n2
            println("Result= $sub")
        }
        fun multiply(){
            println("Enter Number1")
            var n1:Double= readln()!!.toDouble()
            println("Enter Number2")
            var n2:Double= readln()!!.toDouble()
            var mul=n1*n2
            println("Result= $mul")
        }
       fun divide(){
           println("Enter Number1")
            var n1:Double= readln()!!.toDouble()
           println("Enter Number2")
        var n2:Double= readln()!!.toDouble()
           var div=n1*n2
           println("Result= $div")
       }
