package test.programming;

import java.util.*;
import java.util.stream.Collectors;

public class Notification2 {

    public static void main(String[] args) {
        String[] test = {"john share", "mary comment", "jay share", "check notification", "check notification", "sally comment", "james share", "check notification", "lee share", "laura share", "will share", "check notification", "alice comment", "check notification"};
        List<String> test2 = Arrays.stream(test).collect(Collectors.toList());
//        System.out.println(Arrays.toString(getResult(test2).toArray()));


        String[] testStr = {"john share", "mary share", "jay share", "james comment", "lee share", "check notification", "sally comment", "laura comment", "check notification", "will share", "ruby share", "check notification"};
        test2 = Arrays.stream(testStr).collect(Collectors.toList());
        System.out.println(Arrays.toString(getResult(test2).toArray()));
    }
    public static class Noti{
        List<String> store = new ArrayList<>();
        Stack<String> notification = new Stack<>();

        public Noti(List<String> store, Stack<String> notification) {
            this.store = store;
            this.notification = notification;
        }
    }

    public static List<String> getResult(List<String> records){
        List<String> store = new LinkedList<>();
        Stack<String> notifications = new Stack<>();
        Noti noti = new Noti(store, notifications);
        notifications.add(records.get(0));

        for(int i = 1; i < records.size(); i++){
            String[] words = records.get(i).split(" ");
            String nickName = words[0];
            String command = words[1];
            noti = doCommand(nickName, command, store, notifications);
            store = noti.store;
            notifications = noti.notification;
        }
//        records.stream().forEach(record -> {
//            String[] words = record.split(" ");
//            String nickName = words[0];
//            String command = words[1];
//            doCommand(nickName, command, store, notifications);
//        });

        return store.stream().map(notis -> {
            String[] words = notis.split(" ");
            String command = words[words.length-1];
            String newNoti = "";
            if(command.equals("share")){
                newNoti = notis + "ed your post";
            }else{
                newNoti = notis + "ed on your post";
            }
            return newNoti;
        }).collect(Collectors.toList());
    }


    public static Noti doCommand(String nickName, String command, List<String> store, Stack<String> notifications){
        if(command.equals("share") || command.equals("comment")){
            String notification = notifications.get(notifications.size()-1);
            String[] words = notification.split(" ");
            String lastCommand = "";
            String lastNickName = "";
            boolean isAlone = true;
            int peoples = 0;
            String newNotification = "";

            if(words.length > 2){
                lastCommand = words[words.length-1];
                lastNickName = words[0];
                isAlone = false;
                if(words.length == 4){
                    peoples = 1;
                }else{
                    peoples = Integer.parseInt(words[2]);
                }
            }else{
                lastNickName = words[0];
                lastCommand = words[1];
            }

            if(lastCommand.equals(command)){

                //합치기
                // 딱 1명만 있는 경우
                // 이미 2명인 경우
                // 그 이상인 경우
                if(isAlone){
                    newNotification = String.format("%s and %s %s", lastNickName, nickName, lastCommand);
                }else{
                    newNotification = String.format("%s and %s others %s", lastNickName, peoples+1, lastCommand);
                }
//                notifications.add(notifications.size()-1, newNotification);
                notifications.pop();
            }else{
                newNotification = String.format("%s %s", nickName, command);
            }

            notifications.add(newNotification);

        } else{
            //notifications -> stackStore
            String lastNotification = notifications.pop();
            store.add(lastNotification);
        }
        return new Noti(store, notifications);
    }

}
