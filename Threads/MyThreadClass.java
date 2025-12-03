class Thread1 implements Runnable
{
public void run()
{
System.out.println("First child thread");
}
}
class Thread2 implements Runnable
{
static Thread t2;
public void run()
{
for(int i=0 ; i < 10; i++)
{
System.out.println("Second child thread" +i);
if(i==5)
{
t2.stop(); //Calling stop() Method to kill
// running thread.
}
}
}
}
public class  MyThreadClass
{
public static void main(String args[])
{
Thread1 th1 = new Thread1();
Thread2 th2 = new Thread2();
Thread t1 = new Thread(th1);
Thread t2 = new Thread(th2);
t1.start();
t1.stop(); // Calling stop() method to kill runnable thread
t2.start();
}
}

