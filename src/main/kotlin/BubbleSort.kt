/**
 * Given an array of unsorted items, we want to be able to return a sorted array.
 * The bubble sort method starts at the beginning of an unsorted array and 'bubbles up' unsorted values towards the end,
 * iterating through the array until it is completely sorted
 **/

fun main (args: Array<String>) {
    //var result = bubbleSort(mutableListOf(1, 4, 2, 8, 345, 123, 43, 32, 5643, 63, 123, 43, 2, 55, 1, 234, 92))
    var result = bubbleSort(mutableListOf(1))

    println("Result: $result")
}

fun bubbleSort (list: MutableList<Int>): MutableList<Int> {

    /**
     * Swap position of two element
     */
    fun swap (index1: Int, index2: Int) {
        var temp: Int = list[index1]
        list[index1] = list[index2]
        list[index2] = temp
    }

    //only one element, return
    if (list.size == 1) return  list
    //iterate the list
    for (i in list.indices) {
        for (j in 0 until (list.size - i - 1)) {
            if (list[j] > list[j+1]) swap(j, j+1)
        }
    }
    return list
}