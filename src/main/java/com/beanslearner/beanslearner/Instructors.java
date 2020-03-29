package com.beanslearner.beanslearner;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Instructors extends People<Instructor> {
    public Instructors(Instructor... instructors) {
        super(Arrays.asList(instructors));
    }

    @Override
    public Iterator<Instructor> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Instructor> action) {

    }

    @Override
    public Spliterator<Instructor> spliterator() {
        return null;
    }
}
