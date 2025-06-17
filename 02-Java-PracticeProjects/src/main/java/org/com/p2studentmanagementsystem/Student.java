package org.com.p2studentmanagementsystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {

    private String name;
    private int age;
    private String studentId;
    private List<String> courses;

    public Student(String name, int age, String studentId) {
        if (validateAge(age) && validateName(name) && validateStudentId(studentId)) {
            this.name = name;
            this.age = age;
            this.studentId = studentId;
            this.courses = new ArrayList<>();
        } else {
            return;
        }
    }

    public String getName() {
        return name;
    }

    public String getStudentId(){
        return studentId;
    }

    public void enrollCourse(String course) {

        if(validateCourseName(course)){ // first check if course is present in course list
            // now check course is already registered
            if(this.courses.contains(course)){
                System.err.println(name + " have already registerd for this course " + course);
                return;
            }else{
                this.courses.add(course);
            }

        }
    }

    private boolean validateAge(int age) {
        if (age >= 20 && age <= 30) {
            return true;
        }
        System.err.println("Invalid Age!!! Student Age needs to be between 20 and 30");
        return false;
    }

    // name should only have alphabets and no numerics or other characters
    private boolean validateName(String name) {
        // name should only have alphabets
        String nameRegex = "^[a-zA-Z\\s]+$";
        Pattern namePattern = Pattern.compile(nameRegex);
        Matcher nameMatcher = namePattern.matcher(name);
        if (nameMatcher.matches()) {
            return true;
        }
        System.err.println("Invalid Name!!! Pls enter alphabets only");
        return false;

    }

    private boolean validateStudentId(String studentId) {
        String studentIdRegex = "S-[0-9]+$"; //S-123
        Pattern namePattern = Pattern.compile(studentIdRegex);
        Matcher idMatcher = namePattern.matcher(studentId);
        if (idMatcher.matches()) {
            return true;
        }
        System.err.println("Invalid Student Id!!! Pls enter proper studentID in format S-123 only");
        return false;
    }

    private boolean validateCourseName(String course){
        List<String> courses = Arrays.asList("java", "dsa", "devops");
        if(courses.contains(course.toLowerCase())){
            return true;
        } else{
            System.err.println("Invalid course name!!! " + course + " Pls select courses from the list!!!" + courses);
            return false;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", studentId='" + studentId + '\'' +
                ", courses=" + courses +
                '}';
    }

    public void printStudentInfo() {
        System.out.println("Name: " + name + " Age: " + age + " StudentId: " + studentId + " courses enrolled: " + courses);
    }


}
