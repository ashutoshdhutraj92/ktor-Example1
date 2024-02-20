package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class Order(val number: String, val contents: List<OrderItems>)

@Serializable
data class OrderItems(val items:String, val amount: Int, val price:Double)

val orderStorage = listOf(Order(
"2020-04-06-01", listOf(
OrderItems("Ham Sandwich", 2, 5.50),
OrderItems("Water", 1, 1.50),
OrderItems("Beer", 3, 2.30),
OrderItems("Cheesecake", 1, 3.75)
)),
Order("2020-04-03-01", listOf(
OrderItems("Cheeseburger", 1, 8.50),
OrderItems("Water", 2, 1.50),
OrderItems("Coke", 2, 1.76),
OrderItems("Ice Cream", 1, 2.35)
))
)