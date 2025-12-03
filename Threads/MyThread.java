public class MyThread implements Runnable
{
int a =20, b=10;
public void run()
{
addition(); // task1
subtraction(); // task2 
multiplication(); // task 3
}
void addition()
{
int sum = a+b;
System.out.println("Addition of two numbers: " +sum);
}
void subtraction()
{
int sub = a-b;
System.out.println("Subtraction of two numbers: " +sub);
}
void multiplication()
{
int multiply = a*b;
System.out.println("Multipliction of two numbers: " +multiply);
}
public static void main (String args[])
{
System.out.println(" Main thread running");
MyThread th=new MyThread();
Thread t=new Thread(th);
t.start();
}
}

