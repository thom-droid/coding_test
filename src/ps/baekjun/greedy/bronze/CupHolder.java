package ps.baekjun.greedy.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CupHolder {
    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int result = 0;
        boolean isDoubleSeatIncluded = false;

        if(str.contains("LL")){
            str = str.replaceAll("LL", "S");
            isDoubleSeatIncluded = true;
        }

        if(isDoubleSeatIncluded){
            result = str.length()+1;
        } else {
            result = n;
        }

        System.out.println(result);
    }
}
