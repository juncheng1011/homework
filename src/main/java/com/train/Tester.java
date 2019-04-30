package com.train;


import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        int number = 0;
        while(number != -1) {
            System.out.println("Please enter number of ticket: ");
            Scanner scanner = new Scanner(System.in);
            int numberofTicket = scanner.nextInt();
            if (numberofTicket != -1) {
                System.out.println("How many round trip: ");
                int numberofRoundtrip = scanner.nextInt();

                Tickets tickets = new Tickets(numberofTicket, numberofRoundtrip);

                tickets.print();
            }else{
                System.out.println("Thank you for your order.");
                break;
            }
        }
    }

}

