package com.turntabl;

import java.util.ArrayList;
import java.util.List;

public class Lecture {
   private List<Student> lectureStudent;

    public Lecture(List<Student> lectureStudent) {
               this.lectureStudent = lectureStudent;
    }


    public void enter(Student student){
       lectureStudent.add(student);
   }

   public Double getHighestAverageGrade(){

       return lectureStudent.stream().mapToDouble(s -> s.getAverageGrade()).max().orElse(0.0);
   };

    public List<Student> getLectureStudent() {
        return lectureStudent;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "lectureStudent=" + lectureStudent +
                '}';
    }
}
