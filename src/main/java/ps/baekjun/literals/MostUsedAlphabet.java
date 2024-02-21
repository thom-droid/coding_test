package ps.baekjun.literals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MostUsedAlphabet {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().toUpperCase();

        int[][] alphabets = new int[26][2];

        for(int i = 0; i < alphabets.length; i++) {
            alphabets[i][0] = i + 65;
        }

        for(int i = 0; i < str.length(); i++){
            int index = str.charAt(i) - (int) 'A';
            alphabets[index][1]++;
        }

        Arrays.sort(alphabets, (o1, o2) -> o2[1] - o1[1]);

        if(alphabets[0][1] == alphabets[1][1]){
            System.out.println("?");
        } else {
            System.out.println((char) alphabets[0][0]);
        }

    }
}
