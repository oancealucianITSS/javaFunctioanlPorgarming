package com.oancea.prog;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

import static com.oancea.prog.Gender.FEMALE;
import static com.oancea.prog.Gender.MALE;
import static java.util.stream.Collectors.toList;

@SpringBootApplication
public class ProgApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProgApplication.class, args);

        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE)
        );
        //imperative approach
//		List<Person> females = new ArrayList<>();
//
//		for(Person person : people){
//			if(FEMALE.equals(person.getGender())){
//				females.add(person);
//			}
//		}
//
//		for (Person female : females) {
//			System.out.println(female + ",");
//		}

        //Declarative approach
        people.stream()
                .filter(person -> FEMALE.equals(person.getGender()))
                .collect(toList())
                .forEach(System.out::println);


    }
}



