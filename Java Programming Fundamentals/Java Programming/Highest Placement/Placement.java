import java.util.*;
public class Placement
{
    public static void main (String[] args)
    {   
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of students placed in CSE:");
        int cse=sc.nextInt();
        System.out.print("Enter the no of students placed in ECE:");
        int ese=sc.nextInt();
        System.out.print("Enter the no of students placed in MECH:");
        int mech=sc.nextInt();
        if(cse<0 || ese<0 || mech<0){
            System.out.print("Input is Invalid");
        }
        else{
             int highest=0;
             if(highest<cse)
             highest=cse;
             if(highest<ese)
             highest=ese;
             if(highest<mech)
             highest=mech;
             
             if(highest==0 || (highest==cse && highest==ese && highest==mech)){
              System.out.print("None of the department has got the highest placement");
             }
              else{
                  System.out.println("Highest placement");
                  if(highest==cse){
                      System.out.println("CSE");
                  }
                  if(highest==mech){
                      System.out.println("MECH");
                  }
                  if(highest==ese){
                      System.out.println("ECE");
                  }
              }
              
        }
    
    } 
}