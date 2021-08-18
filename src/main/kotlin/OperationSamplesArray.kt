class OperationSamplesArray {

    // CREATE

    /**
     * Create an array
     *
     * The easiest way to create an array is by using a function from the Kotlin standard library, arrayOf().
     * This is a concise way to provide array values.
     * As with any type, it’s good practice to declare arrays that aren't going to change as constants using val
     */
    val vowels = arrayOf("a", "e", "i", "o", "u")
    /*
        Since the array only contains integers, Kotlin infers the type of evenNumbers to be an array of Int values.
        This type is written as Array<Int>
        val evenNumbers = intArrayOf(2, 4, 6, 8)
     */
    val evenNumbers = arrayOf(2, 4, 6, 8)
    //It’s also possible to create an array with all of its values set to a default value:
    val threeFives = Array(3) { 5 } // 5, 5, 5

    // READ
    /**
     * Iterate over all the elements, one by one
     */
    fun printArray(array: Array<*>) {
        for (idx in array) {
            print(idx)
        }
        println()
    }


    fun printArrayForeach(array: Array<*>) {
        array.forEach { element ->
            print(element)
        }
        println()
    }

    fun printArrayForeachIndexed(array: Array<*>) {
        array.forEachIndexed { index, element ->
            println("Index: $index - Element: $element")
        }
        println()
    }

    // INSERT
    /**
     * To insert a new element in an array we can't do it in a direct way  we use arrayOf, intArrayOf, etc,
     * because we create an immutable array.
     * To do that we need the convert array to a mutable list with toMutableList() function.
     */
    val arrayToAddNewElement = arrayOf(0, 1, 2, 3, 4, 5, 6)

    fun insertAt(array: Array<*>, value: Int): Array<*> {
        val result = array.toMutableList()
        result.add(value)
        return result.toTypedArray()
    }

    // UPDATE
    /**
     * To update a value within an array
     */
    val arrayToUpdateElement = arrayOf(0, 1, 2, 3, 4, 5, 6)
    fun update(position: Int, newValue: Int) {
        if (position < arrayToUpdateElement.size) {
            arrayToUpdateElement[position] = newValue
        } else {
            throw Exception("Index out")
        }

    }

    // SEARCH
    /**
     * To do a search within an array we need give value to research and we need iterate all array positions
     */
    fun findElement(array: Array<Int>, value: Int): Boolean {
        var existValue = false
        array.forEach { number ->
            if (number == value) {
                existValue = true
            }
        }
        return existValue
    }


}