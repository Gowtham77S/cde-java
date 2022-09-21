import java.util.*;
public class StudentMain{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student's Id:");
        int id=sc.nextInt();
        System.out.println("Enter Student's Name:");
        String Name=sc.nextLine();
        System.out.println("Enter Student's address:");
        String Address=sc.nextLine();
        System.out.println("Whether the student is from NIT(Yes/No):");
        String ans=sc.nextLine();
        while(ans.toLowerCase()!="yes" || ans.toLowerCase()!="no"){
            System.out.println("Wrong Input");
            System.out.println("Whether the student is from NIT(Yes/No):");
            ans=sc.nextLine();
        }
        if(ans.toLowerCase()=="no"){
            System.out.println("Enter the college name");
            String collegename=sc.nextLine();
            Student st=new Student(id,Name,Address,collegename);
            System.out.println("Studnent id:"+st.getStudentId());
            System.out.println("Studnent name:"+st.getStudentName());
            System.out.println("Studnent Address:"+st.getStudentAddress());
            System.out.println("Studnent College name:"+st.getCollegeName());
        }
        else{
            Student st=new Student(id,Name,Address);
            System.out.println("Studnent id:"+st.getStudentId());
            System.out.println("Studnent name:"+st.getStudentName());
            System.out.println("Studnent Address:"+st.getStudentAddress());
            System.out.println("Studnent College name:"+st.getCollegeName());
        }
    }
}