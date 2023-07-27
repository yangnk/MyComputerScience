package algorithms.leetcode.archive2022.archive09.lc0918;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int res = solution.countDaysTogether("10-20", "12-22", "06-21", "07-05");
        System.out.println("res = " + res);
    }
    int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {

        int arriveAliceDays = getDays(arriveAlice);
        int leaveAliceDays = getDays(leaveAlice);
        int arriveBobDays = getDays(arriveBob);
        int leaveBobDays = getDays(leaveBob);
        if (leaveAliceDays < arriveBobDays || leaveBobDays < arriveAliceDays) {
            return 0;
        }
        //Alice在Bob内
        if (arriveAliceDays >= arriveBobDays && leaveAliceDays <= leaveBobDays) {
            return leaveAliceDays - arriveAliceDays + 1;
        }
        //Bob在Alice内
        else if (arriveBobDays >= arriveAliceDays && leaveBobDays <= leaveAliceDays) {
            return leaveBobDays - arriveBobDays + 1;
        }
        //左Alice右Bob有交集
        else if (arriveAliceDays <= arriveBobDays && leaveAliceDays <= leaveBobDays) {
            return leaveAliceDays - arriveBobDays + 1;
        }
        //左Bob右Alice有交集
        else if (arriveBobDays <= arriveAliceDays && leaveBobDays <= leaveAliceDays) {
            return leaveBobDays - arriveAliceDays + 1;
        }
        return 0;
    }

    private int getDays(String str) {
        String[] strArr = str.split("-");
        int month = Integer.valueOf(strArr[0]);
        int day = Integer.valueOf(strArr[1]);
        int res = 0;
        for (int i = 0; i < month - 1; i++) {
            res += days[i];
        }
        res += day;
        return res;
    }
}
