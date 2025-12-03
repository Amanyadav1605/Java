class Thread_isInt extends Thread
{
public void run()
{
System.out.println("Thread is running");
int i = 0;
while(i<= 10)
{
System.out.println("i: "+i);
if(i == 5)
if(!Thread.currentThread().isInterrupted());
{
System.out.println("Status of thread: " +!Thread.currentThread().isInterrupted());
return;
}
 // i = i + 1;  //Error

}
}
public static void main (String[] args)
{
Thread_isInt th1 = new Thread_isInt();
Thread t1 = new Thread(th1);
t1.start();

}
}
