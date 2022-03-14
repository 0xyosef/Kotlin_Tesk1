
fun main() {
    println("Enter size of element in the array")
    //input size
    var size= readln()!!.toInt()
    //Create int array
    val intArray=IntArray(size)

    println("Enter number are int array Element")
    //print Array Element
    for (i in intArray.indices){
        print("Array[$i]:")
        intArray[i]= readln()!!.toInt()
    }
    var largest=intArray[0]
    for (i in 1 until intArray.size){
        //compare largest with  Array element
        if (largest<intArray[i])
            largest=intArray[i]
    }
    println("Array size : ${intArray.size}")

    println("largest element of array is :$largest")

}
