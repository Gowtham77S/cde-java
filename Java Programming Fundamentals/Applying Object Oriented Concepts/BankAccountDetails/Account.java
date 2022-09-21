import java.util.*;
public class Account{
    private int accountId;
    private String accountType;
    private int balance;
    
    public int getAccountId(){
        return this.accountId;
    }
    public void setAccountId(int accountId){
        this.accountId=accountId;
    }
    public int getBalance(){
        return this.balance;
    }
    public void setBalance(int balance){
        this.balance=balance;
    }
    public String getAccountType(){
        return this.accountType;
    }
    public void setAccountType(String accountType){
        this.accountType=accountType;
    }
    
    
    public boolean withdraw(int withdraw){
        if(this.balance<withdraw){
        return false;
        }
            this.balance-=withdraw;
            return true;
        
    }
}