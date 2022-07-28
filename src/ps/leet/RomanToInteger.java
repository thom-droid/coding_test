package ps.leet;

public class RomanToInteger {

    public static void main(String[] args) {
//        System.out.println(romanToInteger("III"));
//        System.out.println(romanToInteger("LVIII"));
        System.out.println(romanToInteger("MCMXCIV"));

    }

    private static int romanToInteger(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            switch (letter) {
                case 'I':
                    if ((i + 1 < s.length() && s.charAt(i + 1) == 'V') || (i +1 < s.length() && s.charAt(i + 1) == 'X')){
                        sum -= 1;
                    } else {
                        sum += 1;
                    }
                    continue;
                case 'V':
                    sum += 5;
                    continue;
                case 'X':
                    if ((i + 1 < s.length() && s.charAt(i + 1) == 'L') || (i +1 < s.length() && s.charAt(i + 1) == 'C')){
                        sum -= 10;
                    } else {
                        sum += 10;
                    }
                    continue;
                case 'L':
                    sum += 50;
                    continue;
                case 'C':
                    if ((i + 1 < s.length() && s.charAt(i + 1) == 'D') || (i +1 < s.length() && s.charAt(i + 1) == 'M')){
                        sum -= 100;
                    } else {
                        sum += 100;
                    }
                    continue;
                case 'D':
                    sum += 500;
                    continue;
                case 'M':
                    sum += 1000;
            }
        }
        return sum;
    }
}
