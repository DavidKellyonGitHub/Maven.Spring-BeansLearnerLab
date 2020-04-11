package com.beanslearner.beanslearner;

import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Instructors extends People<Instructor> {
    public Instructors(List<Instructor> instructors) {
        super(instructors);
    }

    @Override
    public void forEach(Consumer<? super Instructor> action) {

    }

    @Override
    public Spliterator<Instructor> spliterator() {
        return null;
    }
}
