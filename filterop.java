import java.io.FilterOutputStream;
import java.io.FileOutputStream;
import java.util.*;
import java.io.*;
class filterop{
public static void main(String []args)throws Exception{
   try{
         File data=new File("D:\\filterout.txt");
         FileOutputStream fout=new FileOutputStream(data);
         FilterOutputStream fop=new FilterOutputStream(fout);
         String s="this is an ByteArrayOutputStream";
         byte b[]=s.getBytes();
         fop.write(65);
         fop.write(b);
         fop.flush();
         fout.close();
         fop.close();
         System.out.print("hi this is himalaya");
        }
 catch(Exception e){System.out.println("hellooo");}
}
}
