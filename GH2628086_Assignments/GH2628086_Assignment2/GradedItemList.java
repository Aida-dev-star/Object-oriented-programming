package org.salcc.assignment2;

import java.util.ArrayList;

public class GradedItemList {

    private ArrayList<GradedItem> list;

    public GradedItemList() {
        list = new ArrayList<>();
    }

    public void addItem(GradedItem item) {
        list.add(item);
    }

    @Override
    public String toString() {

        String result = "";

        for (GradedItem g : list) {
            result += g.toString() + "\n";
        }

        return result;
    }
}