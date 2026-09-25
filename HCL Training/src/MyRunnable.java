public class MyRunnable{
    public static void main(String[] args) {
        MyRun r=new MyRun();
        Thread t1=new Thread(r);
        t1.start();
        Thread t2=new Thread(r);
        t2.start();
    }
}
class MyRun  implements Runnable{
    @Override
    public void run(){
        System.out.println("Thread is running: "+Thread.currentThread().getName());
    }
}