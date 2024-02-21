package ps.baekjun.greedy.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordCombi {

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0 ;

        String str = br.readLine();
        str = str.replaceAll("pPAp", "c");
        for(int i = 0; i < str.length(); i ++){
            if(str.charAt(i)=='c'){
            count++;
            }
        }

        System.out.println(count);
        String[] array = br.readLine().split("");
//
//        for(int i = 3; i < array.length;){
//            if(array[i].equals("p") && array[i-1].equals("A") && array[i-2].equals("P") && array[i-3].equals("p")){
//                count++;
//                for(int j = i - 3; j < i+1; j++){
//                    array[j] = "";
//                }
//
//                i += 4;
//            } else {
//                i++;
//            }
//        }
//
//        System.out.println(count);


//        String str = br.readLine();
//        String word = "pPAp";
//        int count = 0;
//
//        while(str.contains(word)){
//            str = str.replaceFirst("pPAp", "");
//            count++;
//        }
//
//        System.out.println(count);
    }

}
