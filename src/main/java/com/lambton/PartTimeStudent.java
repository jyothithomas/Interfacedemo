package com.lambton;

import com.lambton.students.Student;

public class PartTimeStudent extends Student {
    String noOfDays;

    public PartTimeStudent(int id, String name, String gender, String courseName, String collegeName, int totalMarks,String noOfDays) {
        super(id, name, gender, courseName, collegeName, totalMarks);
    }

    public String getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(String noOfDays) {
        this.noOfDays = noOfDays;
    }

    @Override
    public void display() {
        super.display();
    }

}
