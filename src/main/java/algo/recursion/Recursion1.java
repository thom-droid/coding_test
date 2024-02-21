package algo.recursion;

public class Recursion1 {

    public static void main(String[] args) {
        int result = sumTo(10);
        System.out.println(result);

        int result2 = factorial(5);
        System.out.println(result2);

        int result3 = power(2,3);
        System.out.println(result3);
    }

    public static int sumTo(int n){

        if(n == 0){
            return 0;
        } else {
            return n + sumTo(n-1);
        }
    }

    public static int factorial(int n){

        if(n == 0){
            return 1;
        }

        return n * factorial(n-1);

    }

    public static int power(int n, int power){

        if(power == 0){
            return 1;
        }

        return n * power(n,power -1);
    }
}
