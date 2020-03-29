package com.beanslearner.beanslearner;

import java.util.*;

public abstract class People <PersonType extends Person> implements Iterable<PersonType> {
    List<PersonType> personList = new ArrayList<>();

    public People(List<PersonType> personList){
        this.personList = personList;
    }

    public void add(PersonType persontype){
        personList.add(persontype);
    }

    public void remove(PersonType personType){
        personList.remove(personType);
    }

    public int size(){return personList.size();}

    public void clear(){personList.clear();}

    public void addAll(Iterable<PersonType> personTypes) {
            for (PersonType personType : personTypes){
                personList.add(personType);
            }
        }

    public PersonType findById(Long id){
        for (PersonType pt : personList){
                if (pt.getId().equals(id)){
                    return pt;
                }
        }
        return null;
    }

    public List<PersonType> findAll(){
        return personList;
    }

    @Override
    public Iterator<PersonType> iterator() {
        return personList.iterator();
    }
}
