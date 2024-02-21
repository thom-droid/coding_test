package ps.programmers.lvl02;

import java.net.Inet4Address;
import java.util.*;

public class ParkingLotFare92341 {

    public Integer[] solution(int[] fees, String[] records) {

        int freeTime = fees[0];
        int normalFare = fees[1];
        int unitTime = fees[2];
        int unitPrice = fees[3];
        int midnight = 23 * 60 + 59;

        TreeMap<String, LinkedList<String>> map = new TreeMap<>();

        // hashmap 에 차량 번호와 가격을 저장
        // 문자열을 순회하면서 차량 번호와 시간을 확인
        // IN 이면

        for (int i = 0; i < records.length; i++) {
            String[] record = records[i].split(" ");
            LinkedList<String> times = new LinkedList<>();
            map.put(record[1], map.getOrDefault(record[1], times));
            map.get(record[1]).add(record[0]);
        }

        ArrayList<Integer> answer = new ArrayList<>();

        for (Map.Entry<String, LinkedList<String>> entry : map.entrySet()) {

            int totalTime = 0;
            LinkedList<String> timeList = entry.getValue();

            while (timeList.size() >= 2) {

                String in = timeList.poll();
                String out = timeList.poll();

                int time1 = Integer.parseInt(in.substring(0, 2)) * 60 + Integer.parseInt(in.substring(3));
                int time2 = Integer.parseInt(out.substring(0, 2)) * 60 + Integer.parseInt(out.substring(3));

                int usageTime = time2 - time1;
                totalTime += usageTime;

            }

            if (!timeList.isEmpty()) {

                String time = timeList.poll();
                int time1 = Integer.parseInt(time.substring(0, 2)) * 60 + Integer.parseInt(time.substring(3));
                totalTime += midnight - time1;

            }

            if (totalTime <= freeTime) {

                answer.add(normalFare);
                continue;

            }

            int totalFare;
            int val1 = (int) Math.ceil((double) (totalTime - freeTime) / unitTime);
            totalFare = normalFare + val1 * unitPrice;
            answer.add(totalFare);

        }

        return answer.toArray(Integer[]::new);
    }

    private int convertTimeAsInt(String time) {
        String[] hhmm = time.split(":");
        return Integer.parseInt(hhmm[0]) * 60 + Integer.parseInt(hhmm[1]);
    }

    public Integer[] solution2(int[] fees, String[] records) {

        int freeTime = fees[0];
        int normalFare = fees[1];
        int unitTime = fees[2];
        int unitPrice = fees[3];
        int midnight = 23 * 60 + 59;

        TreeMap<String, Integer> recordByCar = new TreeMap<>();

        ArrayList<Integer> answer = new ArrayList<>();

        for (String s : records) {

            String[] record = s.split(" ");
            int val = record[2].equals("IN") ? -convertTimeAsInt(record[0]) : convertTimeAsInt(record[0]);
            recordByCar.put(record[1], recordByCar.getOrDefault(record[1], 0) + val);

        }

        for (Map.Entry<String, Integer> record : recordByCar.entrySet()) {

            int totalTime = record.getValue();

            if (totalTime < 0) {
                totalTime += 1439;
            }

            if (totalTime <= freeTime) {

                answer.add(normalFare);
                continue;

            }

            int totalFare;
            int val1 = (int) Math.ceil((double) (totalTime - freeTime) / unitTime);
            totalFare = normalFare + val1 * unitPrice;
            answer.add(totalFare);

        }

        return answer.toArray(Integer[]::new);

    }

}
