class Thread3 extends Thread
{
Boolean stop = false;
public void run()
{
System.out.println("Thread is running");
int i =0;
while(i<10)
{
System.out.println("i: "+i);
if(i == 5)
if(stop ==true)
return;
i = i+1;
}
}
public static void main (String[] args)
{
Thread3 th1 = new Thread3();
Thread t1 = new Thread(th1);
t1.start();
th1.stop = true;
}
}

