import java.util.*;
public class Main{
    public static Hosteller getHostellerDetails(){
        Hosteller hl=new Hosteller();
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Details:");
        
        System.out.println("Student Id");
        int studentId=sc.nextInt();
        hl.setStudentId(studentId);
        
        System.out.println("Student Name");
        String studentName=sc.next();
        hl.setName(studentName);
        
        System.out.println("Department Id");
        int departmentId=sc.nextInt();
        hl.setDepartmentId(departmentId);
        
        System.out.println("Gender");
        String gender=sc.next();
        hl.setGender(gender);
        
        System.out.println("Phone Number");
        String phone=sc.next();
        hl.setPhone(phone);
        
        System.out.println("Hostel Name");
        String hostelName=sc.next();
        hl.setHostelName(hostelName);
        
        System.out.println("Room Number");
        int roomNumber=sc.nextInt();
        hl.setRoomNumber(roomNumber);
        return hl;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Hosteller hl=getHostellerDetails();
        

        System.out.println("The Student Details");
        System.out.println(hl.getStudentId()+" "+hl.getName()+" "+hl.getDepartmentId()+" "+hl.getGender()+" "+hl.getPhone()+" "+hl.getHostelName()+" "+hl.getRoomNumber());
        
    }
}





