import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.Scanner;
import java.io.IOException;
import java.nio.charset.Charset;
import java.lang.*;

import java.nio.file.StandardOpenOption;


public class UserInterface {

	public static void main(String[] args) throws IOException {

		Path path1 = Paths.get("SchoolBusAllocation/studentDetails.txt");
		Path path2 = Paths.get("SchoolBusAllocation/studentDetailsWithBusNo.txt");
        String studDetails=readFile(path1);
        System.out.println("The details of the students read from studentDetails.txt file:\n"+studDetails);
	    writeFile(studDetails,path2);
	    long mismatchPos=checkMismatch(path1,path2);
	    System.out.println("The mismatched position is "+mismatchPos);
        
	}

    // Use Files.readString() to read the contents from studentDetails.txt file
	public static String readFile(Path path1) {

	try {
    		  
    		    String str = Files.readString(path1);
    		    return str;
    		} catch(IOException e) {
    		    e.printStackTrace();
    		}
        	
            return null;
	}

    // Use Files.writetring() to write the contents to studentDetailsWithBusNo.txt file
	public static void writeFile(String studentDetails, Path path2) throws IOException  {
	   
	   
// 	   	String content1=",BusNo-3\n";
// 		String content2=",BusNo-4\n";
// 		String content3=",BusNo-5\n";
		String[] buses=studentDetails.split("[\n ]");
		for(String bus:buses) {
			if(bus.contains("Washington")) {
				String content4=bus+",BusNo-3\n";
				 Files.writeString(path2,content4,StandardOpenOption.APPEND);
			}
			if(bus.contains("Chicago")) {
				String content4=bus+",BusNo-4\n";
				 Files.writeString(path2,content4,StandardOpenOption.APPEND);
			}
			if(bus.contains("Boston")) {	
				String content4=bus+",BusNo-5\n";
				 Files.writeString(path2,content4,StandardOpenOption.APPEND);

			}
		}
	    }
    	
    
        // Use Files.mismatch() to compare two files file
    	public static long checkMismatch(Path path1, Path path2) {
    
    		// Fill the code here
    		
    		try {
    		    
    		   	long pos = Files.mismatch(path1,path2);
                return pos;
    		}
    		catch(IOException e) {
    		    e.printStackTrace();
    		}
    		
    	    return 0;
    
    	}

	}

  



