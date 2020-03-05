package String;

public class ToLowercase {

    public static String toLowerCase(String str) {
        StringBuilder lowerCase = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                lowerCase.append((char) (str.charAt(i) + 32));
            } else {
                lowerCase.append(str.charAt(i));
            }
        }

        return lowerCase.toString();

    }

    public static void main(String[] args) {

        String input = "JArET";

        System.out.println(toLowerCase(input));

    }
}
