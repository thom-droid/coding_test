package test.programming;

import java.util.*;
import java.util.stream.Stream;

public class Notification {
    public static void main(String[] args) {
        String[] str = {"john share", "mary comment", "jay share", "check notification", "check notification", "sally comment", "james share", "check notification", "lee share", "laura share", "will share", "check notification", "alice comment", "check notification"};
        System.out.println(Arrays.toString(solution(str)));
    }

    public static String[] solution(String[] records){

        // 알림창
        Stack<String> notificationStack = new Stack<>();

        // 보관함
        ArrayList<String> store = new ArrayList<>();

        String[][] record_arr = Arrays.stream(records).map(s-> s.split(" ")).toArray(String[][]::new);

        for(int i = 0; i < record_arr.length; i++){

            if(record_arr[i][0].equals("check")){

                String s = "";

                int count = 0;
                int j = i-1;

                while(j >= 1){
                    if (record_arr[j][1].equals(record_arr[j-1][1])) {
                        count++;
                        j--;
                    } else {
                        break;
                    }
                }

                if(count == 1){
                    notificationStack.pop();
                    notificationStack.pop();
                    s += record_arr[i-2][0] + " and "+ record_arr[i-1][0] + " "+ suffix(record_arr[i-2][1]);
                    store.add(s);
                }

                if(count >= 2){
                    for(int k = 0; k < count+1; k++){
                        notificationStack.pop();
                    }
                    s += record_arr[i-count-1][0] + " and " + count + " others "+suffix(record_arr[i-count-1][1]);
                    store.add(s);
                }

                if(count == 0){

                    store.add(notificationStack.pop());

                }
            } else {
                notificationStack.push(record_arr[i][0]+ " "+record_arr[i][1]);
            }

        }

        return store.stream().toArray(String[]::new);
    }

    public static int recursion(int num){
        if(num == 0){
            return 0;
        }

        return recursion(num -1);
    }

    public static String suffix(String s){
        return s.equals("share")? "shared your post": "commented on your post";
    }

//    if(i > 1 && record_arr[i][1].equals(record_arr[i-1][1])){
//
//        notificationStack.pop();
//        notificationStack.pop();
//        s += record_arr[i-1][0] + " and "+ record_arr[i][0] + " "+ record_arr[i][1] + "ed on your post";
//        store.add(s);
//        people++;
//
//    }
}
