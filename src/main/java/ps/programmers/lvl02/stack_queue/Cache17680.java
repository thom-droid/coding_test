package ps.programmers.lvl02.stack_queue;

import java.util.*;

public class Cache17680 {

    private HashMap<String, Integer> cacheMap = new HashMap<>();
    private LinkedList<String> cacheQueue = new LinkedList<>();

    private void hitNode(String node) {
        cacheQueue.remove(node);
        cacheQueue.add(node);
    }
    // 최소값을 제거해주어야한다.
    public int solution(int cacheSize, String[] cities) {

        if (cacheSize >= cities.length || cacheSize == 0) {
            return cities.length * 5;
        }

        int answer = 0;
        HashMap<String, Integer> map = new HashMap<>();
        LinkedList<String> queue = new LinkedList<>();

        String head = cities[0].toLowerCase();
        cacheQueue.add(head);
        cacheMap.put(head, 0);
        answer += 5;

        for (int i = 1; i < cities.length; i++) {

            String city = cities[i].toLowerCase();

            if (cacheMap.size() < cacheSize) {
                if (cacheMap.containsKey(city)) {
                    hitNode(city);
                    answer++;
                } else {
                    map.put(city, 0);
                    queue.add(city);
                    answer += 5;
                }
            } else {
                if (cacheMap.containsKey(city)) {
                    hitNode(city);
                    answer++;
                } else {
                    String old = queue.poll();
                    queue.add(city);
                    map.remove(old);
                    map.put(city, 0);
                    answer += 5;
                }
            }

        }

        return answer;
    }



    public int solution2(int cacheSize, String[] cities) {

        int answer = 0;
        LinkedHashSet<String> cache = new LinkedHashSet<>();

        for (int i = 0; i < cities.length; i++) {

            String city = cities[i].toLowerCase();

            if (cache.size() >= cacheSize) {

            }
            if (cache.contains(city)) {
                // 해당 아이템은 LRU가 아니게 되므로 linkedSet의 가장 마지막 순서로 보내주어야 한다.
                cache.remove(city);
                cache.add(city);
                answer++;
            } else {
                // 첫 번째 아이템을 제거한다
                // 아이템을 마지막에 추가한다.
                cache.add(city);
                answer += 5;
            }
        }

        return answer;
    }

}
