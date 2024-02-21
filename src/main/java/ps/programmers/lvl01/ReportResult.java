package ps.programmers.lvl01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class ReportResult {

    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;

        String[] id_list2 = {"con", "ryan"};
        String[] report2 = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k2 = 3;



        solution(id_list, report, k);
        solution(id_list2, report2, k2);
    }


    public static int[] solution(String[] id_list, String[] report, int k){

        boolean[][] isReported = new boolean[id_list.length][id_list.length];
        int[] count = new int[id_list.length];
        int[] result = new int[id_list.length];

        String[] reducedReport = Arrays.stream(report).distinct().sorted().toArray(String[]::new);

        String[][] str = new String[reducedReport.length][2];
        StringTokenizer st;

        for(int i = 0; i < reducedReport.length; i++){
            st = new StringTokenizer(reducedReport[i], " ");

            str[i][0] = st.nextToken();
            str[i][1] = st.nextToken();

        }

        // [ [frodo, apeach],[apeach,muzi], [frodo, muzi]]...

        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < id_list.length; i++){
            map.put(id_list[i], i);
        }

        for(int i = 0; i < id_list.length; i++){

            for(int j = 0; j < str.length; j++){

                // a가 b를 신고했을 때 b 자리를 true로 변경
                if(str[j][0].equals(id_list[i])){
                    int idx = map.get(str[j][1]);
                    isReported[i][idx] = true;
                }

                if(str[j][1].equals(id_list[i])){
                    count[i]++;
                }
            }

        }

        for(int i = 0; i < count.length; i++){

            if(count[i] >= k){

                for(int j = 0; j < id_list.length; j++){

                    if(isReported[j][i]){
                        result[j]++;
                    }
                }

            }
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
}
