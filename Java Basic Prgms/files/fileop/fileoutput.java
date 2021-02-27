import java.io.FileOutputStream;
import java.util.*;
class fileoutput{
public static void main(String []args){
   try{
         FileOutputStream fout=new FileOutputStream("D:\\testout.txt");
         fout.write(65);
         fout.close();
         System.out.print("hi this is himalaya");
        }
 catch(Exception e){System.out.println("hellooo");}
}
}
