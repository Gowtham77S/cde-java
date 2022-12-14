import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ValidateUtility
{
    // public static void main(String args[])
    // {
    //     //fill code here
    // }
    
    public static Validate validateEmployeeName() 
    {
        //fill code here
        return name->{
         Pattern  pattern =Pattern.compile("^[a-zA-Z\\s]{5,20}$");
         Matcher matcher =pattern.matcher(name);
         return  matcher.matches();
        };
    }
    
    public static Validate validateProductName() 
    {
        //fill code here
        return name->{
            Pattern pattern=Pattern.compile("^[a-zA-Z]\\d{5}$");
            Matcher matcher =pattern.matcher(name);
         return  matcher.matches();
        };
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String employee=sc.nextLine();
        String product=sc.nextLine();
        
        Validate employeeValidation=validateEmployeeName();
        boolean validateEmployee=employeeValidation.validateName(employee);
        if(validateEmployee){
            System.out.println("Employee name is valid");
        }else{
             System.out.println("Employee name is invalid");
        }
        
        
        Validate productValidation=validateProductName();
        boolean validateProduct=productValidation.validateName(product);
        if(validateProduct){
            System.out.println("Product name is valid");
        }else{
             System.out.println("Product name is invalid");
        }
    }
}