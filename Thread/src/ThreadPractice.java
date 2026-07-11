public class ThreadPractice {
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        t1.start();
        Thread2 t2=new Thread2();
        t2.run();
        Thread t=new Thread(t2);
        t.start();
        System.out.println(Thread.currentThread().getName());
    }
}
class Thread1 extends Thread{
    public void run(){
        System.out.println("This is Thread from extends");
        for (int i = 0; i <= 5; i++) {
            try {
                sleep(2000);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println("Thread 1 is running: "+ i);
        }
    }
}
class Thread2 implements Runnable {
    public void run(){
        System.out.println("This is Thread from Runnable");
    }
}
