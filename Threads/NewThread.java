//Check when a new thread create on the basis of the active number of threads.
public class NewThread extends Thread
{
public void run()
{
Thread th1= Thread.currentThread();
System.out.println(th1);
System.out.println("New thread starts running");
System.out.println(" I am in run() method");
}
public static void main(String args[])
{
System.out.println("Main thread starts running");
Thread ct1 = Thread.currentThread();
System.out.println(ct1);
int ac1 = Thread.activeCount();
System.out.println(ac1);
//Create an object of NewThread class.
NewThread nt =new NewThread();
int ac2 = Thread.activeCount();
System.out.println(ac2);
Thread t =new Thread(nt);
int ac3 = Thread.activeCount();
System.out.println(ac3);
t.start();
int ac4 = Thread.activeCount();
System.out.println(ac4);
t.setName("New Thread");
}
}
