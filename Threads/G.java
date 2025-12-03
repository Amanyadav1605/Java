class G implements Runnable
{
public void run()
{
System.out.println("Hello");
try
{
Thread.sleep(2000); // Pausing running thred for 2 sec.
}
catch(InterruptedException ie)
{
System.out.println(ie.getMessage());
}
System.out.println("Java");
System.out.println(Thread.currentThread());
}
void m1()
{
System.out.println("m1 method");
}
public static void main(String[] args)
{
G a =new G();
Thread t =new Thread(a , "Child Thread");
t.start();
System.out.println("Number of active threads: " +Thread.activeCount());
a.m1();
}
}
