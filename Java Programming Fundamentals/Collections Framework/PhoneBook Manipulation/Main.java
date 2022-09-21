import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        PhoneBook pb=new PhoneBook();
 
        while(true){
            System.out.println("Menu");
            System.out.println("1.Add Contact\n2.Display all contacts\n3.Search contactby phone\n4.Remove conatact\n5.Exit");
            System.out.println("Enter your choice");
            int n=sc.nextInt();
            switch(n){
                case 1:System.out.println("Add a Contact:");
                       System.out.print("Enter the First Name:");
                       String fname=sc.next();
                       System.out.println("Enter the Last Name:");
                       String lname=sc.next();
                       System.out.println("Enter the Phone No:");
                       Long phno=Long.parseLong(sc.nextLine());
                       System.out.println("Enter the Email:");
                       String email=sc.next();
                       Contact cn=new Contact(fname,lname,phno,email);
                       pb.addContact(cn);
                    //   cn.setFirstName(fname);
                    //   cn.setLastName(lname);
                    //   cn.setPhoneNumber(phno);
                    //   cn.setEmailId(email);
                    break;
                case 2:System.out.println("The contacts in the List are:");
                for(Contact cnw:pb.viewAllContacts()){
                       System.out.println("First Name:"+cnw.getFirstName());
                        System.out.println("Last Name:"+cnw.getLastName());
                        System.out.println("Phone No:"+cnw.getPhoneNumber());
                        System.out.println("Email:"+cnw.getEmailId());
                }
                break;
                case 3:System.out.println("Enter the Phone number to Search contact:");
                        Long phnosearch=Long.parseLong(sc.nextLine());
                        Contact cn1=pb.viewContactGivenPhone(phnosearch);
                        System.out.println("The contact is:");
                        System.out.println("First Name:"+cn1.getFirstName());
                        System.out.println("Last Name:"+cn1.getLastName());
                        System.out.println("Phone No:"+cn1.getPhoneNumber());
                        System.out.println("Email:"+cn1.getEmailId());
                        break;
                case 4:System.out.print("Enter the Phone number to remove:");
                        Long phnoremove=Long.parseLong(sc.nextLine());
                            System.out.print("Do you want to remove the contact(Y/N):");
                            String ans=sc.next();
                            if(ans.equals("Y")){
                                if(pb.removeContact(phnoremove)){
                                    System.out.print("The contact is successfully deleted ");
                                }
                            }
                case 5:System.exit(0);
                        
                        
            }
        }
    }
}