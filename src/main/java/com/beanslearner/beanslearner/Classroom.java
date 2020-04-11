package com.beanslearner.beanslearner;

import java.util.ArrayList;
import java.util.HashMap;

public class Classroom {
    Instructors instructors;
    Students students;

    public Classroom(Instructors instructors, Students students){
        this.instructors = instructors;
        this.students = students;
    }

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students.personList, numberOfHours);
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public Students getStudents() {
        return students;
    }
}
