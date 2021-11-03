package com.turntabl;

import java.util.List;
import java.util.Set;

public class BagOfStudents<T extends Student> extends Bag<T>{

    private Set<T> students;

    public BagOfStudents(Set<T> students) {
        this.students = students;
    }
    @Override
    public void  add(T student){
        students.add(student);

    };

    @Override
    public void remove(T student){
        students.remove(student);
    };

    @Override
    public  void clear(Set<T> students){
        students.removeAll(students);
    };

     public void clear(){
      students.clear();
    };

    public Set<T> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "BagOfStudents{" +
                "students=" + students +
                '}';
    }

}
