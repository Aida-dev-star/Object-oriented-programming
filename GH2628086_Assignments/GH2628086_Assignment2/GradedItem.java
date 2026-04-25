package org.salcc.assignment2;

public class GradedItem {

    protected String name;
    protected int month;
    protected int day;
    protected int hour;
    protected int minute;
    protected double grade;

    public GradedItem(String name, int month, int day, int hour, int minute, double grade) {
        this.name = name;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return String.format(
                "%s (date: %02d - %02d at %02d:%02d ) : grade = %.2f",
                name, month, day, hour, minute, grade
        );
    }
}