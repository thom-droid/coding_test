package practices;

public class NumberInDigit {

    // how to get each digit?
    // let say we have 123
    // how do we print each digit of this number?

    private static void printEachDigit(int number) {

        for (int i = 1; number / i > 0; i *= 10) {

            int digit = (number / i) % 10;
            System.out.println(digit);
        }

    }

    public static void main(String[] args) {
        printEachDigit(1234);
    }

}
