/*
 * Course: DGL 204 - Programming for mobile app development
 * Author: Ashley Blacquiere
 *
 * Week 8 content, including collections and functional operations
 */

fun main() {

    // This is a super useful way to create a List of sequential elements:
    val intList = List(10) { it + 1 }

    println("intList: $intList\n\n")

    // List manipulations

    // chunked (https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/chunked.html)
    println("chunked: ${intList.chunked(3)}")

    // drop (https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/drop.html)
    println("drop: ${intList.drop(2)}")

    // reversed (https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/reversed.html)
    println("reversed: ${intList.reversed()}")

    // shuffled (https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/shuffled.html)
    println("shuffled: ${intList.shuffled()}")

    // slice (https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/slice.html)
    println("slice: ${intList.slice(2..6)}")

    // sorted (https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/sorted.html)
    println("sorted: ${intList.shuffled().sorted()}")

    // take (https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/take.html)
    println("take: ${intList.take(5)}")

    // List element identification / manipulation
    // binarySearch (https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/binary-search.html)
    println("binary search: ${intList.binarySearch(10)}")

    // contains (https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/contains.html)
    println("contains: ${intList.contains(-1)}")

    // distinct (https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/distinct.html)
    println("distinct: ${intList.distinct()}")

    // elementAt (https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/element-at.html)
    println("elementAt: ${intList.elementAt(2)}")

    // first (https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first.html)
    println("first: ${intList.first()}")

    // indexOf (https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index-of.html)
    println("indexOf: ${intList.indexOf(7)}")

    // last (https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/last.html)
    println("last: ${intList.last()}")

    // random (https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/random.html)
    println("random: ${intList.random()}")

    // windowed (https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/windowed.html)
    println("windowed: ${intList.windowed(2)}")


    // Functional methods

    // flatten (https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/flatten.html)
    val windowedList = intList.windowed(3)
    println("flatten: ${windowedList.flatten()}")
    println("windowedList: $windowedList")

    val newWindowedList = mutableListOf<Int>()
    for (list in windowedList) {
        newWindowedList += list
    }
    println("newWindowedList: $newWindowedList\n\n")

    // map (https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/map.html)
    println("map: ${intList.map { it * 2 }}")

    val doubledIntList = mutableListOf<Int>()
    for (element in intList) {
        doubledIntList.add(element * 2)
    }
    println("doubled list: $doubledIntList\n\n")

    // reduce (https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/reduce.html)
    println("reduce: ${intList.reduce { acc, value -> acc + value }}")

    var reducedValue = intList.first()
    for (index in 1 until intList.size) {
        reducedValue += intList[index]
    }
    println("reduced value: $reducedValue\n\n")

    // fold (https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/fold.html)
    println("fold: ${intList.fold(100) { acc, value -> acc + value }}")

    var foldedValue = 100
    for (element in intList) {
        foldedValue += element
    }
    println("folded value: $foldedValue\n\n")

    // filter (https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/filter.html)
    println("filter: ${intList.filter { it > 4 }}")

    val filteredList = mutableListOf<Int>()
    for (element in intList) {
        if (element > 4) {
            filteredList.add(element)
        }
    }
    println("filteredList: $filteredList\n\n")

    // Functional methods can be chained together to produce more complex behaviour and results
    val sumOfEvenValues = intList
        .filter { it % 2 == 0 }
        .reduce { acc, value -> value + acc }
    println("sum of event values: $sumOfEvenValues")

}