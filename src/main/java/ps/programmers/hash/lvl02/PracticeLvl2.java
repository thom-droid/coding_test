package ps.programmers.hash.lvl02;

import java.util.*;
import java.util.stream.Collectors;

/** 문제 설명
        전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
        전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.

        구조대 : 119
        박준영 : 97 674 223
        지영석 : 11 9552 4421
        전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때, 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.

        제한 사항
        phone_book의 길이는 1 이상 1,000,000 이하입니다.
        각 전화번호의 길이는 1 이상 20 이하입니다.
        같은 전화번호가 중복해서 들어있지 않습니다.
        입출력 예제
        phone_book	return
        ["119", "97674223", "1195524421"]	false
        ["123","456","789"]	true
        ["12","123","1235","567","88"]	false
        입출력 예 설명
        입출력 예 #1
        앞에서 설명한 예와 같습니다.

        입출력 예 #2
        한 번호가 다른 번호의 접두사인 경우가 없으므로, 답은 true입니다.

        입출력 예 #3
        첫 번째 전화번호, “12”가 두 번째 전화번호 “123”의 접두사입니다. 따라서 답은 false입니다.
 **/

public class PracticeLvl2 {

    public static void main(String[] args) {

        String[] phone_book1 = {"119", "97674223", "1195524421"};
        String[] phone_book2 = {"123", "456", "789"};
        String[] phone_book3 = {"12", "123", "1235", "567","88"};
        String[] phone_book4 = {"15", "123", "1235", "567","88"}; // to be false
        String[] phone_book5 = {"56", "123", "1235", "567","88"}; // to be false
        String[] phone_book6 = {"56", "1235", "57","88"}; // to be true
        String a = "str";
        System.out.println(a.substring(0,1));
        String b = "string";
        String c = "";
        boolean result1 = solution(phone_book1);
        boolean result2 = solution(phone_book2);
        boolean result3 = solution(phone_book3);
        boolean result4 = solution(phone_book4);
        boolean result5 = solution(phone_book5);
        boolean result6 = solution(phone_book6);

//        System.out.println(result1);
//        System.out.println(result2);
//        System.out.println(result3);
//        System.out.println(result4);
//        System.out.println(result5);
//        System.out.println(result6);

//        boolean result13 = solution2(phone_book1);
//        boolean result23 = solution2(phone_book2);
//        boolean result33 = solution2(phone_book3);
//        boolean result43 = solution2(phone_book4);
//        boolean result53 = solution2(phone_book5);
//        boolean result63 = solution2(phone_book6);
//        System.out.println(result13);
//        System.out.println(result23);
//        System.out.println(result33);
//        System.out.println(result43);
//        System.out.println(result53);
//        System.out.println(result63);

        boolean result11 = solution3(phone_book1);
        boolean result21 = solution3(phone_book2);
        boolean result31 = solution3(phone_book3);
        boolean result41 = solution3(phone_book4);
        boolean result51 = solution3(phone_book5);
        boolean result61 = solution3(phone_book6);
        System.out.println(result11);
        System.out.println(result21);
        System.out.println(result31);
        System.out.println(result41);
        System.out.println(result51);
        System.out.println(result61);
    }


    public static boolean solution(String[] phone_book){
        HashSet<String> hashSet = Arrays.stream(phone_book).collect(Collectors.toCollection(HashSet::new));
        for(int i = 0;i<phone_book.length; i++){

            String str = phone_book[i];
            for (String s: hashSet) {
                if(!s.equals(str) && s.startsWith(str)){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean solution2(String[] phone_book){
        HashSet<String> hashSet = new HashSet<>();
        for(int i =0;i<phone_book.length;i++){
            hashSet.add(phone_book[i]);
        }

        for(int i = 0;i<phone_book.length; i++){

            String str = phone_book[i];
            for (String s: hashSet) {
                if(!s.equals(str) && hashSet.contains(str)){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean solution3(String[] phone_book){
        HashSet<String> hashSet = Arrays.stream(phone_book).collect(Collectors.toCollection(HashSet::new));
        for (String str : hashSet)
            for (int j = 0; j < str.length(); j++) {

                if (hashSet.contains(str.substring(0, j))) {
                    return false;
                }
            }
        return true;
    }

}
