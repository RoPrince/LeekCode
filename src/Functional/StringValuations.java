package Functional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringValuations {

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(new Person("John",23),new Person("Mike",43),new Person("Pals",15),new Person("Vens",76));

        List<Person> sortedListAge = personList.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .collect(Collectors.toList());

        List<Person> sortedListName = personList.stream()
                .sorted(Comparator.comparing(Person::getName))
                .collect(Collectors.toList());

         Map<Integer,List<Person>> personMap = personList.stream()
                .sorted(Comparator.comparing(Person::getName).thenComparing(Person::getAge))
                .collect(Collectors.groupingBy(Person::getAge));
    }
}
