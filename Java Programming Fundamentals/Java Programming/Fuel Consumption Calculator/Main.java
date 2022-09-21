import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of liters to fill the tank");
        int liters=sc.nextInt();
        double littttt;
        if(liters>0){
            System.out.println("Enter the distance covered");
               int distance=sc.nextInt();
               if(distance>0)
               {
                   littttt=(float)liters/distance;
                   System.out.printf("Liters/100KM\n%.2f",littttt*100);
                   
                  System.out.println("\nMiles/gallons");
                  double a1=((distance*0.6214)/(liters*0.2642));
                  System.out.printf("%.2f",a1);
               }
               else System.out.println(distance+" is an Invalid Input");
               
        }
        else System.out.println(liters+" is an Invalid Input");
        
    }
}