package com.assignment;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {
    private String name;
    private String city;

    public Student(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getCity() {
        return city;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return name;
    }
}


public class StudentFilter {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("a", "delhi"));
        studentList.add(new Student("b", "delhi"));
        studentList.add(new Student("x", "delhi"));
        studentList.add(new Student("a", "delhi"));
        studentList.add(new Student("r", "noida"));
        studentList.add(new Student("s", "noida"));
        studentList.add(new Student("t", "noida"));

        Map<String, List<Student>> cityMap = studentList.stream()
            .collect(Collectors.groupingBy(Student::getCity));

        System.out.println("City Map: " + cityMap);
    }
}
