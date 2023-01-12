

fun main() {

    for (i in 0..15) {
        for (j in 0..15) {
            val number = i * 15 + j
            val str = String.format("%3d", number)

            print("\u001b[48;5;${number}m $str")
            print("\u001b[0m")
        }
        println()
    }

}