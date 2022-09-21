import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of bookings");
        int n=sc.nextInt();
        System.out.println("Enter the available tickets");
        int avtic=sc.nextInt();
        System.out.println("Enter the ticketid");
        int ticketid=sc.nextInt();
        System.out.println("Enter the price");
        int price=sc.nextInt();
        System.out.println("Enter the no of tickets");
        int nooftickets=sc.nextInt();
        Ticket tc=new Ticket();
        int ans=tc.calculateTicketCost(nooftickets);
        System.out.println("Available tickets:");
        System.out.println(tc.getAvailableTickets());
        System.out.println("Total Amount:");
        System.out.println(tc.calculateTicketCost(nooftickets));
        System.out.println("Available ticket after booking:");
        System.out.println(tc.getAvailableTickets());
        
        
        
    }
}