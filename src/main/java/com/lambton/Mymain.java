package com.lambton;

import com.lambton.faculty.Faculty;
import com.lambton.students.Student;

public class Mymain {
    public static void main(String[] args) {
       // Person p1 = new Person();
        Student s1 = new Student(1,"Jyothi","Female","Student","Lambton",100);

        Faculty f1 = new Faculty(1,"Pritesh","Male","Professor",10000);
        PartTimeStudent ps1 = new PartTimeStudent(2,"Cherry","Female","PTstudent","Lambton",90,"10");



    }
}
