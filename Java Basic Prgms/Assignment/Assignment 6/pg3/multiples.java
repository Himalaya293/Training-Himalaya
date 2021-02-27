/*3) Write a program that outputs the string representation of numbers from 1 to n.
But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.
Example:
n = 15 */

import java.util.*;
class multiples
{
public static void main(String []args)
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the value of n");
     int n=sc.nextInt();
     for(int i=0;i<=n;i++)
        {
             if(i%3!=0&i%5!=0){
             System.out.println(i);}
             if(i%3==0&i!=0&i!=n){System.out.println("fizz");}
             if(i%5==0&i!=0&i!=n){System.out.println("Buzz");}
             if(i%5==0&i%3==0&i!=0){System.out.println("fizzBuzz");}
             
        }
  }
}