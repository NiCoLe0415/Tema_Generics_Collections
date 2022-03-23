package com.company;

public class Student implements Comparable<Student>{
    String name;
    double grade;

    public Student (){
        this.name="";
        this.grade=0;
    }
    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public double getGrade(){
        return this.grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(this.getGrade(),o.getGrade());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
