import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.util.*;
import java.io.*;

class ipstreamreader {
public static void main(String []args){
   try{
         String s="this is himalaya";
         InputStream frin=new FileInputStream("D:\\file.txt");
         
         Reader r=new InputStreamReader(frin);
         int i=0;
         while((i=frin.read())!=-1){
         char ch=(char)i;
         System.out.print(ch);}
        }
 catch(Exception e){
System.out.print("hellooo");
e.printStackTrace();
}
}
}
