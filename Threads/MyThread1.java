public class MyThread1 extends Thread
{
String task;
MyThread1(String task )
{
this.task = task;
}
public void run()
{
for( int i=1;i<=5;i++)
{
System.out.println(task+ " : " +i);
try
{
Thread.sleep(5000);
}
catch(InterruptedException ie)
{
System.out.println(ie.getMessage());
}
}
}
public static void main(String[] args)
{
MyThread1 th1=new MyThread1("Cut the ticket: ");
MyThread1 th2=new MyThread1("Show your seat number:");
Thread t1=new Thread(th1);
Thread t2=new Thread(th2);
t1.start();
t2.start();
}
}

