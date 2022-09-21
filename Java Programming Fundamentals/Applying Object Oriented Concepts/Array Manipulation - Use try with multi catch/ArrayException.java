import java.util.*;
public class ArrayException{
    Scanner sc=new Scanner(System.in);
    public String getPriceDetails(){
    System.out.println("Enter the number of elements in the array");
    int n=sc.nextInt();
    System.out.print("Enter the price details");
    int[] arr=new int[n];
    try{
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
    }
    catch(InputMismatchException e){
        return "Input was not in the correct format";
    }
    System.out.println("Enter the index of the array you want to access");
    
    try{
        int index=sc.nextInt();
        return "The array element is "+arr[index];
    }
    catch(ArrayIndexOutOfBoundsException e){
        return"Array index is out of range";
    }
    catch(InputMismatchException e){
        return "Input was not in the correct format";
    }
    
    
        
    }
    public static void main(String[] args){
        System.out.println(new ArrayException().getPriceDetails());
    }
}