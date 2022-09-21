import java.util.stream.Collectors;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Optional;
import java.util.Comparator;
import java.util.*;

public class UserInterface {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the student details");
		String markDetails[] = new String[num];
		for (int i = 0; i < num; i++) {
			markDetails[i] = sc.nextLine();
		}

		Map<String, Double> studMap = retrieveMinAndMaxMarksDetails(getStudentList(markDetails));

		for (Map.Entry entry : studMap.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

	}

	// Create Student objects, set the values and return the List<Student>
	
	public static List<Student> getStudentList(String[] studArray) {
        List<Student> sList=new ArrayList<Student>();
		// Fill the code here
// 		Student s= new Student();
		for(String ab:studArray){
		   String st[]=ab.split(":");
		   sList.add(new Student(st[0],st[1],Double.parseDouble(st[2])));
		}
            
		return sList;
	}

	// Make use of Collectors.teeing method to find the maximum and minimum marks of students and return the map(student name as key and minimum or maximum marks as value)
	// Also use local variable syntax for lambda parameters
	
	public static Map<String, Double> retrieveMinAndMaxMarksDetails(List<Student> studentList) {
        Map<String,Double> map=new HashMap();
        Map<String,Double>result=studentList.stream().collect(
            Collectors.teeing(
                Collectors.maxBy(Comparator.comparing(Student::getMarks)),
                Collectors.minBy(Comparator.comparing(Student::getMarks)),
                (var s1,var s2)->{
                    map.put(s1.get().getName(),s1.get().getMarks());
                    map.put(s2.get().getName(),s2.get().getMarks());
                    return map;
                }));
		// Fill the code here

		return result;
	}
}
