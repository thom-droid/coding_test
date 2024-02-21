package ps.programmers.lvl01;

public class FoodFight {

    public String solution(int[] food) {

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < food.length; i++) {

            sb.append(String.valueOf(i).repeat(food[i] / 2));

        }

        String former = sb.toString();

        return String.join("", former, "0", sb.reverse());
    }


}
