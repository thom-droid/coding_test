package test.programmers.lvl1;

import org.junit.Test;
import ps.programmers.warmups.Login;

import static org.junit.Assert.*;

public class LoginTest {

    Login login = new Login();

    @Test
    public void solution() {

        String expected = "login";
        String result = login.solution(new String[]{"meosseugi", "1234"}, new String[][]{{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}});

        String expected2 = "wrong pw";
        String result2 = login.solution(new String[]{"programmer01", "15789"}, new String[][]{{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}});

        String expected3 = "fail";
        String result3 = login.solution(new String[]{"rabbit04", "98761"}, new String[][]{{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}});

        assertEquals(expected, result);
        assertEquals(expected2, result2);
        assertEquals(expected3, result3);
    }
}