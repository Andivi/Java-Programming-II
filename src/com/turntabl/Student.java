package com.turntabl;

import java.util.List;

public class Student implements Nameable {
    private String studentName;
    private String studentID;
    private Year studentYear;
    private List<Double>studentGrade;

    public Student(String studentName, String studentID, Year studentYear, List<Double> studentGrade) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.studentYear = studentYear;
        this.studentGrade = studentGrade;
    }

    @Override
    public String getName() {
        return this.studentName;
    }

    public List<Double> getStudentGrade() {
        return studentGrade;
    }
    public Double getAverageGrade(){
        return studentGrade.stream().mapToDouble(s->s).average().orElse(0.0);

    };
    public String getStudentName() {
        return studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public Year getStudentYear() {
        return studentYear;
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentID='" + studentID + '\'' +
                ", studentYear=" + studentYear +
                ", studentGrade=" + studentGrade +
                '}';
    }


}
