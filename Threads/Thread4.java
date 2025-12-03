public class Thread4 implements Runnable
{
static Thread t1;
public void run()
{
System.out.println("Thread is running");
int i =0 ;
while(i<10)
{
System.out.println("i: " +i);
if( i ==5)
t1.stop();
i = i+1;
}
}
public static void main(String[] args)
{
Thread4 th1 = new Thread4();
Thread th2 = new Thread(th1);
t1.start();
t1.start(); //Calling the start() method again to alive a dead thread.
}
}

