import java.util.*;
public class Authority{
    public static void main(String[] args){
        boolean n=false;
        boolean f=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("Inmate's name:");
        String name=sc.nextLine();
        System.out.println("Inmate's father's name:");
        String father=sc.nextLine();
        if(isok(name) && isok(father)){
            System.out.println(name.concat(" "+father));
        }
        else System.out.println("Invalid name");
    }
    public static boolean isok(String s){
        for(char c:s.toCharArray()){
            if(!Character.isSpaceChar(c) && !Character.isLetter(c)){
                return false;
            }
        }
        return true;
    }
}