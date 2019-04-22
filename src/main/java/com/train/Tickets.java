package com.train;

public class Tickets {
    int numberofTickets;
    int numberofRoundtrip;
    static double oneTripprice  = 1000;
    static double roundTripprice = oneTripprice*2*0.9;

    public Tickets(int numberofTickets, int numberofRoundtrip) {
        this.numberofTickets = numberofTickets;
        this.numberofRoundtrip = numberofRoundtrip;
    }

    public double Totalprice(){
        return(numberofTickets - numberofRoundtrip)*oneTripprice+numberofRoundtrip*roundTripprice;
    }

    public void print(){
        if(validate()){
            double totalPrice = Totalprice();
            System.out.println("Total tickets:"+numberofTickets);
            System.out.println("Round Trip:"+numberofRoundtrip);
            System.out.println("Total:"+Math.round(totalPrice));
        }else{
            System.out.println("Failed Input");
        }
    }

    public boolean validate(){
        if(numberofTickets>=numberofRoundtrip && numberofTickets>0 && numberofRoundtrip>=0){
            return true;
        }else return false;
    }
}

