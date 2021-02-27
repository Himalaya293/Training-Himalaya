import java.util.*;
class x
{
  public static void main(String []args)
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       
       int num=n;
       int n1=n;
       int r1=0,r=0;
       String s=" ";
       String s1=" ";
       while(n>0)
         {
             r=n%2;
             s=r+""+s;
             n=n/2;
          }
      System.out.print(s);
       while(n1>0)
         {
             r1=n1%8;
             s1=r+""+s1;
             n1=n1/8;
          }
      System.out.print(s1);
       int t,i,d=0,sum=0;
       String result="";
       for(i=num;i>0;i=i/16)
       {
             r=i%16;
	//System.out.println(r);
            if(r==10)
                {
                   result='A'+result;
                }
             else if(r==11)
                {
                    result='B'+result;
                }
              else if(r==12)
                {
                     result='C'+result;
                }
             else if(r==13)
                {
	    result='D'+result;
                }
             else if(r==14)
                {
                     result='E'+result;
                }
             else if(r==15)
                {
                     result='F'+result;
                }
	else
	result=r+result;
    }
      System.out.println(result);
   }
}

