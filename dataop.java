import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.*;
class dataop{
public static void main(String []args)throws Exception{
   try{
         FileOutputStream fout=new FileOutputStream("D:\\dataout.txt");
         DataOutputStream dout=new DataOutputStream(fout);
         String s="this is an ByteArrayOutputStream";
         byte b[]=s.getBytes();
         dout.writeInt(65);
         dout.write(b);
         dout.flush();
         fout.close();
         dout.close();
         System.out.print("hi this is himalaya");
        }
 catch(Exception e){System.out.println("hellooo");}
}
}
