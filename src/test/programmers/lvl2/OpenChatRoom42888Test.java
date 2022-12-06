package test.programmers.lvl2;

import org.junit.Test;
import ps.programmers.lvl02.OpenChatRoom42888;

import static org.junit.Assert.*;

public class OpenChatRoom42888Test {

    OpenChatRoom42888 openChatRoom42888 = new OpenChatRoom42888();

    @Test
    public void solution() {

        String[] expected = new String[]{"Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."};
        String[] result = openChatRoom42888.solution(new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"});

        assertArrayEquals(expected, result);
    }
}