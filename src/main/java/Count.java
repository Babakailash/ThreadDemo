public class Count implements Runnable {


    public void run() {
        for (int i = 1; i <= 100; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.print(i + ",");
        }
    }
}
