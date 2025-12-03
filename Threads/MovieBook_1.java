class BookSeat
{
  int total_seat = 10;
// Synchronized method to prevent race condition
void book(int seats)
{
System.out.println("normal flow " +Thread.currentThread().getName());
System.out.println("normal flow " +Thread.currentThread().getName());
System.out.println("normal flow " +Thread.currentThread().getName());
System.out.println("normal flow " +Thread.currentThread().getName());
System.out.println("normal flow " +Thread.currentThread().getName());
synchronized(this)
{
if (total_seat >= seats)
{
System.out.println("Seat Booked Successfully by " + Thread.currentThread().getName());
total_seat=total_seat-seats;
System.out.println("Seat Left "+total_seat);
}
else
{
System.out.println("Seat cannot Booked " + Thread.currentThread().getName());
System.out.println("Seat Left "+total_seat);
}
}
System.out.println("normal flow " +Thread.currentThread().getName());
System.out.println("normal flow " +Thread.currentThread().getName());
System.out.println("normal flow " +Thread.currentThread().getName());
System.out.println("normal flow " +Thread.currentThread().getName());
System.out.println("normal flow " +Thread.currentThread().getName());
}
}
class MovieBook_1 extends Thread
{
static BookSeat b;
int seats;
public void run()
{
b.book(seats);
}
public static void main(String[] args)
{
b=new BookSeat();
MovieBook_1 aman=new MovieBook_1();
aman.seats=7;
aman.start();
MovieBook_1 abhiroop=new MovieBook_1();
abhiroop.seats=5;
abhiroop.start();
}
}