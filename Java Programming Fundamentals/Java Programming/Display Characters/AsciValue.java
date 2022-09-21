import java.util.*;
public class AsciValue{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[]arr=new int[4];
        char[] c=new char[4];
        System.out.println("Enter the digits:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            c[i]=(char)arr[i];
        }
        for(int i=0;i<4;i++){
            System.out.println(arr[i]+"-"+c[i]);
        }
        
    }
}