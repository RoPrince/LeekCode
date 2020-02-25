package Arrays;

public class PalindromeNum {
    public static boolean isPalindrome(int x) {

        if (x < 0)
            return false;
        else if (x < 10)
            return true;
        else {

            char[] nums = Integer.toString(x).toCharArray();
            int j = nums.length - 1;

            for (int i = 0; i < nums.length / 2; i++) {
                if (nums[i] != nums[j]) {
                    return false;
                }
                j--;
            }
        }

        return true;

    }

    public static boolean isPal(int x) {
        int revNumber = 0;
        if (x < 0 || x % 10 == 0 && x!=0)
            return false;
        else if (x < 10)
            return true;
        else {

            while (x > revNumber) {
                revNumber = revNumber * 10 + x % 10;
                x /= 10;

            }

        }

        return (revNumber == x || revNumber / 10 == x);
    }

    public static void main(String[] args) {

        int num = 0;
        // System.out.println(isPalindrome(num));
        System.out.println(isPal(num));


    }
}
