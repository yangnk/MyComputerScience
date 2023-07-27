package algorithms.leetcode.archive2022.archive09.lc0918;

import java.util.Arrays;

public class Solution1 {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);

        int playersIdx = 0;
        int trainersIdx = 0;
        int ans = 0;
        while (playersIdx < players.length) {
            while (trainersIdx < trainers.length) {
                if (players[playersIdx] <= trainers[trainersIdx]) {
                    trainersIdx++;
                    ans++;
                    break;
                }
                trainersIdx++;
            }
            playersIdx++;
        }
        return ans;
    }
}
