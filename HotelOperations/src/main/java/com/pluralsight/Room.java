package com.pluralsight;

public class Room {
    private int id;
    private int numberOfBeds;
    private boolean occupied;
    private boolean dirty;

    public Room(int id, int numberOfBeds, boolean occupied, boolean dirty) {
        this.id = id;
        this.numberOfBeds = numberOfBeds;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    public int getId() {
        return id;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    public boolean isAvailable() {
        return !occupied && !dirty;
    }


    public double getPrice() {
        return numberOfBeds * 33.0;
    }

    public void checkIn() {
        if (!occupied && !dirty) {
            occupied = true;
            dirty = true;
            System.out.println("Room " + id + " has been checked out");
        } else if (dirty) {
            System.out.println("Room " + id + "is dirty");
        } else if (occupied) {
            System.out.println("Room " + id + "occupied");
        }
    }

    public void checkOut() {
        if (occupied) {
            occupied = false;
            System.out.println("Room " + id + " has been checked out.");
        } else {
            System.out.println("Room " + id + " is not occupied.");
        }
    }

    public void cleanRoom() {
        if (!occupied && dirty) {
            dirty = false;
            System.out.println("Room " + id + " has been cleaned and is ready for check-in.");
        } else if (!dirty) {
            System.out.println("Room " + id + " is already clean.");
        } else {
            System.out.println("Room " + id + " is occupied and cannot be cleaned.");
        }
    }
}
