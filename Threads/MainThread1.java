//Creating a Thread by using Thread class.
class ThreadA implements Runnable
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
class ThreadB implements Runnable
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
class MainThread1
{
public static void main(String args[])
{
ThreadA obja=new ThreadA();
ThreadB objb=new ThreadB();
Thread obj1=new Thread(obja);
Thread obj2=new Thread(objb);
obj1.start();
obj2.start();

}
}


