package Functional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Friends {

    public static final List<String> friends = Arrays.asList("Scott", "Brian", "Nela", "Monce");
    //public static final List<String> Upperfriend = new ArrayList<>();

    public static Predicate<String> checkIfStartsWith(final String letter) {
        return name -> name.startsWith(letter);
    }


    public static void main(String[] args) {

        friends.forEach(System.out::println);
//        for (String name :
//                friends) {
//            Upperfriend.add(name.toUpperCase());
//        }

        //  friends.forEach(name ->Upperfriend.add(name.toUpperCase()));

        final Predicate<String> startsWithS = name -> name.startsWith("S");

        final List<String> Upperfriend = friends.stream()
                .map(String::toUpperCase)
                .filter(checkIfStartsWith("N")).collect(Collectors.toList());

        Optional<String> nameFound = friends.stream()
                .filter(name -> name.startsWith("S"))
                .findFirst();

        //String value = nameFound.get();
        System.out.println("Optional test:" + nameFound.orElse("Nothing"));
        nameFound.ifPresent(name ->System.out.println(name));

        OptionalInt value = friends.stream()
                .mapToInt(name->name.length())
                .max();

        System.out.println(friends.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(",")));



    }

}
