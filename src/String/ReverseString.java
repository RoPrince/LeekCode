package String;

import java.util.Arrays;

public class ReverseString {

    public static void reverseString(char[] s) {

        int j = 0;

        for (int i = s.length-1; i >= s.length / 2; i--) {
            swap(s, i, j);
            j++;

        }


    }

    public static void swap(char[] s, int x, int y) {
        char temp = s[x];
        s[x] = s[y];
        s[y] = temp;
    }

    public static void main(String[] args) {

        char[] input = {'h', 'e', 'l', 'p', 'o','s'};
        reverseString(input);
        System.out.println(Arrays.toString(input));
    }
}
