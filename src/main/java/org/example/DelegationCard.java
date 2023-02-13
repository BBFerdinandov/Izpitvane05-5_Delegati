package org.example;

public class DelegationCard {
    private String delegateName;
    private int UID;
    private String HomeTown;
    private double travelExpenses;

    DelegationCard() {
        this.delegateName = "Borislav";
        this.UID = 010203040506;
        this.HomeTown = "Sredets";
        this.travelExpenses = 150.61;
    }

    public DelegationCard(String delegateName, int UID, String homeTown, double travelExpenses) {
        this.delegateName = delegateName;
        this.UID = UID;
        HomeTown = homeTown;
        this.travelExpenses = travelExpenses;
    }

    public String getDelegateName() {
        return delegateName;
    }

    public void setDelegateName(String delegateName) {
        this.delegateName = delegateName;
    }

    public int getUID() {
        return UID;
    }

    public void setUID(int UID) {
        this.UID = UID;
    }

    public String getHomeTown() {
        return HomeTown;
    }

    public void setHomeTown(String homeTown) {
        HomeTown = homeTown;
    }

    public double getTravelExpenses() {
        return travelExpenses;
    }

    public void setTravelExpenses(double travelExpenses) {
        this.travelExpenses = travelExpenses;
    }

    @Override
    public String toString() {
        return "DelegationCard{" +
                "delegateName='" + delegateName + '\'' +
                ", UID=" + UID +
                ", HomeTown='" + HomeTown + '\'' +
                ", travelExpenses=" + travelExpenses +
                '}';
    }
}
