import java.util.stream.Stream;
import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;


public class EmployeeUtility {

	public Employee[] getEmployeeDetails(String[] details) {

		//Fill your code here
		int i=0;
		int n=details.length;
		Employee eobj[]=new Employee[n];
		while(i<n){
		    String sarr[]=details[i].split(";");
		    String id=sarr[0];
		    String name=sarr[1];
		    double sal=Double.parseDouble(sarr[2]);
		    Employee eo=new Employee();
		    eo.setEmpId(id);
		    eo.setEmpName(name);
		    eo.setSalary(sal);
		    eobj[i]=eo;
		    i+=1;
		}
		return (eobj);
		}



	

	public Stream<Employee> getStreamOfEmployee(Employee[] empDetails) {

		//Fill your code here
        return (Arrays.stream(empDetails));


	}

	public String[] shortlistedEmployee(Stream<Employee> empStream,double minSalary) {

		//Fill your code here
List<String> s1=new ArrayList<>();
empStream.filter(e->e.getSalary()>=minSalary).forEach(x->{
    String res="";
    res+=x.getEmpId()+" "+x.getEmpName()+" "+x.getSalary();
    s1.add(res);
});;
String sar[]=new String[s1.size()];
int j=0;
for(String ts:s1){
    sar[j]=ts;
    j+=1;
}

Arrays.sort(sar);
return (sar);



	}

}
