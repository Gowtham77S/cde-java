import java.util.*;
public class AccountDetails{
    Scanner sc=new Scanner(System.in);
    public Account getAccountDetails(){
        Account acc=new Account();
        System.out.println("Enter account id:");
        int accountid=sc.nextInt();
        acc.setAccountId(accountid);
        System.out.println("Enter account type:");
        String accounttype=sc.next();
        acc.setAccountType(accounttype);
        System.out.println("Enter account balance:");
        int balance=sc.nextInt();
        while(balance<=0){
            System.out.println("Balance Should be positive:");
            System.out.println("Enter balance:");
            balance=sc.nextInt();
        }
        acc.setBalance(balance);
        return acc;
        
    }
    public int getWithdrawAmount(){
        System.out.println("Enter amount to be withdrawn:");
        int withdrawn=sc.nextInt();
        while(withdrawn<=0){
            System.out.println("Amount Should be positive:");
            System.out.println("Enter amount to be withdrawn:");
            withdrawn=sc.nextInt();
        }
        return withdrawn;
    }
    public static void main(String[] Args){
        AccountDetails acd=new AccountDetails();
        Account acc=new Account();
        if(acc.withdraw(acd.getWithdrawAmount())){
            System.out.println("Balance amount after withdraw:"+acc.getBalance());
        }
        else{
            System.out.println("Sorry!!! No enough balance");
        }
            
    }
}