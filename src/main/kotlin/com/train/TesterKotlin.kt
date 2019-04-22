package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets:")
    var numbersofTickets = scanner.nextInt()
    print("How many of round trip tickets?")
    var numberofRoundtrip = scanner.nextInt()
    val tickets = Tickets(numbersofTickets,numberofRoundtrip)
    tickets.print()
}