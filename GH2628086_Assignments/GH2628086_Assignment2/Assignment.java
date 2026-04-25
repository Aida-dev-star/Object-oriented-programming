package org.salcc.assignment2;

public class Assignment extends GradedItem {

    private String specification;
    private String datasource;

    public Assignment(String name, int month, int day, int hour, int minute,
                      double grade, String specification, String datasource) {

        super(name, month, day, hour, minute, grade);
        this.specification = specification;
        this.datasource = datasource;
    }

    @Override
    public String toString() {
        return super.toString()
                + " : specification = " + specification
                + " : datasource = " + datasource;
    }
}