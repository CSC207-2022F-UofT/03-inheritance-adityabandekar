/*
 * This file defines an abstract class named Bag.
 * In this exercise, you will be writing a larger class according to
 * the TODOs we have left you. You may find the readings in chapter
 * 1. Introduction to Java helpful.
 */

public abstract class Bag {
    private String color;
    private int numberOfContents, capacity;
    private String[] contents;

    public Bag(String color, int capacity) {
        this.color = color;
        this.capacity = capacity;
        this.contents = new String[capacity];
        this.numberOfContents = 0;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfContents() {
        return numberOfContents;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean addItem(String item) {
        if (this.numberOfContents < this.capacity) {
            this.contents[this.numberOfContents] = item;
            this.numberOfContents++;
            return true;
        }
        return false;
    }

    public String popItem() {
        if (this.numberOfContents == 0) return null;
        String item = this.contents[this.numberOfContents-1];
        this.contents[this.numberOfContents-1] = "";
        this.numberOfContents--;
        return item;
    }

    public void increaseCapacity(int n) {
        String[] newContents = new String[this.capacity + n];
        for (int i = 0; i < this.capacity; i++) {
            newContents[i] = contents[i];
        }
        this.capacity += n;
        this.contents = newContents;
    }

    @Override
    public String toString() {
        return this.color + " Bag (" + this.numberOfContents + " / " +
                this.capacity + ")";
    }

    public abstract void enhance();
}