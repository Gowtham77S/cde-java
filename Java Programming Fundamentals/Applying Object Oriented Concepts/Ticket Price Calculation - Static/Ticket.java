import java.util.*;
public class Ticket{
    private int ticketid;
    private int price;
    private static int availableTickets;
    
    
    // public Ticket(int ticketid,int price,int availableTickets){
    //     this.ticketid=ticketid;
    //     this.price=price;
    //     this.availableTickets=availableTickets;
    // }
    public int getTicketid(){
        return this.ticketid;
    }
    public void setTicketid(int ticketid){
        this.ticketid=ticketid;
    }
        public int getPrice(){
        return this.price;
    }
    public void setPrice(int price){
        this.price=price;
    }
        public static int getAvailableTickets(){
        return availableTickets;
    }
    public static void setAvailableTickets(int availableTickets){
        if(availableTickets>0){
            Ticket.availableTickets=availableTickets;
        }
        
    }
    public int calculateTicketCost(int nooftickets){
        if(availableTickets>=nooftickets){
            availableTickets-=nooftickets;
            // nooftickets*price;
            return nooftickets*price;
        }
        else return -1;
    }
}