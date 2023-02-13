package org.example;

public class Delegate {
    private int delegateId;
    private String dateOfArrival;
    private String dateOfDeparture;

    Delegate() {
        this.delegateId = 1;
        this.dateOfArrival = "December the 1st";
        this.dateOfDeparture = "December the 13th";
    }

    public Delegate(int delegateId, String dateOfArrival, String dateOfDeparture) {
        this.delegateId = delegateId;
        this.dateOfArrival = dateOfArrival;
        this.dateOfDeparture = dateOfDeparture;
    }

    public int getDelegateId() {
        return delegateId;
    }

    public void setDelegateId(int delegateId) {
        this.delegateId = delegateId;
    }

    public String getDateOfArrival() {
        return dateOfArrival;
    }

    public void setDateOfArrival(String dateOfArrival) {
        this.dateOfArrival = dateOfArrival;
    }

    public String getDateOfDeparture() {
        return dateOfDeparture;
    }

    public void setDateOfDeparture(String dateOfDeparture) {
        this.dateOfDeparture = dateOfDeparture;
    }

    @Override
    public String toString() {
        return "Delegate{" +
                "delegateId=" + delegateId +
                ", dateOfArrival='" + dateOfArrival + '\'' +
                ", dateOfDeparture='" + dateOfDeparture + '\'' +
                '}';
    }
}
