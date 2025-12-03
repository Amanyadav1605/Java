public class Kill extends Thread
{
static Thread t;
public void run()
{
System.out.println("Thread is running");
t.stop(); // Calling stop() method on kill Thread
System.out.println("Hi I am Alive");
}
public static void main(String[] args)
{
Kill k =new Kill();
t =new Thread(k);
t.start(); //Calling start() method.
}
}