package test1;

public class CpuHighTest {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(() -> {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(30 * 60 * 1000);
                }catch (Exception e){
                    e.printStackTrace();
                }
            });
            thread.setName("thread42-" + i);
            thread.start();
        }

        Thread highCpuThread = new Thread(() -> {
            int i = 0;
            while (true) {
                System.out.println("i = " + i);
                i++;
            }
        });
        highCpuThread.setName("HighCpu42");
        highCpuThread.start();
    }

}
