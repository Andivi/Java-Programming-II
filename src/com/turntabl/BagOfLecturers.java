package com.turntabl;

import java.util.Set;

public class BagOfLecturers <T extends Lecturer>{
        private Set<T> lecturers;

        public BagOfLecturers(Set<T> lecturers) {
            this.lecturers = lecturers;
        }

        public void add(T lecturer){
            lecturers.add(lecturer);

        };
        public void remove(T lecturer){
            lecturers.remove(lecturer);
        };
        public  void clear(Set<T> lecturers){
            lecturers.removeAll(lecturers);
        };

        public void clear(){
            lecturers.clear();
        };

        public Set<T> getLecturers() {
            return lecturers;
        }

        @Override
        public String toString() {
            return "BagOfLecturers{" +
                    "lecturers=" + lecturers +
                    '}';
        }

}

