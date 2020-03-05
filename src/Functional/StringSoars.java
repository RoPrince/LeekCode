package Functional;

public class StringSoars {

    final static String dummy = "Confused";




    public static void main(String[] args) {
        dummy.chars().forEach(System.out::println);

        dummy.chars()
                .mapToObj(ch->Character.valueOf((char)ch))
                .forEach(System.out::println);


    }
}
