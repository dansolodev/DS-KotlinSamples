fun main() {
    // Arrays
    val sample = OperationSamplesArray()
    sample.printArray(sample.threeFives)
    sample.printArrayForeach(sample.vowels)
    sample.printArrayForeachIndexed(sample.evenNumbers)

    println("ADD")
    sample.printArrayForeachIndexed(sample.arrayToAddNewElement)
    val newArray = sample.insertAt(sample.arrayToAddNewElement, 7)
    sample.printArrayForeachIndexed(newArray)

    println("UPDATE")
    sample.printArrayForeachIndexed(sample.arrayToUpdateElement)
    sample.update(2, 100)
    sample.printArrayForeachIndexed(sample.arrayToUpdateElement)

    println("SEARCH")
    val exist = sample.findElement(sample.arrayToUpdateElement, 9)
    if (exist) println("Value find") else println("Value isn't exists")

    println("REVERSED ARRAY")
    val reversedVowels = sample.vowels.reversedArray()
    sample.printArray(reversedVowels)

}