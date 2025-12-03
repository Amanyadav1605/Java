class MyThread1 implements Runnable
{
public void run() // Entry point of Thread1
{
for(int i=0; i<5; i++)
{
System.out.println("First child Thread: " +i);
}
System.out.println(" \t First child existed");
}
}
class MyThread2 implements Runnable
{
public void run() // Entry point of Thread2
{
for(int i=0; i<5; i++)
{
System.out.println("Second child Thread: " +i);
}
System.out.println(" \t Second child existed");
}
}
public class MyClass
{
public static void main(String[] args)
{
MyThread1 th1 = new MyThread1();
Thread t1= new Thread(th1);
t1.start();
MyThread2 th2 = new MyThread2();
Thread t2= new Thread(th2);
t2.start(); int j=0;
while(j<4)
{
System.out.println("Main Thread: " +j);
j = j+1;
}
System.out.println(" \t Main Thread existing");
}
}