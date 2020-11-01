import java.util.Scanner;
interface libraryuser{
void registeraccount();
void requestbook();
}
class kidusers implements libraryuser
{
  public void registeraccount()
   {
       System.out.println("You have successfully registered under a Kids Account");
   }
  public  void requestbook()
   {
      System.out.println("display the book in kids category");
   }
}
class adultusers implements libraryuser
{
  public void registeraccount()
   {
       System.out.println("You have successfully registered under a adult Account");
   }
  public void requestbook()
   {
      System.out.println("display the book in fiction category");
   }
}
class users
{
   public static void main(String []args)
    {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       libraryuser kid=new kidusers();
       libraryuser ad=new adultusers();
       if(a<=12)
           {
                kid.registeraccount();
                kid.requestbook();
            }
       else
            {
                 ad.registeraccount();
                 ad.requestbook();
            }
     }
}