package assign11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class linkarraysort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
        LinkedList<Integer> ln=new LinkedList<Integer>();
		for(int i=0;i<=n;i++) {ln.add(sc.nextInt());}
		System.out.println("enter the value of k");
		int k=sc.nextInt();
        LinkedList<Integer> lk=new LinkedList<Integer>();
		for(int i=0;i<=k;i++) {lk.add(sc.nextInt());}
        
		ArrayList<Integer> l=new ArrayList<Integer>(ln);
		l.addAll(lk);
		Collections.sort(l);
		System.out.println(l);
	}

}
