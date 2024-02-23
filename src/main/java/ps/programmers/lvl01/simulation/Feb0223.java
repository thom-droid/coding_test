package ps.programmers.lvl01.simulation;

import java.util.ArrayList;
import java.util.HashMap;

public class Feb0223 {
    public int[] solution(String today, String[] terms, String[] privacies) {
        String now = today.replaceAll("\\.", "");
        HashMap<String, Integer> map = new HashMap<>();
        for (String t : terms) {
            String[] split = t.split(" ");
            map.put(split[0], Integer.parseInt(split[1]));
        }

        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0, privaciesLength = privacies.length; i < privaciesLength; i++) {
            String privacy = privacies[i];
            char term = privacy.charAt(privacy.length() - 1);
            String[] split = privacy.split("\\.");
            int year = Integer.parseInt(split[0]);
            int month = Integer.parseInt(split[1]);
            int day = Integer.parseInt(split[2].substring(0, 2));
            Integer contract = map.get(Character.toString(term));

            int[] dayAndAccumulatedMonth = calculateDayAndAccumulatedMonth(day);
            day = dayAndAccumulatedMonth[0];
            int accumulatedMonth = dayAndAccumulatedMonth[1];
            int[] monthAndAccumulatedYear = calculateMonthAndAccumulatedYear(month + accumulatedMonth, contract);
            month = monthAndAccumulatedYear[0];
            year += monthAndAccumulatedYear[1];
            String expireDate = year + formatDate(month) + formatDate(day);

            if (now.compareTo(expireDate) > 0) {
                answer.add(i + 1);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).sorted().toArray();

    }

    private String formatDate(int data) {
        return String.format("%02d", data);
    }

    private int[] calculateDayAndAccumulatedMonth(int day) {
        int[] dayAndAccumulatedMonth = new int[2];
        if (day == 1) {
            dayAndAccumulatedMonth[0] = 28;
            dayAndAccumulatedMonth[1] = -1;
            return dayAndAccumulatedMonth;
        }
        dayAndAccumulatedMonth[0] = day - 1;
        return dayAndAccumulatedMonth;
    }

    private int[] calculateMonthAndAccumulatedYear(int thisMonth, int contract) {
        return calculate(thisMonth + contract);
    }

    private int[] calculate(int totalMonth) {
        int[] monthAndAccumulatedYear = new int[2];
        while (12 < totalMonth) {
            totalMonth -= 12;
            monthAndAccumulatedYear[1]++;
        }
        monthAndAccumulatedYear[0] = totalMonth;
        return monthAndAccumulatedYear;
    }

}
