package test.programmers.lvl2;

import org.junit.Test;
import ps.programmers.lvl02.SkillTree49993;

import static org.junit.Assert.*;

public class SkillTree49993Test {

    SkillTree49993 skillTree49993 = new SkillTree49993();

    @Test
    public void solution() {

        int expected =2;
        int result = skillTree49993.solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA"});
        int result2 = skillTree49993.solution2("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA"});


        assertEquals(expected, result);
    }
}