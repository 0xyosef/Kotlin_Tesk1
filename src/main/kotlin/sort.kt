import java.util.*

fun main() {
    val arr = IntArray(6)
    var temp: Int
    val sc = Scanner(System.`in`)
    print("Enter 6 elements:")

    for (i in 0 until arr.size) {
        arr[i] = sc.nextInt()
    }

    for (i in 0 until arr.size) {
        for (j in i + 1 until arr.size) {
            if (arr[i] > arr[j]) {
                temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }
        }
    }

    print("Array list after sorting:")
    for (n in arr) {
        print("$n ")
    }
}