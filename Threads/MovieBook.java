class BookSeat
{
int total_seat=10;
synchronized void book(int seats)
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
class MovieBook extends Thread
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
MovieBook aman=new MovieBook();
aman.seats=7;
aman.start();
MovieBook abhiroop=new MovieBook();
abhiroop.seats=5;
abhiroop.start();
}
}