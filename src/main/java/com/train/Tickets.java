package com.train;

public class Tickets{
    int numberofTicket;
    int numberofRoundtrip;
    static double oneWayticket = 1000;
    static double roundTripticket = oneWayticket*2*0.9;

    public Tickets(int numberofTicket, int numberofRoundtrip) {
        this.numberofTicket = numberofTicket;
        this.numberofRoundtrip = numberofRoundtrip;
    }

    public double totalPrice(){
        return(numberofTicket-numberofRoundtrip)*oneWayticket+numberofRoundtrip*roundTripticket;
    }

    public void print(){
        if (validate()) {
            double TotalPrice = totalPrice();
            System.out.println("Total number of ticket= "+ numberofTicket);
            System.out.println("Total round trip= " + numberofRoundtrip);
            System.out.println("Total=" + Math.round(TotalPrice));
        }else{
            System.out.println("Failed Input");
        }
    }

    public boolean validate(){
        if(numberofTicket>=numberofRoundtrip && numberofTicket>0 && numberofRoundtrip>=0){
            return true;
        }else return false;
    }
}