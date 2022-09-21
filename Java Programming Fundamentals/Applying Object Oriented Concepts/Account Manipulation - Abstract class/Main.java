public class Main{
    
    public static void main(String args[]){
        Customer c1=new Customer(111,"Gowtham","gowtham.soft46@gmail.com");
        SavingsAccount sacc=new SavingsAccount(1212121,c1,500,200);
        
        if(sacc.withdraw(100)){
            System.out.println(sacc.getBalance());
        }
    }
}