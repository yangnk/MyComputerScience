package algorithms.oj;

// 本题为考试多行输入输出规范示例，无需提交，不计分。
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String[] strings = s.split(",");
        int length = strings.length;
        int[][] matrix = new int[4][length];
        for (int i = 0; i < length; i++) {
            matrix[0][i] = Integer.valueOf(strings[i]);
        }

        int rowNum = 1;
        while (sc.hasNextLine()) {
            String s1 = sc.nextLine();
            String[] strings1 = s1.split(",");
            for (int i = 0; i < length; i++) {
                matrix[rowNum][i] = Integer.valueOf(strings1[i]);
            }
            rowNum++;
        }

        int[] timeArr = new int[length];
        for (int i = 0; i < length; i++) {
            int time = (int) (matrix[1][i] / 2 + (matrix[0][i] - matrix[1][i] / 10) + matrix[2][i] * 15 * 0.5);
            timeArr[i] = time;
        }
        System.out.println(Arrays.toString(timeArr));

        List<Integer> timeList = Arrays.stream(timeArr).boxed().collect(Collectors.toList());
        List<Integer> scoreList = Arrays.stream(matrix[3]).boxed().collect(Collectors.toList());

        Integer minTime = Collections.min(timeList);
        int minTimeIndex = timeList.indexOf(minTime);

        Integer maxScore = Collections.max(scoreList);
        int maxScoreIndex = scoreList.indexOf(maxScore);

        if (timeList.get(maxScoreIndex) - minTime < 60) {
            System.out.println(1111111);
            System.out.println(maxScoreIndex + 1 + "," + timeArr[maxScoreIndex]);
        }
        System.out.println(222222);
        System.out.println(minTimeIndex + 1 + "," + timeArr[minTimeIndex]);
    }
}
