package ps.programmers.warmups;

public class StringToNumber {
    public int solution(String my_string) {
        String[] arr = my_string.split(" ");
        int result = Integer.parseInt(arr[0]);

        for (int i = 1; i < arr.length - 1; i += 2) {
            int val = Integer.parseInt(arr[i + 1]);

            if(arr[i].equals("+")){
                result += val;
            } else{
                result -= val;
            }
        }

        return result;
    }
}
