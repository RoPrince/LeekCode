package Arrays;

public class ReverseInteger {

    public static int reverse(int x) {
        char[] value = ("" + x).toCharArray();
        String reverseInt = "";
        int y = value.length;

        for (int i = y - 1; i >= 0; i--) {
            reverseInt = reverseInt + value[i];
        }

        return Integer.valueOf(reverseInt);

    }

    public static int reversePop(int x) {
        int rev = 0;
        int pop;

        while (x != 0) {
            pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }


    public static void main(String[] args) {
        int value = -2345;
        //System.out.println(reverse(value));
        System.out.println(reversePop(value));

    }

}
