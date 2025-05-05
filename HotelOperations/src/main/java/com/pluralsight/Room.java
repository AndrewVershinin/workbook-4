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
        return !occupied;
    }


    public double getPrice() {
        return numberOfBeds * 33.0;
    }
}
