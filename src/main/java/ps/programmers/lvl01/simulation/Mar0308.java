package ps.programmers.lvl01.simulation;

public class Mar0308 {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int t = bandage[0];
        int healAmt = bandage[1];
        int bonus = bandage[2];
        int currentHealth = health;
        int time = 0;
        for (int i = 0; i < attacks.length; i++) {
            int healTime = attacks[i][0] - time - 1;
            time = attacks[i][0];
            if (i > 0) {
                int bonusHeal = healTime / t * bonus;
                int heal = healTime * healAmt + bonusHeal;
                currentHealth += heal;
                if (currentHealth >= health) currentHealth = health;
            }
            int damage = attacks[i][1];
            currentHealth -= damage;
            if (currentHealth <= 0) return -1;
        }
        return currentHealth > 0 ? currentHealth : -1;
    }
}
