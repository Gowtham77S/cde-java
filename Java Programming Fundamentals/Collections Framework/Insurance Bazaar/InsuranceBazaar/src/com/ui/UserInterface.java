package com.ui;
import com.utility.*;
import java.util.*;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		//Fill the UI code
		System.out.println("Enter the no of Policy names you want to store");
		int n=Integer.parseInt(sc.nextLine());
// 		Integer.parseInt(sc.nextLine);
        Bazaar bc=new Bazaar();
        bc.setPolicyMap(new TreeMap<>());
        for(int i=0;i<n;i++){
            System.out.println("Enter the Policy ID");
            int pid=Integer.parseInt(sc.nextLine());
            System.out.println("Enter the Policy Name");
            String name=sc.nextLine();
            bc.addPolicyDetails(pid,name);
        }
        
        Map<Integer,String> map=new HashMap<Integer,String>();
        map=bc.getPolicyMap();
        for(Map.Entry<Integer,String> pp:map.entrySet()){
            System.out.println(pp.getKey()+" "+pp.getValue());
        }
		System.out.println("Enter the policy type to be searched");
		String search=sc.nextLine();
		 List<Integer> l1=new ArrayList<Integer>();
		l1=bc.searchBasedOnPolicyType(search);
		for(int i:l1)
		System.out.println(i);

	}

}
