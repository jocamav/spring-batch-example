package com.example.tutorialbatchexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class PersonItemProcessor implements ItemProcessor<Person, Person> {

    private final static Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);

    @Override
    public Person process(Person person) throws Exception {
        String firstName = person.getFirstName().toUpperCase();
        String lastName = person.getLastName().toUpperCase();
        Person convertedPerson = new Person(firstName, lastName);
        log.info("Converting ({}) to ({})", person.toString(), convertedPerson.toString());
        return convertedPerson;
    }
}
