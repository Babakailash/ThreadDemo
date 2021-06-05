public class Main  {
    public static void main(String[] args) {

        Runnable runnable = new Count();
        Thread count = new Thread(runnable);

        Thread alpha = new Alpha();
        alpha.start();
        count.start();
        // count.setDaemon(true);


    }
}

