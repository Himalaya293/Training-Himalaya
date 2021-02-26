package assign11;

import java.util.*;
import java.util.HashMap;
import java.util.Scanner;

public class Aoccur {

	public static void main(String[] args) {

		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the value of n and array");
		 int n=sc.nextInt();
		 int a[]=new int[n];
		 boolean status=false;
		 for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		     }
		 HashMap<Integer,Integer> hm = new HashMap<>();
		 for(int i = 0;i<a.length;i++) {
			 if(hm.containsKey(a[i])) {
				 hm.put(a[i],hm.get(a[i])+1); 
			 }else {hm.put(a[i],1);}
		 }
	for(int i = 0;i<a.length-1;i++){
		for(int j = i+1;j<a.length;j++){
			 if(a[i]!=a[j] && hm.get(a[i])==hm.get(a[j])){
				 System.out.println(status);
				 break;}
                 }}
	if(status!=true) {
		status=true;
	 System.out.println(status);}
	}
}
