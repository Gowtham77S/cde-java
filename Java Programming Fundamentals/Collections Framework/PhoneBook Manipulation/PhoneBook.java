import java.util.*;
public class PhoneBook{
    private List<Contact> phoneBook=new ArrayList<Contact>();
        public List<Contact> getPhoneBook(){
            return phoneBook;
        }
        public void setPhoneBook(List<Contact> phoneBook){
                this.phoneBook=phoneBook;            
        }
        
        public void addContact(Contact contactObj)
        {   
                phoneBook.add(contactObj);
        }
        public List<Contact> viewAllContacts()
        {
            return phoneBook;
        }
        public Contact viewContactGivenPhone(long phonenumber){   
                for(Contact cont: phoneBook){
                    if(cont.getPhoneNumber()==phonenumber){
                        return cont; 
                    }
                }
                return null;
                
                
        }
        public boolean removeContact(long phonenumber){
            Contact cn=viewContactGivenPhone(phonenumber);
            if(cn==null){
                return false;
            }
          {
              return phoneBook.remove(cn);
              
                
            }
        }
        
}