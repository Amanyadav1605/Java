public class R implements Runnable
{
public void run()
{
for( int i =1; i<=3; i++)
{
try
{
Thread.sleep(500);
}
catch(InterruptedException ie)
{
ie.printStackTrace();
}
 System.out.println(Thread.currentThread()+ " I " +i);
}
}
public static void main(String[] args)
{
R r1 =new R();
Thread t1 = new Thread(r1, "First Child Thread");
R r2 =new R();
Thread t2 = new Thread(r2, "Second Child Thread");
t1.start();
t2.start();
}
}

