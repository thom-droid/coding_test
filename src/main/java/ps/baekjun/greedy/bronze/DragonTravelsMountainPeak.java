package ps.baekjun.greedy.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class DragonTravelsMountainPeak {

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // numbers of peaks
        int n = Integer.parseInt(br.readLine());

        // peak heights
        String str = br.readLine();

        int[][] peakArray = new int[n][2];

        StringTokenizer st = new StringTokenizer(str, " ");

        int i = 0;
        while(st.hasMoreTokens()){
            peakArray[i][0] = Integer.parseInt(st.nextToken());
            i++;
        }

        for(int j = 0; j < n - 1; j++){
            for(int k = j + 1; k < n; k++){
                if(peakArray[j][0] > peakArray[k][0]){
                    peakArray[j][1]++;
                } else {
                    break;

                }
            }
        }

        Arrays.sort(peakArray, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });

//        System.out.println(Arrays.deepToString(peakArray));
        System.out.println(peakArray[0][1]);


    }
}
