public class DangerousFuncs {
    public static void main(String[] args) throws Exception {
        Thread t = new Thread(new Runnable() {
            public void run() {
                try {
                    System.out.println("I am running");
                    Thread.sleep(1000);
                    System.out.println("Stopping");
                    Thread.currentThread().stop();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();
        Thread.sleep(5000);
        t.stop();
    }
}

