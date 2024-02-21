package ps.baekjun.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MeetingRoomCaseWithBufferedReader {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 0;
        int earliest = 0;

        int[][] arr = new int[n][2];



        for(int i = 0; i < arr.length; i++){

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            arr[i][0] = Integer.parseInt(st.nextToken()); // 시작시간
            arr[i][1] = Integer.parseInt(st.nextToken()); // 종료 시간
        }

        // 종료 시간 기준으로 정렬
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]){
                    return o1[0] - o2[1];
                }

                return o1[1] - o2[1];
            }
        });

        // 앞의 회의의 종료 시간보다 바로 뒤 회의의 시작시간이 크면 해당 회의로 포인터를 옮기고 count 증가
        for(int[] time: arr){
            if(earliest <= time[0]){
                earliest = time[1];
                count++;
            }
        }

        System.out.println(count);

//        String[] arr = {"0 5", "2 3", "6 8", "7 8", "3 9", "5 8", "9 10"};
//        String[] test = {"1 4", "3 5", "0 6", "5 7","3 8","5 9","6 10","8 11","8 12","2 13","12 14"};
    }

    static class MeetingTime {
        int begin;
        int end;

        public MeetingTime(int begin, int end){
            this.begin = begin;
            this.end = end;
        }

        @Override
        public String toString() {
            return "[ begin :"+ begin + " / end :" + end + " ]";
        }

    }

}
