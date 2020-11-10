import java.io.FileReader;
import java.io.FileInputStream;
import java.util.*;
import java.io.*;

class filereader {
public static void main(String []args){
   try{
         FileReader frin=new FileReader("D:\\filereader.txt");
         int i=frin.read();
         while((i=frin.read())!=-1){
         System.out.print((char)i);}
         frin.close();
        }
 catch(Exception e){System.out.println("hellooo");}
}
}
