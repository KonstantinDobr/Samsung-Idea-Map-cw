package com.samsung.test;

import com.samsung.test.domain.Person;
import com.samsung.test.domain.Pet;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Map<String, Integer> productHashMap = new HashMap<>();
        productHashMap.put("хлеб", 35);
        productHashMap.put("молоко", 60);
        productHashMap.put("кефир", 60);
        productHashMap.put("сыр", 350);

        System.out.println(productHashMap);
        System.out.println("---------------------------------------");

        Integer bread = productHashMap.put("хлеб", 70);
        System.out.println(productHashMap);
        System.out.println(bread);
        System.out.println("---------------------------------------");

        for (Map.Entry<String, Integer> entry: productHashMap.entrySet()) {
            if (entry.getKey().equals("хлеб") || entry.getKey().equals("кефир")) {
                System.out.println(entry.getValue());
            }
        }
        System.out.println("---------------------------------------");

        for (Integer value : productHashMap.values()) {
            System.out.println(value);
        }
        System.out.println("---------------------------------------");

        for (String string : productHashMap.keySet()) {
            System.out.println(string);
        }
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");

//        Collection<Integer> values = productHashMap.values();

        Map<String, Integer> productTreeMap = new TreeMap<>();
        productTreeMap.put("хлеб", 35);
        productTreeMap.put("молоко", 60);
        productTreeMap.put("кефир", 60);
        productTreeMap.put("сыр", 350);
        System.out.println(productTreeMap);
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");

        Map<Person, Pet> personPetTreeMap = new TreeMap<>(/*new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                System.out.println("compare");
                return o2.getAge() - o1.getAge();
            }
        }*/);
        personPetTreeMap.put(
                new Person(1L, "Иван", 18),
                new Pet("Шарик")
        );
        personPetTreeMap.put(
                new Person(2L, "Александр", 29),
                new Pet("Джава")
        );

        System.out.println(personPetTreeMap);

    }
}
