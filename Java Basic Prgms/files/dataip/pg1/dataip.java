import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.*;
import java.util.*;
class dataip{
public static void main(String []args)throws Exception{
   try{
         InputStream in=new FileInputStream("D:\\datainput.txt");
         DataInputStream din=new DataInputStream(in);
         int i=0;
         while((i=din.read())!=1){
         System.out.print((char)i);}
        }
 catch(Exception e){System.out.println("hellooo");}
}
}
