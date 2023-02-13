package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Conference {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Delegate> delegates;
    private ArrayList<Hotel> hotels;
    private ArrayList<DelegationCard> delegationCards;


    public Conference(ArrayList<Delegate> delegates, ArrayList<Hotel> hotels, ArrayList<DelegationCard> delegationCards) {
        this.delegates = delegates;
        this.hotels = hotels;
        this.delegationCards = delegationCards;
    }

    public ArrayList<Delegate> getDelegates() {
        return delegates;
    }

    public void setDelegates(ArrayList<Delegate> delegates) {
        this.delegates = delegates;
    }

    public ArrayList<Hotel> getHotels() {
        return hotels;
    }

    public void setHotels(ArrayList<Hotel> hotels) {
        this.hotels = hotels;
    }

    public ArrayList<DelegationCard> getDelegationCards() {
        return delegationCards;
    }

    public void setDelegationCards(ArrayList<DelegationCard> delegationCards) {
        this.delegationCards = delegationCards;
    }

    @Override
    public String toString() {
        return "Conference{" +
                "delegates=" + delegates +
                ", hotels=" + hotels +
                ", delegationCards=" + delegationCards +
                '}';
    }

    public void Sum(String hotelName, int nights) {
        //Cenata za edna noshtuvka e 91.5 leva
        hotelName = scanner.nextLine();
        nights = scanner.nextInt();
        double Sum;
        Sum=nights*91.5;
    }
    public void earliestDelegate(String earliestDelegateName, String hotelName, int roomNumber) {
        earliestDelegateName = "Borislav";
        hotelName = "Stimul";
        roomNumber = 13;
    }

    public void delegateList(String Name, int UID, String HomeTow, double travelExpenses) {
        ArrayList<String> name;
        ArrayList<Integer> uid;
        ArrayList<String> hometown;
        ArrayList<Double> travelexpenses;

    }

    public void delegateData(String Name, int roomNumber) {
        Name = "Borislav";
        roomNumber = 13;
    }
}
