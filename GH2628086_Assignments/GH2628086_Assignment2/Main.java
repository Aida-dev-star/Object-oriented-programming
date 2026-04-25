package org.salcc.assignment2;

public class Main {

    public static void main(String[] args) {

        GradedItemList list = new GradedItemList();

        Exam finalExam = new Exam(
                "Final",
                12,
                13,
                8,
                0,
                0.78,
                "final.pdf"
        );

        Assignment lab1 = new Assignment(
                "Lab 1",
                8,
                26,
                23,
                59,
                0.50,
                "lab1.pdf",
                "calendar.csv"
        );

        list.addItem(finalExam);
        list.addItem(lab1);

        System.out.println(list);
    }
}