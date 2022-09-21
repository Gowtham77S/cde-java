import java.util.*;
public class Student{
    private int studentId;
    private String studentName,studentAddress,collegeName;
    
    
    public int getStudentId(){
        return this.studentId;
    }
    public void setStudentId(int studentId){
        this.studentId=studentId;
    }
    public String getStudentName(){
    return this.studentName;
    }
    public void setStudentName(String studentName){
        this.studentName=studentName;
    }
        public String getStudentAddress(){
    return this.studentAddress;
    }
    public void setStudentAddress(String studentAddress){
        this.studentAddress=studentAddress;
    }
        public String getCollegeName(){
    return this.collegeName;
    }
    public void setCollegeName(String collegeName){
        this.collegeName=collegeName;
    }
    
    public Student(int studentId,String studentName,String studentAddress){
        this.studentId=studentId;
        this.studentName=studentName;
        this.studentAddress=studentAddress;
        this.collegeName="NIT";
    }
    
    public Student(int studentId,String studentName,String studentAddress,String collegeName){
        this.studentId=studentId;
        this.studentName=studentName;
        this.studentAddress=studentAddress;
        this.collegeName=collegeName;
    }
}