class BookSeat
{
 static int total_seat=30;
 static synchronized void book(int seats)
{
if(total_seat>=seats)
{
System.out.println(seats+" Seat Booked Successfully");
total_seat=total_seat-seats;
System.out.println("Seat Left "+total_seat);
}
else
{
System.out.println("Seat cannot Booked ");
System.out.println("Seat Left "+total_seat);
}
}
}
class MyThread1 extends Thread
{
BookSeat b;
int seats;
MyThread1(BookSeat b, int seats)
{
this.b=b;
this.seats=seats;
}
public void run()
{
b.book(seats);
}
}
class MyThread2 extends Thread
{
BookSeat b;
int seats;
MyThread2(BookSeat b, int seats)
{
this.b=b;
this.seats=seats;
}
public void run()
{
b.book(seats);
}
}

class MovieBook_2 
{
public static void main(String[] args)
{
BookSeat b1=new BookSeat();
MyThread1 t1=new MyThread1(b1,7);
t1.start();
MyThread2 t2=new MyThread2(b1,6);
t2.start();
BookSeat b2=new BookSeat();
MyThread1 t3=new MyThread1(b2,8);
t3.start();
MyThread2 t4=new MyThread2(b2,9);
t4.start();
}
}