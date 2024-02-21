package ps.programmers.skillcheck.lvl2;

import java.util.HashMap;
import java.util.Map;

public class SkillCheck2_1 {

    public static void main(String[] args) {
        String[] musicinfos = {"12:00,12:14,HELLO,C#DEFGAB", "13:00,13:05,WORLD,ABCDEF"};
        System.out.println(solution("ABC",musicinfos));

    }

    public static String solution(String m, String[] musicinfos){

        Map<Integer, String> nominees = new HashMap<>();
        m = replaceAllSharpCode(m);

        for(String s: musicinfos){

            String[] musicinfo = s.split(",");
            String[] startStr = musicinfo[0].split(":");
            String[] endStr = musicinfo[1].split(":");
            int startHour = Integer.parseInt(startStr[0]);
            int startMinute = Integer.parseInt(startStr[1]);
            int endHour = Integer.parseInt(endStr[0]);
            int endMinute = Integer.parseInt(endStr[1]);
            int hourToMinute = (endHour - startHour) * 60;
            int playTime = (endMinute -  startMinute) + hourToMinute;
            String musicToBeCompared = replaceAllSharpCode(musicinfo[3]);
            String musicTitle = musicinfo[2];

            String music = buildString(playTime, musicToBeCompared);

            if(music.contains(m)){
                nominees.put(playTime, musicTitle);
            }
        }

        if(nominees.isEmpty()){
            return "(None)";
        } else {
            int key = nominees.keySet().stream().mapToInt(Integer::intValue).max().getAsInt();
            return nominees.get(key);
        }
    }

    public static String buildString(int time, String str){
        int i  = 0;
        StringBuffer sb = new StringBuffer();

        while(time > 0){
            if(i == str.length()){
                i = 0;
            }
            sb.append(String.valueOf(str.charAt(i)));
            i++;
            time--;

        }

        return sb.toString();

    }

    public static String replaceAllSharpCode(String str){
        str = str.replaceAll("C#", "c");
        str = str.replaceAll("D#", "d");
        str = str.replaceAll("F#", "f");
        str = str.replaceAll("G#", "g");
        str = str.replaceAll("A#", "a");
        return str;
    }

}
