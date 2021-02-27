import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.util.*;
class bytearrayop{
public static void main(String []args)throws Exception{
   try{
         FileOutputStream fout=new FileOutputStream("D:\\byteout.txt");
         ByteArrayOutputStream bout=new ByteArrayOutputStream();
         String s="this is an ByteArrayOutputStream";
         byte b[]=s.getBytes();
         bout.write(65);
         bout.write(b);
         bout.writeTo(fout);
         bout.flush();
         fout.close();
         bout.close();
         System.out.print("hi this is himalaya");
        }
 catch(Exception e){System.out.println("hellooo");}
}
}
