package algorithms.leetcode.archive2022.archive10.lc1003;

public class LUPrefix {
    int[] arr;
    int curPtr = 0;
    int tailPtr = 0;
    int curEle = 0;
    int tailEle = 0;

    public LUPrefix(int n) {
        arr = new int[n + 1];
    }

    public void upload(int video) {
        arr[video] = 1;
        if (curPtr == tailPtr) {
            if (video == curPtr + 1) {
                curPtr = video;
                tailPtr = video;
                curEle++;
                tailEle++;
                System.out.println("1.1.video = " + video);
            } else {
                tailEle++;
                tailPtr = video;
                System.out.println("1.2.video = " + video);
            }
        } else {
            if (video > curPtr && video < tailPtr) {
                if (tailEle + 1 == tailPtr) {
                    curPtr = tailPtr;
                    tailEle++;
                    curPtr = tailPtr;
                    System.out.println("2.1.video = " + video);
                } else if (video == curPtr + 1) {
                    int count = 1;
                    for (int i = video; i <= tailPtr; i++) {
                        if (arr[i] != 1) {
                            break;
                        }
                        count++;
                    }
                    curPtr = curPtr + count;
                    curEle = curEle + count;
                    tailEle = tailEle + count;
                    System.out.println("count = " + count);
                    System.out.println("curPtr = " + curPtr);
                    System.out.println("curEle = " + curEle);
                    System.out.println("tailEle = " + tailEle);
                    System.out.println("2.2.video = " + video);
                } else {
                    tailEle++;
                    System.out.println("2.3.video = " + video);
                }
            } else if (video > tailPtr) {
                tailPtr = video;
                tailEle++;
                System.out.println("3.1.video = " + video);
            }
        }
    }

    public int longest() {
        return curPtr;
    }
}
