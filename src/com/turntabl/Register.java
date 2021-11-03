package com.turntabl;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Register {
    List<Student>register;


    public Register(List<Student> register) {
        this.register = register;

    }

    public List<String> getRegister(){
      return register.stream().map(s->s.getName()).collect(Collectors.toList());
    };

    public List<String> getRegisterByYear(Year studentLevel){
        return register.stream().filter(s-> s.getStudentYear().equals(studentLevel)).map(s->s.getName()).collect(Collectors.toList());
    };

    public Map<Year,List<String>> getRegisterByLevel(Year studentLevel){

        return register.stream().filter(s-> s.getStudentYear().equals(studentLevel))
                .collect(Collectors.groupingBy(Student::getStudentYear,Collectors.mapping(Student::getStudentID,Collectors.toList())));
    };

    public String printReport(){
        return register.stream().collect(Collectors.groupingBy(Student::getStudentYear,Collectors.mapping(Student::getName,Collectors.toList()))).toString();
    };

    public Double getHighestGrades(){
        return register.stream().map(s->s.getstudentGrades()).flatMap(Collection::stream).mapToDouble(x->x).max().orElse(0.0);
    }

    public Optional<Student> returnStudentByName(String studentName){
        return  register.stream().filter(s -> s.getName().equals(studentName)).findAny();
    }


    @Override
    public String toString() {
        return "Register{" +
                "register=" + register +
                '}';
    }
}
