import java.util.*;
import java.util.Map.Entry;

public class Main {
	
	private static Map <String,Double> employeeMap=new HashMap<>();

	public Map<String, Double> getEmployeeMap() {
		return employeeMap;
	}

	public void setEmployeeMap(Map<String, Double> employeeMap) {
		this.employeeMap = employeeMap;
	}
	
	public void addEmployeeDetails(String employeeName, double salary)
	{
		// Fill the code
		employeeMap.put(employeeName,salary);
	}
	
	
	
	public static EmployeeAudit findEmployee()
	{
	    EmployeeAudit emp=x->{
	        ArrayList<String> s=new ArrayList<>();
	        for(Entry<String, Double> entry: employeeMap.entrySet()){
	            if(entry.getValue()<=x){
	                s.add(entry.getKey());
	            }
	        }
	        return s;
	    };
	    return emp;
// 		ArrayList<String> name=null;
		// Fill the code
		
	}
	
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		while(true){
		    System.out.println("1. Add Employee details");
		    System.out.println("2. Find Employee details");
		    System.out.println("3. Exit");
		    System.out.println("Enter the choice");
		    int ch=sc.nextInt();
		    switch(ch){
		        case 1:
		            System.out.println("Enter the Employee name");
		            String name=sc.next();
		            System.out.println("Enter the Employee salary");
		            double salary=sc.nextDouble();
		            Main ob=new  Main();
		            ob.addEmployeeDetails(name,salary);
		            break;
		      case 2:System.out.println("Enter salary to be searched");
		            Double sal=sc.nextDouble();
		            EmployeeAudit emp=findEmployee();
		            ArrayList<String> s=emp.fetchEmployeeDetails(sal);
		            if(s.isEmpty()){
		                System.out.println("No Employee found");
		            }
		            else
		            {
		                System.out.println("Employee list");
		                for(int i=0;i<s.size();i++){
		                    System.out.println(s.get(i));
		                }
		            
		            }
		            break;
		      case 3:System.out.println("Let's complete the session");
		      break;
		    }
		    
		}
		// Fill the code
	}

}
