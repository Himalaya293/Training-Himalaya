import java.io.FileInputStream;
import java.util.*;
import java.io.*;

class reader{
public static void main(String []args){
   try{
         Reader rin=new FileReader("D:\\readerin.txt");
         int i=rin.read();
         while(i!=-1){
         System.out.print((char)i);}
         rin.close();
        }
 catch(Exception e){System.out.println("hellooo");}
}
}
