import java.util.*;
class stringtrans{
static boolean pallindrome(String s){
String s1="";
for(int i=s.length()-1;i>=0;i--){
s1=s1+s.charAt(i);
}
if(s.equals(s1))
  return true;
else
  return false;
}
public static void main(String []args){
Scanner sc=new Scanner(System.in);
System.out.print("enter a string");
String s=sc.next();
int i=s.length()-1;
while(pallindrome(s1+s)==false){
s1=s1+s.charAt(i);
i--;
}
System.out.println("pallindrome after adding the characters to the given string is "+s1+s);
}
}