package com.turntabl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws StudentNotFoundException {
        List<Double>g1 = List.of(10.0,9.5,9.0,10.0,8.5);
        List<Double>g2 = List.of(9.0,9.5,8.0,6.0,9.5);
        List<Double>g3 = List.of(10.0,9.0,9.0,8.0,8.5);
        List<Double>g4 = List.of(10.0,9.5,9.0,7.0,8.5);
        List<Double>g5 = List.of(6.0,9.5,75.0,10.0,7.5);
        List<Double>g6 = List.of(10.0,9.5,9.0,10.0,8.5);
        List<Double>g7 = List.of(10.0,9.0,5.0,10.0,10.0);
        List<Double>g8 = List.of(8.0,9.5,9.0,7.0,8.5);
        List<Double>g9 = List.of(10.0,6.5,5.5,7.5,8.0);
        List<Double>g10 = List.of(5.5,6.5,7.5,8.0,9.0);


                Student s1 = new Student("Raymond","21342021",Year.First,g1);
                Student s2 =  new Student("Mac","23132020",Year.Second,g2);
                Student s3 = new Student("Edem","21122019",Year.Third,g3);
                Student s4 = new Student("Jojoe","12432018",Year.Fourth,g4);
                Student s5 = new Student("Dzifa","21232021",Year.First,g5);
                Student s6 = new Student("Philip","43522020",Year.Second,g6);
                Student s7 = new Student("Obed","67232019",Year.Third,g7);
                Student s8 = new Student("Bintu","23412018",Year.Fourth,g8);

        List<Student> studentList =  List.of(s1,s2,s3,s4,s5,s6,s7,s8);


        List<Student>students =  new ArrayList<>();
        Lecture lecture = new Lecture(students);

//        System.out.println(s1.getAverageGrade());
        lecture.enter(new Student("Kingsley","21232020",Year.Second,g1));
        lecture.enter(s1);
        lecture.enter(s2);

       //System.out.println(lecture);
//        System.out.println(lecture.getHighestAverageGrade());
//        System.out.println(s1.getAverageGrade());
//        System.out.println(s2.getAverageGrade());
//        System.out.println(s3.getAverageGrade());


        Student ns1 = new Student("Kassim","12342022",Year.Fourth,g9);
        Student ns2 = new Student ("Cudjoe","43342021",Year.First,g10);


        Double  spikedAvgGrade= ns1.getAverageGrade()*1.1;
        Double spikedAvgGrade1 = ns2.getAverageGrade()*1.1;

        lecture.enter(ns1);
        lecture.enter(ns2);
//        System.out.println(ns1.getAverageGrade());
//        System.out.println(spikedAvgGrade);
//        System.out.println(spikedAvgGrade1);
        //System.out.println(s1.getstudentGrades());
//       System.out.println(lecture);
        //System.out.println(s1.getName());
        Register r1 = new Register(studentList);
        System.out.println(r1.getHighestGrades());
        System.out.println(r1.returnStudentByName("Ezekiel"));
        //System.out.println(r1.getRegisterByLevel(Year.First));
        //System.out.println(r1.printReport());
        //System.out.println(r1.getRegisterByLevel(Year.First));


    }
}
