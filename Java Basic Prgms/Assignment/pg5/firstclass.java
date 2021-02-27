import java.util.Random;

abstract class compartment
    {
      abstract public void notice();
    }

class firstclass extends compartment{
          public void notice(){
              System.out.println("First class compartment(Reserved use only)");
          }
 }

class ladies extends compartment{
      public void notice(){
            System.out.println("Reserved for ladies");
      }
}

class general extends compartment{
     public void notice(){
        System.out.println("General compartment");
     }
}

class luggage extends compartment{
    public void notice(){
      System.out.println("Compartment for luggages");
    }
}
class compart{
     public static void main(String [] args)
       {
compartment c1=new firstclass();
compartment c2=new ladies();
compartment c3=new general();
compartment c4=new luggage();
Scanner sc=new Scanner(System.in);
int k=sc.nextInt();
if(k==1)
{System.out.print(c1.notice());}
if(k==2)
{System.out.print(c2.notice());}
if(k==3)
{System.out.print(c3.notice());}
if(k==4)
{System.out.print(c4.notice());}
if(k>=5)
{System.out.println("Invalid");}
}
}
