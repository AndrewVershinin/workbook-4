package com.pluralsight;

public class Reservation {
    private String roomType;
    private double nightPrice;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        setRoomType(roomType);
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;

        if (roomType.equalsIgnoreCase("king")) {
            this.nightPrice = 139.00;
        } else if (roomType.equalsIgnoreCase("double")) {
            this.nightPrice = 124.00;
        }
    }

    public double getNightPrice() {
        if (isWeekend) {
            return nightPrice * 1.10;
        }
        return nightPrice;
    }

    public void setNightPrice(double nightPrice) {
        this.nightPrice = nightPrice;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getReservationTotal() {
        return getNightPrice() * numberOfNights;
    }
}
