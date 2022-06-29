package dataStructureAndAlgorithms.oj.others.others;

import java.util.Stack;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-01-11 22:24
 **/


//1.生产一个产品需要申请A，B，C，D四种原料，任何一种原料获取不到都需要还所有已经申请的原料。
//        请编码描述这个过程。

public class ALIYUN1 {
    public static void main(String[] args) {
        ProduceSum[] produceSums = new ProduceSum[4];
        produceSums[0] = new ProduceSum("A", 100);
        produceSums[1] = new ProduceSum("B", 200);
        produceSums[2] = new ProduceSum("C", 300);
        produceSums[3] = new ProduceSum("D", 400);

        ProduceUnit[] produceUnits = new ProduceUnit[4];
        produceUnits[0] = new ProduceUnit("A", 10);
        produceUnits[1] = new ProduceUnit("B", 5);
        produceUnits[2] = new ProduceUnit("C", 100);
        produceUnits[3] = new ProduceUnit("D", 200);

        produce(produceSums, produceUnits);

    }

    //sum表示各类原料总数，unit表示生产一个产品所需原料
    static void produce(ProduceSum[] sum, ProduceUnit[] unit) {
        Stack<ProduceUnit> stack = new Stack<>();
        int count = 0;
        //一直生产产品，消耗原料总数
        while (true) {
            int flag = 0;
            for (int i = 0; i < sum.length; i++) {
                sum[i].sum = sum[i].sum - unit[i].unit;
                if (sum[i].sum < 0) {
                    while (!stack.empty()) {
                        ProduceUnit produceUnit = stack.pop();
                        System.out.println("依次还清已经申请原料" + produceUnit.element);
                        flag = 1;
                    }
                    break;
                }
                stack.push(unit[i]);
            }
            if (flag == 1) break;
            count++;
            stack.clear();
        }
        //打印生产停止后结果
        for (int i = 0; i < sum.length; i++) {
            int left = sum[i].sum + unit[i].unit;
            System.out.println("原料" + sum[i].element + "：剩余" + left);
        }
        System.out.println("总共生产产品数量：" + count);
    }
}

class ProduceUnit {
    String element;
    int unit;

    public ProduceUnit(String element, int unit) {
        this.element = element;
        this.unit = unit;
    }
}

class ProduceSum {
    String element;
    int sum;

    public ProduceSum(String element, int sum) {
        this.element = element;
        this.sum = sum;
    }
}
