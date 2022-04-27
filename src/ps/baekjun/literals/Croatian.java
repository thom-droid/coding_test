package ps.baekjun.literals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Croatian {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        String[] croatian = {"c=", "c-", "dz=", "d-","lj","nj","s=","z="};

        for(int i = 0; i < croatian.length; i++){
            if(str.contains(croatian[i]))
                str = str.replace(croatian[i], "a");

        }

        System.out.println(str.length());
    }
}
