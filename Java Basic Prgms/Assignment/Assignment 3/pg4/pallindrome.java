import java.util.Scanner;


class Palindrome 
{ 
	
public boolean checkPalindrome(int n){

boolean b;
		
int rev=0; 
		
int temp=n; 
		
while(n>0)
		 
{ 
			
rev=(rev*10)+(n%10); 
			
n=n/10;
		
 }
if(rev==temp)
		 
{ 
			
b=true; 	
		
 } 

		
else b=false; 
		
return b; 
	
}   
public void nearPalindrome(int n) 
	
{ 
		
int smallpalin,bigpalin;
		
int temp=n; 
		
n=temp-1; 
		
while(!checkPalindrome(n))
	        
{ 
			
n=n-1; 
		
} 
	
smallpalin=n; 
		
n=temp+1; 
		
		
while(!checkPalindrome(n)) 
		
{ 
			
n=n+1;
		
 } 
		
		
bigpalin=n; 
		
n=temp; 

if((n-smallpalin)<(bigpalin-n)) 
			
System.out.println("Nearest Palindrome is "+smallpalin); 

		
else if((n-smallpalin)>(bigpalin-n)) 
			
System.out.println("Nearest Palindrome is "+bigpalin); 

		
else if((n-smallpalin)==(bigpalin-n)) 
			
System.out.println("Two Nearest palindrome numbers are "+smallpalin+" and "+bigpalin);
	
 } 



		
public static void main(String[] args) 
		
{ 
			
Palindrome p=new Palindrome(); 
			
			
Scanner sc=new Scanner(System.in);
			
System.out.println("Enter a number");
			
int n=sc.nextInt(); 
			
p.nearPalindrome(n); 
			 
		
}
 }
		