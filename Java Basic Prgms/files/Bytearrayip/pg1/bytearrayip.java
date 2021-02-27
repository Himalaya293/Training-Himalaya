import java.io.FileInputStream;
import java.io.ByteArrayInputStream;
import java.io.*;
import java.util.*;
class bytearrayip{
public static void main(String []args)throws Exception{
   try{
         //FileInputStream fin=new FileInputStream("D:\\testinput.txt");
         byte[] byt={68,70,73,74};
         ByteArrayInputStream bin=new ByteArrayInputStream(byt);
         int i=0;
         while((i=bin.read())!=-1){
         System.out.print((char)i);}
        }
 catch(Exception e){System.out.println("hellooo");}
}
}
