package ps.programmers.lvl02.graph;

import java.util.HashSet;

public class PrimeNumber42839 {

    private HashSet<Integer> primes = new HashSet<>();

    public int solution(String numbers) {

        boolean[] visited = new boolean[numbers.length()];

        for (int i = 0; i < numbers.length(); i++) {
            visited[i] = true;
            StringBuilder sb = new StringBuilder(String.valueOf(numbers.charAt(i)));
            int num = numbers.charAt(i) - 48;
            if (isPrime(num)) {
                primes.add(num);
            }
            backtracking(1, visited, numbers, sb);
            visited[i] = false;
        }

        return primes.size();

    }

    private boolean isPrime(int num){

        if(num < 2){
            return false;
        }

        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }

        return true;
    }

    private void backtracking(int len, boolean[] visited, String numbers, StringBuilder value) {

        if (len == numbers.length()) {
            return;
        }

        for (int i = 0; i < numbers.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                value.append(numbers.charAt(i));
                int val = Integer.parseInt(value.toString());
                if (isPrime(val)) {
                    primes.add(val);
                }
                backtracking(len + 1, visited, numbers, value);
                visited[i] = false;
                value.deleteCharAt(value.length() - 1);
            }

        }

    }
}
