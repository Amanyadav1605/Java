class A_yeild implements Runnable
{
public void run()
{
System.out.println(Thread.currentThread());
Thread.yield();
System.out.println(Thread.currentThread());
}
public static void main(String[] args)
{
A_yeild a1 = new A_yeild();
Thread t1 = new Thread(a1, "First Child Thread");
A_yeild a2 = new A_yeild();
Thread t2 = new Thread(a2, "Second Child Thread");
t1.start();
t2.start();
}
}