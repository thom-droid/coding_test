package ps.baekjun.greedy;

import java.util.*;

public class MeetingRoomCaseWithScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int earliest = 0;

        String[] strArr = new String[n];

        List<MeetingTime> list = new ArrayList<>();

        for(int i = 0; i < strArr.length; i++){

            String s = scanner.nextLine();
            String[] strings = s.split(" ");

            int begin = Integer.parseInt(strings[0]);
            int end = Integer.parseInt(strings[1]);

            MeetingTime m = new MeetingTime(begin, end);
            list.add(m);
        }

        // 종료 시간 기준으로 정렬
        list.sort((o1, o2) -> {
            if(o1.end == o2.end)
                return o1.begin - o2.begin;

            return o1.end - o2.end;
        });

        System.out.println(Arrays.deepToString(list.toArray()));

        // 앞의 회의의 종료 시간보다 바로 뒤 회의의 시작시간이 크면 해당 회의로 포인터를 옮기고 count 증가
        for(MeetingTime m: list){
            if(earliest <= m.begin){
                earliest = m.end;
                count++;
            }
        }

        System.out.println(count);

        String[] arr = {"0 5", "2 3", "6 8", "7 7", "3 9", "5 6", "9 10"};
        String[] test = {"1 4", "3 5", "0 6", "5 7","3 8","5 9","6 10","8 11","8 12","2 13","12 14"};
//        resolve(arr);
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
