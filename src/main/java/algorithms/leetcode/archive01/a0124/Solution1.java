package algorithms.leetcode.archive01.a0124;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1 {

    public static void main(String[] args) {
        int aa = 1;
        Long bb = (long)aa;
    }

    public long dividePlayers(int[] skill) {
        int len = skill.length;
        int sum = Arrays.stream(skill).sum();
        int teamSum = sum / (len / 2);
        List<Team> list = new ArrayList<>();

        Arrays.sort(skill);
        for (int i = 0; i < len / 2; i++) {
            int a = skill[i];
            int b = skill[len - i - 1];
            if (a + b != teamSum) {
                return -1;
            }
            list.add(new Team(a, b));
        }
        Long ans = 0L;
        for (Team team : list) {
            ans += (long) team.a * (long) team.b;
        }
        return ans;
    }
}

class Team{
    int a;
    int b;

    public Team(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
