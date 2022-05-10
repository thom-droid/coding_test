package practices.programming;

import java.util.*;

public class Notification3 {

    static String lastUser = "";
    static String lastCommand = "";

    public static void main(String[] args) {
        solution();
    }

    public static void solution(){
        String[] test = {"john share", "mary comment", "jay share", "check notification", "check notification", "sally comment", "james share", "check notification", "lee share", "laura share", "will share", "check notification", "alice comment", "check notification"};
        Stack<String> notificationStack = new Stack<>();
        List<String> inbox = new ArrayList<>();
        String firstNotification = test[0];
        notificationStack.push(firstNotification);
        String[] arr = firstNotification.split(" ");
        lastUser = arr[0];
        lastCommand = arr[1];
        int people = 0;

        for(int i = 1; i < test.length; i++){
            StringTokenizer st = new StringTokenizer(test[i], " ");
            int len = st.countTokens(); // john share -> 2, john and nancy share -> 4, john and 2 others share -> 5
            String notification = "";

            if(len == 2){
                String currentUser = st.nextToken();
                String command = st.nextToken();

                // check notification
                if(command.equals("notification")){
                    inbox.add(notificationStack.pop());
                    setLastWord(notificationStack.peek());

                    // share or comment
                } else {
                    // merge strings if commands are same
                    if(command.equals(lastCommand)){
                        st = new StringTokenizer(notificationStack.peek(), " ");
                        len = st.countTokens();
                        if(len == 2){
                            notification = String.format("%s and %s %s", lastUser, currentUser, command);

                        } else if(len == 4){
                            String firstUser = st.nextToken();
                            String and = st.nextToken();
                            String user = st.nextToken();
                            String currentCommand = st.nextToken();

                            notification = String.format("%s and 2 others %s", firstUser, command);

                        } else if(len == 5){
                            String firstUser = st.nextToken();
                            String and = st.nextToken();
                            int numbers = Integer.parseInt(st.nextToken()) + 1;
                            String others = st.nextToken();
                            String currentCommand = st.nextToken();
                            notification = String.format("%s and %s others %s", firstUser, numbers, command);
                        }

                        // remove first el from stack and push
                        notificationStack.pop();
                        setLastWord(notificationStack.peek());

                        // john share 다음 jane comment인 경우
                    } else {
                        notification = String.format("%s %s", currentUser, command);
                        lastCommand = command;
                        lastUser = currentUser;
                    }
                    notificationStack.push(notification);
                    setLastWord(notificationStack.peek());
                }
            }
        }
        System.out.println(Arrays.toString(inbox.toArray()));
    }

    public static void setLastWord(String peek){
        StringTokenizer st = new StringTokenizer(peek, " ");
        int len = st.countTokens();
        if(len== 2){
            lastUser = st.nextToken();
            lastCommand = st.nextToken();
        }

        if(len==4){
            lastUser = st.nextToken();
            st.nextToken();
            st.nextToken();
            lastCommand = st.nextToken();
        }

        if(len ==5){
            lastUser = st.nextToken();
            st.nextToken();
            st.nextToken();
            st.nextToken();
            lastCommand = st.nextToken();
        }
    }


}
