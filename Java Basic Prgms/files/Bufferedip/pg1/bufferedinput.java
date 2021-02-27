import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.*;
class bufferedinput{
public static void main(String []args)throws Exception{
   try{
         FileInputStream fin=new FileInputStream("D:\\buffer.txt");
         BufferedInputStream bin=new BufferedInputStream(fin);
         int i;
         while((i=fin.read())!=-1){
         System.out.print((char)i);}
         bin.close();
         fin.close();
        }
 catch(Exception e){System.out.println("hellooo");}
}
}
