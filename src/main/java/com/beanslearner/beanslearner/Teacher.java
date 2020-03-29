package com.beanslearner.beanslearner;

public interface Teacher {

    public void lecture(Iterable<? extends Learner> learners, double numberOfHours);
    public void teach(Learner learner, double numberOfHours);
}
