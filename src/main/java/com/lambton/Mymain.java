package com.lambton;

import com.lambton.faculty.Faculty;
import com.lambton.person.Person;
import com.lambton.students.Student;

public class Mymain {
    public static void main(String[] args) {
       Person p1 = new Person(1,"Jyothi","Female");
        Student s1 = new Student(1,"Jyothi","Female","Student","Lambton",100);

        Faculty f1 = new Faculty(1,"Pritesh","Male","Professor",10000);
        PartTimeStudent ps1 = new PartTimeStudent(2,"Cherry","Female","PTstudent","Lambton",90,"10");
       // ps1.display();
       // p1=s1;
       // p1.display();
       // p1=ps1;
       // p1.display();
        IDisplay iDisplay ;
        iDisplay =p1;
        iDisplay = s1;
        iDisplay = ps1;
       // p1.display();
        iDisplay.display();
        s1 = null;
        iDisplay.display();


    }
}
