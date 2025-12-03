class A1 implements Runnable
{
public void run()
{
System.out.println(Thread.currentThread()); // This method is static.
}
public static void main(String args[])
{
A1 a=new A1();
Thread t = new Thread(a, "NewThread");
t.setPriority(2); // setting the priority of thread.
System.out.println("Priority of Thread: " +t.getPriority());
System.out.println("Name of Thread: " +t.getName());
Thread t1 = new Thread(a, "First Thread");
Thread t2 = new Thread(a, "Second Thread");
Thread t3 = new Thread(a, "Third Thread");
t1.setPriority(4); //Setting the priority of first thread.
t2.setPriority(3); //Setting the priority of second thread.
t3.setPriority(8); //Setting the priority of third thread.
t.start();
t1.start();
t2.start();
t3.start();

}
}