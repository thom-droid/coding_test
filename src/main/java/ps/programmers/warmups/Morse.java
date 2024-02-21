package ps.programmers.warmups;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Morse {

    public String solution(String letter) {
        HashMap<String, String> morseMap = new HashMap<>();
        String[] morse = {
                ".-", "a" ,"-...","b","-.-.","c" ,"-..","d",".","e","..-.","f",
                "--.", "g","....","h","..","i",".---","j","-.-","k",".-..","l",
                "--","m","-.","n","---","o",".--.","p","--.-","q",".-.","r",
                "...","s","-","t","..-","u","...-","v",".--","w","-..-","x",
                "-.--","y","--..","z"
        };

        for (int i = 0; i < morse.length; i += 2) {
            morseMap.putIfAbsent(morse[i], morse[i + 1]);
        }

        return Arrays.stream(letter.split(" ")).map(morseMap::get).collect(Collectors.joining());
    }
}
