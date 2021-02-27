import java.util.*;
class x1
{
public static void main(String []args)
{
   Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();
   int b=sc.nextInt();
   int y=0,c=0;
   if(a>=b||b<0)
    {
         if(b<0)
          {
              b=-(b);
               
        for(int i=0;i<=a;i++)
          {
               y=y+b;
              c++;
             if(y==a)
              {
                  System.out.print("-"+c);
                  break;
              }
         }
           }
          else
         {
        for(int i=0;i<=a;i++)
          {
               y=y+b;
              c++;
             if(y==a)
              {
                  System.out.print(c);
                  break;
              }
         }
        }
   } 
     else
     {        
         if(a<=b||a<0)
          {
             if(a<0)
          {
              a=-(a);
              for(int i=0;i<=b;i++)
          {
              y=y+a;
              c++;
              if(y==b)
               {
                  System.out.print("-"+c);
                  break;
                }
           }
       }
        else
        {
             for(int i=0;i<=a;i++)
          {
              y=y+a;
              c++;
              if(y==b)
               {
                  System.out.print(c);
                  break;
                }
           }
        }
      }
   }
}
}