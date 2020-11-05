import java.util.*;
class x1
{
    public static void main(String []args)
      {
         Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         String p=" ";
         int i;
         for(i=0;i<s.length();i++)
           {
               if(i%2==0)
                 {
                     //p=s.charAt(i);
                    System.out.print(s.charAt(i));
                 }
             }
        System.out.println("enter the values of s1 and s2");
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println(s1.concat(s2));
       }
}