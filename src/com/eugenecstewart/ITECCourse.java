package com.eugenecstewart;

import java.util.ArrayList;


/**
 * Created by in0418gq on 9/30/2015.
 */
public class ITECCourse {
   private String name;
   private int code;
    private ArrayList<String> students;
   private int maxStudents;
    private int roomnumber;


    public int getRoomnumber() {

        return roomnumber;
    }

    public void setRoomnumber(int roomnumber) {
        this.roomnumber = roomnumber;
    }

    //Constructor
    ITECCourse(String courseName, int courseCode, int courseMaxStudents)
    {
        this.name = courseName;
        this.code = courseCode;
        this.students = new ArrayList<String>();
        this.maxStudents = courseMaxStudents;

    }
  public   void addStudent(String studentName) {
        if (students == null) {    //See if students has been set up yet – initialize it if not
            students = new ArrayList<String>();
        }
        students.add(studentName);
    }

 public    void writeCourseInfo() {
        System.out.println("Course Name: " + this.name);
        System.out.println("Course Code: " + this.code);
        System.out.println("Course Room: T" + this.roomnumber);
        System.out.println("Students enrolled:");
        for (String student : this.students) {
            System.out.println(student);
        }
        System.out.println("There are " + getNumberOfStudents() + " students enrolled");
        System.out.println("The max number of students for this course is  " + this.maxStudents);
    }


    int getNumberOfStudents() {
        return this.students.size();
    }
public  void removeStudent(String studentName) {
        if (students.contains(studentName)) {
            students.remove(studentName);
            System.out.println(studentName + " was un-enrolled from " + this.name);
        } else {
            System.out.println(studentName + " was not found in " + this.name);

        }
    }
}
