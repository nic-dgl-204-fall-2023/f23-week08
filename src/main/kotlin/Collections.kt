/*
 * Course: DGL 204 - Programming for mobile app development
 * Author: Ashley Blacquiere
 *
 * Week 8 content, including collections and functional operations
 */

fun main() {

    // Arrays and Lists are declared in much the same way
    val intArray = intArrayOf(1, 2, 3)
    val intList = listOf(1, 2, 3)

    // Notice that print statements treat Lists a little more conveniently than Arrays
    println("intArray: $intArray")
    println("intList: $intList")

    // Immutable List are declared using listOf
    val immutableIntList = listOf(1, 2, 3)

    // Mutable Lists are declared using special mutable constructors
    val mutableIntList = mutableListOf(1, 2, 3)

    // Note that a val declared MutableList cannot be reassigned
    // mutableIntList = mutableListOf(4, 5, 6)  // Val cannot be reassigned error

    // But we could just change all the elements of the MutableList (even though it was declared with var!)...
    mutableIntList[0] = 4
    mutableIntList[1] = 5
    mutableIntList[2] = 6

    println("mutableIntList: $mutableIntList")

    // immutableIntList[0] = 4 // No Set method available

    // We can also add elements to a mutable list:
    mutableIntList.add(7)

    println("mutableIntList: $mutableIntList")

    // We definitely can't add to a regular List:
    // immutableIntList.add()  // Unresolved reference add

    // Other important Collection types include Set and Map
    val intSet = setOf(1, 2, 3)
    val intToStringMap = mapOf(0 to "zero", 1 to "one", 2 to "two")

    println("intSet: $intSet")
    println("intToStringMap: $intToStringMap")

    // Notice that if you declare a set with duplicate values the duplicates are ignored
    val duplicateIntSet = setOf(1, 2, 2, 3)

    println("duplicateIntSet: $duplicateIntSet")

}