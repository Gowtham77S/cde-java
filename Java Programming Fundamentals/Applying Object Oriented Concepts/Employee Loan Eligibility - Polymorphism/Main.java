import java.util.Scanner;
public class Main{
   
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       Employee em1=new PermanentEmployee(121,"Gowtham",12000);
       Loan ln=new Loan();
       System.out.println(ln.calculateLoanAmount(em1));
    }
    
}