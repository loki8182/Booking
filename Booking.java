import java.util.Scanner;

public class Booking {
    int Seats;
    int availablseats=10;
    int amount;
    void booking() {
    	Scanner se=new Scanner(System.in);
    	System.out.println("WELCOME");
    	System.out.println("Enter the seat no you want:");
    	Seats=se.nextInt();
    	if(Seats<=availablseats) {
    		System.out.println("seat has been booked sucessfully and your seat no:"+Seats);
    		
    	}else {
    		System.out.println("Seat was full");
    	}
    }
    void payement() {
    	   Scanner sd=new Scanner(System.in);
    	   System.out.println("enter the amount to be paid:");
    	   amount=sd.nextInt();
    	   System.out.println("The amount you paid:"+amount);
       }
    public static void main(String args[]) {
    	Booking bus=new Booking();
    	bus.booking();
    	bus.payement();
    }
}
