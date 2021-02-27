import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.*;
class bufferoutput{
public static void main(String []args)throws Exception{
   try{
         FileOutputStream fout=new FileOutputStream("D:\\bufferout.txt");
         BufferedOutputStream bout=new BufferedOutputStream(fout);
         String s="this is an assignment";
         byte b[]=s.getBytes();
         bout.write(b);
         bout.flush();
         fout.close();
         bout.close();
         System.out.print("hi this is himalaya");
        }
 catch(Exception e){System.out.println("hellooo");}
}
}
