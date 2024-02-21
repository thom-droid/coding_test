package ps.programmers.lvl01;

//kakao
public class SecretMap {

    public String[] solution(int n, int[] arr1, int[] arr2) {

        String[] answer = new String[n];

        String[] map1 = new String[n];
        String[] map2 = new String[n];

        for (int i = 0; i < n; i++) {
            int val = arr1[i];
            int val2 = arr2[i];
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            sb1.append(Integer.toBinaryString(val));
            sb2.append(Integer.toBinaryString(val2));

            while (sb1.length() < n) {
                sb1.insert(0, "0");
            }

            while (sb2.length() < n) {
                sb2.insert(0, "0");
            }

            map1[i] = sb1.toString();
            map2[i] = sb2.toString();
        }

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            String str1 = map1[i];
            String str2 = map2[i];

            for (int j = 0; j < n; j++) {
                if (str1.charAt(j) == '1' || str2.charAt(j) == '1') {
                    sb.append("1");
                } else {
                    sb.append("0");
                }
            }

            answer[i] = sb.toString();
        }

        for (int i = 0; i < answer.length; i++) {
            answer[i] = answer[i].replaceAll("1", "#").replaceAll("0", " ");
        }

        return answer;
    }

}
