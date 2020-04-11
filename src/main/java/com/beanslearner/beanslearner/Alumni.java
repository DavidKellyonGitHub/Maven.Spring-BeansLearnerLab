package com.beanslearner.beanslearner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class Alumni{
    Students students;
    Instructors instructors;

    @Autowired
    public Alumni(@Qualifier("instructors") Instructors ZCWInstructors, @Qualifier("previousStudents") Students previous) {
        this.students = previous;
        this.instructors = ZCWInstructors;
    }

    @PostConstruct
    public void executeBootCamp(){
        for (Instructor instructor : instructors) {
            instructor.setNumberOfHoursTaught(instructor.getNumberOfHoursTaught() + 300);
        }
        for(Student student : students){
            student.learn(1200);
        }
    }


    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructors instructors) {
        this.instructors = instructors;
    }
}
