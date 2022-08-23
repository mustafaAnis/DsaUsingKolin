package com.example.dsausingkolinDsaUsingKolin

fun main(){

    val fruits = setOf("apple","orange","grapes","banana")
//    println(fruits.toSortedSet())
    val newFruits1 = fruits.toMutableList()
    val newFruits = fruits.toMutableList()
    newFruits.add("water mellon")
    newFruits.add("pear")
//    newFruits.removeAll(newFruits)
    println(newFruits.elementAt(5))


}