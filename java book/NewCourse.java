package com.company;

public class NewCourse {
    private String CourseName;
    public void setCourseName(String name){
        CourseName = name;
    }
    public String getCourseName(){
        return CourseName;
    }
    public void displaymessage(){
        System.out.printf("Welcome to this course for\n%S!\n",getCourseName());
    }
}
