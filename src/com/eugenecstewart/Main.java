package com.eugenecstewart;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        ITECCourse maintenanceCourse = new ITECCourse("Microcomputer Systems Maintenance",1310,20);


        //Add some students.
        //TODO check that we have not exceeded the max number for the class

        maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Carl");
        maintenanceCourse.setRoomnumber(250);
        maintenanceCourse.writeCourseInfo();


        ITECCourse datacomCourse = new ITECCourse("Data Communications",1425,30);


        datacomCourse.addStudent("Dave");
        datacomCourse.addStudent("Ed");
        datacomCourse.addStudent("Flora");
        datacomCourse.setRoomnumber(111);
        datacomCourse.writeCourseInfo();

        ITECCourse Java = new ITECCourse("Java Programming",2545,24);
        Java.addStudent("Eugene");
        Java.addStudent("Bill");
        Java.addStudent("Tyler");

        Java.writeCourseInfo();

        ITECCourse InfoTechConcepts = ITECCourse("Info Tech Concepts",ll00,30);
        InfoTechConcepts.setRoomnumber(3050);
        InfoTechConcepts.addStudent();
    }
}
