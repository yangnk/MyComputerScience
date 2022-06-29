package dataStructureAndAlgorithms.leetcode.lc0612;

//
//5259. 计算应缴税款总额 显示英文描述
//        通过的用户数0
//        尝试过的用户数0
//        用户总通过次数0
//        用户总提交次数0
//        题目难度Easy
//        给你一个下标从 0 开始的二维整数数组 brackets ，其中 brackets[i] = [upperi, percenti] ，表示第 i 个税级的上限是 upperi ，征收的税率为 percenti 。税级按上限 从低到高排序（在满足 0 < i < brackets.length 的前提下，upperi-1 < upperi）。
//
//        税款计算方式如下：
//
//        不超过 upper0 的收入按税率 percent0 缴纳
//        接着 upper1 - upper0 的部分按税率 percent1 缴纳
//        然后 upper2 - upper1 的部分按税率 percent2 缴纳
//        以此类推
//        给你一个整数 income 表示你的总收入。返回你需要缴纳的税款总额。与标准答案误差不超 10-5 的结果将被视作正确答案。

//示例 1：
//
//        输入：brackets = [[3,50],[7,10],[12,25]], income = 10
//        输出：2.65000
//        解释：
//        前 $3 的税率为 50% 。需要支付税款 $3 * 50% = $1.50 。
//        接下来 $7 - $3 = $4 的税率为 10% 。需要支付税款 $4 * 10% = $0.40 。
//        最后 $10 - $7 = $3 的税率为 25% 。需要支付税款 $3 * 25% = $0.75 。
//        需要支付的税款总计 $1.50 + $0.40 + $0.75 = $2.65 。


class Solution {
    public double calculateTax(int[][] brackets, int income) {
        int sum = 0;
        for (int i = 0; i < brackets.length; i++) {
            if (brackets[i][0] < income) {
                //需要着重考虑第一个和最后一个
                if (i == 0) {
                    sum = brackets[i][0] * brackets[i][1];
                } else {
                    sum += (brackets[i][0] - brackets[i - 1][0]) * brackets[i][1];
                }
            } else {
                if (i == 0) {
                    sum = income * brackets[i][1];
                } else {
                    sum += (income - brackets[i - 1][0]) * brackets[i][1];
                }
                break;
            }
        }
        return ((double) sum) / 100;
    }
}