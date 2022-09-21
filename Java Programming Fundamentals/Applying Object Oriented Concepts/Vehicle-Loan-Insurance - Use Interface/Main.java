import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
       Vehicle v1=new Vehicle("3454","Porsch","4 wheeler",1000000);
       System.out.println(v1.issueLoan());
       System.out.println(v1.takeInsurance());
    }
}