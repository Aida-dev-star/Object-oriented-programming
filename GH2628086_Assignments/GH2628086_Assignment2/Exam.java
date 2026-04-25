package org.salcc.assignment2;

public class Exam extends GradedItem {

    private String problemSet;

    public Exam(String name, int month, int day, int hour, int minute,
                double grade, String problemSet) {

        super(name, month, day, hour, minute, grade);
        this.problemSet = problemSet;
    }

    @Override
    public String toString() {
        return super.toString() + " : problem set = " + problemSet;
    }
}