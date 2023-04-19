public class TestThreadStop extends Thread
{
    public void run()
    {
        for(int i=1; i<5; i++)
        {
            try
            {
                // thread to sleep for 500 milliseconds
                sleep(500);
                System.out.println(Thread.currentThread().getName());
            }catch(InterruptedException e){System.out.println(e);}
            System.out.println(i);
        }
    }
    public static void main(String args[])
    {
        // creating three threads
        var t1 = new TestThreadStop();
        var t2 = new TestThreadStop();
        var t3 = new TestThreadStop();
        // call run() method
        t1.start();
        t2.start();
        // stop t3 thread
        t3.stop();
        System.out.println("Thread t3 is stopped");
    }
}
