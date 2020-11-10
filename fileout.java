import java.io.FileOutputStream;
import java.util.*;
class fileout{
public static void main(String []args){
   try{
         FileOutputStream fout=new FileOutputStream("D:\\testoutput.txt");
         String s="hehehehe";
         byte b[]=s.getBytes();
         fout.write(65);
         fout.write(b);
         fout.close();
         System.out.print("hi this is himalaya");
        }
 catch(Exception e){System.out.println("hellooo");}
}
}
