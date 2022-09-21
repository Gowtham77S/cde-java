import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
public class UserInterface {
    	static NumberFormat fmt=NumberFormat.getCompactNumberInstance(Locale.US,NumberFormat.Style.LONG);
		static NumberFormat fmtShort=NumberFormat.getCompactNumberInstance(Locale.US,NumberFormat.Style.SHORT);
	
	public static void main(String args[]) {
	
			
		Scanner sc=new Scanner(System.in);
		
		System.out.println( "Enter the Connection ID :" );	
		int connectionId=sc.nextInt();
		System.out.println( "Enter the Connection Type :" );	
		String connectionType=sc.next();
		System.out.println( "Enter the Previous Reading :" );	
		int previousReading=sc.nextInt();
		System.out.println( "Enter the Current Reading :" );	
		int currentReading=sc.nextInt();
		int readingValue =currentReading-previousReading;
		outer:{
		String connection=checkConnectionType(connectionType);
		System.out.println(connection);
		if(connection.equals("Invalid Connection"))
		{
			break outer;
		}
		int billAmount;
		if(readingValue>0 && readingValue<=200)
		{
			billAmount= readingValue*2;
		}
		else
		{
			billAmount = readingValue*5;
		}
		System.out.println("Bill Amount (LongNumberFormat) : "+longNumberFormat(billAmount));
		System.out.println("Bill Amount (ShortNumberFormat) : "+shortNumberFormat(billAmount));

		}	 	  	  		      	 	  	        	 	

}
	// Use Enhanced switch statement to check the connection type
	public static String checkConnectionType(String connectionType) {

		//Fill the Code
        
        String connection = switch(connectionType) {
             case "SinglePhase", "ThreePhase", "SINGLEPHASE", "THREEPHASE" -> "Valid Connection";
             default -> "Invalid Connection";
               
        };
           return connection;
   		
  	}

	    	
	
	

    // Use Compact Number Formatting to convert the number into Long Number Format
	public static String longNumberFormat(int number) {
		
		//Fill the Code
NumberFormat formatter = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);
    
       return formatter.format(number);

 	    
	
	}
	
	// Use Compact Number Formatting to convert the number into Short Number Format
	public static String shortNumberFormat(int number) {
		
        NumberFormat formatter = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
   
       return formatter.format(number);
	}
	
}
