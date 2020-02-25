package Arrays;

public class Fibnocci {

    public static int fib(int N) {


        if (N <= 1) {
            return N;
        } else {
            return fib(N-2)+fib(N-1);
        }

    }

    public static void main(String[] args) {

        System.out.println(fib(5));

    }
}
