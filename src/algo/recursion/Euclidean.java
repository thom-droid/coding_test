package algo.recursion;

public class Euclidean {
    public static void main(String[] args) {
        int result = greatestCommonDivisor(24, 12);
        int result2 = greatestCommonDivisor(36, 8);
        int result3 = greatestCommonDivisor2(256, 44);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }

    public static int greatestCommonDivisor(int a, int b){

        if(a < b){
            return -1;
        }

        if(a % b == 0){
            return b;
        } else {
            return greatestCommonDivisor(b, a%b);
        }

    }

    public static int greatestCommonDivisor2(int a, int b){

        if(b==0){
            return a;
        }

        return greatestCommonDivisor(b, a%b);

    }
}
