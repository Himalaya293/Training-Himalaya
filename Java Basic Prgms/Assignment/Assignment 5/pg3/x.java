import java.util.*;


class x{

	
public static void main(String[] args) {
		
System.out.println("Enter a string");
		
Scanner sc = new Scanner(System.in);
		
String s = sc.next();
		
char[] a = s.toCharArray();
		
Arrays.sort(a);
		
s="";
		
for (int i=0;i<a.length-1;i++) 
		
{
			
if (a[i] != a[i+1]) 
			
{
				
s= s+a[i];
			
}
		
}
		
s=s+a[a.length-1];
		
System.out.println(s);
	
}
}