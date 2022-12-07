package ps.programmers.lvl02;

import java.util.ArrayList;

public class SkillTree49993 {

    public int solution(String skill, String[] skill_trees) {

        int answer = 0;
        ArrayList<Integer> indexList = new ArrayList<>();

        for (int i = 0; i < skill_trees.length; i++) {

            String skillTree = skill_trees[i];
            boolean isOrdered = true;

            for (int j = 0; j < skill.length(); j++) {

                int index = skillTree.indexOf(skill.charAt(j));

                if (index < 0) {
                    index = 27;
                }

                indexList.add(index);

            }

            for (int k = 0; k < indexList.size() - 1; k++) {

                if (indexList.get(k) > indexList.get(k + 1)) {
                    isOrdered = false;
                    break;
                }
            }

            if (isOrdered) {
                answer++;
            }

            indexList.clear();

        }

        return answer;
    }

    public int solution2(String skill, String[] skill_trees) {

        int answer =0;

        String regex = "[^" + skill + "]";

        for (String skill_tree : skill_trees) {
            String replaced = skill_tree.replaceAll(regex, "");

            if (skill.indexOf(replaced) != 0) {
                continue;
            }

            answer++;
        }

        return answer;
    }
}
