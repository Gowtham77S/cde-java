import java.util.*;
import java.lang.invoke.MethodHandles;
public class UserInterface {

	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
        String fname,lname,fname1,lname1;
        System.out.println("Enter the first name of resident1");
        fname=sc.next();
        System.out.println("Enter the last name of resident1");
        lname=sc.next();
        Optional res1=concatNames(fname,lname);
        String n1=res1.get().toString();
        System.out.println("Enter the first name of resident2");
        fname1=sc.next();
        System.out.println("Enter the last name of resident2");
        lname1=sc.next();
        Optional res2=concatNames(fname1,lname1);
        String n2=res2.get().toString();
        int res3=calculateLength(n1,n2);
        String res4=stringIndentation(n1, 5);
        String res5=stringIndentation(n2, 5);
        System.out.println("Enter the search character");
        char ch=sc.next().charAt(0);
        String res6=displayName(n1,ch);
        System.out.println("The fullname of resident1 is");
        System.out.println(res1.get());
        System.out.println("The fullname of resident2 is");
        System.out.println(res2.get());
        System.out.println("The length of the bigger name is");
        System.out.println(res3);
        System.out.println("Names after indentation");
        System.out.print(res4);
        System.out.print(res5);
        System.out.println("The number of times the search character occurs in resident1's fullname is");
        System.out.println(res6);
	}
	
	// Use describeConstable method
	public static Optional concatNames(String fname, String lname)
	{
		// Fill the code
		String Fname=fname.toUpperCase();
		String Lname=lname.toUpperCase();
        String res=Fname.concat(" "+Lname);
        Optional optional=res.describeConstable();
        return optional;


	}
	
	// Use transform method
	public static int calculateLength(String name1,String name2)
	{
		// Fill the code
        int result1=name1.transform(value -> new StringBuilder(value).length());
        int result2=name2.transform(value -> new StringBuilder(value).length());
        if(result1>result2){
            return result1;
        }
        else{
            return result2;
        }

	}
	
	// Use indent method
	public static String stringIndentation(String data,int val)
	{
		// Fill the code
		
		String ans=data.indent(val);
		return ans;

	}
	
	
	// Use resolveConstantDesc method
	public static String displayName(String msg, char ch)
	{
		// Fill the code
		int count=0;
		char chh=Character.toUpperCase(ch);
		for(int i=0;i<msg.length();i++){
		    if(msg.charAt(i)==chh)
		    count++;
		}
		
		String chv2=String.valueOf(ch);
		String countv2=String.valueOf(count);
		String annn=chv2+" "+"appears"+" "+countv2+" "+"times";
        String cdes=annn.resolveConstantDesc(MethodHandles.lookup());
		return cdes;

	}
}
