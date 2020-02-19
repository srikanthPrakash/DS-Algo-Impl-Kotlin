package algorithms.sort.selectionsort

fun main() {

    val intArray = arrayOf(10, 1, 2, 20, 7, 8)

    for (lastUnsortedIndex in (intArray.size - 1) downTo 0) {
        var largestValueIndex = 0
        for (i in 1 until lastUnsortedIndex) {
            if (intArray[i] > intArray[largestValueIndex]) {
                largestValueIndex = i
            }
        }
        swap(intArray, largestValueIndex, lastUnsortedIndex)
    }
    for (element in intArray) println(element)
}

private fun swap(intArray: Array<Int>, pos1: Int, pos2: Int) {
    if (pos1 == pos2) return

    if (intArray[pos1] > intArray[pos2]) {
        val temp = intArray[pos1]
        intArray[pos1] = intArray[pos2]
        intArray[pos2] = temp
    }
}