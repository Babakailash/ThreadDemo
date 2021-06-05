public class Alpha extends Thread {

    public void run() {
        for (char i = 'a'; i <= 'z'; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.print(i + ",");
        }
    }
}



