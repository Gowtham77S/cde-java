import java.util.*;
public class Main{
    public static Candidate getCandidateDetails()throws InvalidSalaryException{
    Scanner sc=new Scanner(System.in);
        Candidate cd=new Candidate();
        System.out.println("Enter the candidate Details");
        System.out.println("Name");
        String name=sc.next();
        System.out.println("Enter Gender");
        String Gender=sc.next();
        System.out.println("Expected Salary");
        double salary=sc.nextDouble();
        
            if(salary<10000){
                throw new InvalidSalaryException("Registration Failed.Salary cannot be less than 10000");
            }
            else{
                cd.setName(name);
                cd.setGender(Gender);
                cd.setExpectedSalary(salary);
                return cd;
            }
        
    }
    
    public static void main(String[] args){
        try{
            Candidate cd=getCandidateDetails();
            System.out.println("Registration Successgull");
        }
        catch(InvalidSalaryException e){
            System.out.println(e.getMessage());
        }
    }
}