package com.train

import java.util.*

fun main(args: Array<String>) {
    val number = 0
    while (number != -1) {
        val scanner = Scanner(System.`in`)
        print("Please enter number of tickets: ")
        var numberofTicket = scanner.nextInt()
        if(numberofTicket != -1) {
            print("How many round trip: ")
            var numberofRoundtrip = scanner.nextInt()

            val tickets = Tickets(numberofTicket, numberofRoundtrip)

            tickets.print()
        }else{
            print("Thank you for your order.")
            break
        }
    }
}


