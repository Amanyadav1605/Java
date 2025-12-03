class L implements Runnable
{
public void run()
{
try
{
Thread.sleep(2000); // Pausing running thred for 2 sec.
}
catch(InterruptedException ie)
{
ie.printStackTrace();
}
System.out.println(" Hello Java");
System.out.println(Thread.currentThread());
}
public static void main(String[] args)
{
L a =new L();
Thread t =new Thread(a , "Child Thread");
t.start();
t.interrupt();
}
}
