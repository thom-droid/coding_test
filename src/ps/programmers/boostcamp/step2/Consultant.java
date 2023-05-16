package ps.programmers.boostcamp.step2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Consultant {

    public String[] solution(String[][] booked, String[][] unbooked) {

        // 시간을 체크하는 변수가 있다
        // 먼저 예약 쪽에서 현재 시간과 비교해서 현재 시간보다 느리거나 같은 내담자를 상담한다.
        // 예약 쪽에 해당되는 내담자가 없으면 예약하지 않은 상담자를 체크한다.
        // 남은 상담자를 순서대로 상담한다.

        String[] result = new String[booked.length + unbooked.length];
        int bookedIdx = 0;
        int unbookedIdx = 0;

        String now;

        if (booked[0][0].compareTo(unbooked[0][0]) <= 0) {
            now = booked[0][0];
            result[0] = booked[0][1];
            bookedIdx++;
        } else {
            now = unbooked[0][0];
            result[0] = unbooked[0][1];
            unbookedIdx++;
        }

        int resultIdx = 1;
        now = addTime(now);

        while (bookedIdx < booked.length && unbookedIdx < unbooked.length) {
            String bookedTime = booked[bookedIdx][0];
            String unbookedTime = unbooked[unbookedIdx][0];

            // 예약 손님이 있는지 먼저 확인한다.
            if (bookedTime.compareTo(now) <= 0) {
                result[resultIdx] = booked[bookedIdx][1];
                resultIdx++;
                bookedIdx++;

                // 없으면 예약하지 않는 손님을 확인하여 처리한다.
            }else if (unbookedTime.compareTo(now) <= 0) {
                result[resultIdx] = unbooked[unbookedIdx][1];
                resultIdx++;
                unbookedIdx++;
            }
                // 현재 시간에 손님이 없는 경우 예약 시간과 다음 손님의 시간을 비교해서 빠른 손님을 처리한다.
            else {

                // 예약한 시간이 빠른 경우
                if (bookedTime.compareTo(unbookedTime) <= 0) {
                    now = bookedTime;
                    result[resultIdx] = booked[bookedIdx][1];
                    resultIdx++;
                    bookedIdx++;
                } else {
                    now = unbookedTime;
                    result[resultIdx] = unbooked[unbookedIdx][1];
                    resultIdx++;
                    unbookedIdx++;
                }
            }

            now = addTime(now);

        }

        // 남은 내담자 처리
        while (bookedIdx < booked.length && resultIdx < result.length) {
            result[resultIdx] = booked[bookedIdx][1];
            resultIdx++;
            bookedIdx++;
        }

        while (unbookedIdx < unbooked.length && resultIdx < result.length) {
            result[resultIdx] = unbooked[unbookedIdx][1];
            resultIdx++;
            unbookedIdx++;
        }

        return result;
    }

    private String addTime(String now) {
        int h = Integer.parseInt(now.substring(0, 2));
        int m = Integer.parseInt(now.substring(3));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime localTime = LocalTime.of(h, m).plusMinutes(10);
        return localTime.format(formatter);
    }

//
//    Customer> bookedList = Arrays.stream(booked).map(b -> new Customer(b[0], b[1], true)).collect(Collectors.toList());
//    List<Customer> unbookedList = Arrays.stream(unbooked).map(b -> new Customer(b[0], b[1], false)).collect(Collectors.toList());
//
//    Comparator<Customer> customerComparator = Comparator.comparing(Customer::getTime);
//    Queue<Customer> queue = new PriorityQueue<>(customerComparator);
//
//        queue.addAll(bookedList);
//        queue.addAll(unbookedList);
//
//    Customer first = queue.poll();
//    String now = first.getTime();
//    int resultIdx = 1;
//
//        while (!queue.isEmpty()) {
//
//        Customer customer = queue.poll();
//
//        if (now.compareTo(customer.getTime()) <= 0) {
//
//        }
//    }
}
