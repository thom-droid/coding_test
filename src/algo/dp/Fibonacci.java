package algo.dp;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fib(3));
    }

    public static int fib(int n){

        if(n >= 2){

            int[] fib = new int[n];

            fib[0] = fib[1] = 1;

            for(int i = 2; i < n; i++){
                fib[i] = fib[i-2] + fib[i-1];
            }

            return fib[n-1];

        } else {

            return 1;
        }

    }
}
