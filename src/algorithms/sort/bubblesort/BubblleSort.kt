package algorithms.sort.bubblesort

fun main() {
    val intArray = arrayOf(-12, 10, 2, 20, 7, 18)

    for (lastUnsortedIndex in (intArray.size - 1) downTo 0) {
        for (i in 0 until lastUnsortedIndex) {
            if (intArray[i] > intArray[i + 1]) swap(intArray, i, i + 1)
        }
    }
    for (element in intArray) {
        println(element)
    }
}

private fun swap(intArray: Array<Int>, pos1: Int, pos2: Int) {
    if (pos1 == pos2) return

    if (intArray[pos1] > intArray[pos2]) {
        val temp = intArray[pos1]
        intArray[pos1] = intArray[pos2]
        intArray[pos2] = temp
    }
}