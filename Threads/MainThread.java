//Creating a Thread by using Thread class.
class ThreadA extends Thread
{
public void run()
{
for( int i=1;i<=5;i++)
{
System.out.println("Thread of ThreadA class" +i);
}
System.out.println("Normal flow of ThreadA class");
}
}
class ThreadB extends Thread
{
public void run()
{
for( int i=1;i<=5;i++)
{
System.out.println("Thread of ThreadB class" +i);
}
System.out.println("Normal flow of ThreadB class");
}
}
class MainThread
{
public static void main(String args[])
{
ThreadA obja=new ThreadA();
ThreadB objb=new ThreadB();
obja.start();
objb.start();
}
}


