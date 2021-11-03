package com.turntabl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student implements Nameable {
    private String studentName;
    private String studentID;
    private Year studentYear;
    private List<Double>studentGrade;
    private List<Student>students;

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

    public String returnStudentByName(String student) throws StudentNotFoundException,NullPointerException {

       return students.stream()
                .filter(s -> s.getName().equals(student)).collect(Collectors.groupingBy(Student::getStudentName, Collectors.toList()))
                .toString();
//        if(something.equals("")){
//            throw new StudentNotFoundException();
//        }

    }
    public List<Double> getstudentGrades(){
        return studentGrade.stream().collect(Collectors.toList());
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
