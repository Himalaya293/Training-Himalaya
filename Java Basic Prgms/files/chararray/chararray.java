import java.io.CharArrayReader;
import java.io.FileInputStream;
import java.util.*;
import java.io.*;

class chararray {
public static void main(String []args){
   try{
         char[] a={'h','i','m','a','l','a','y','a'};
         CharArrayReader frin=new CharArrayReader(a);
         int i=0;
         while((i=frin.read())!=-1){
         char ch=(char)i;
         System.out.print((char)i);}
        }
 catch(Exception e){System.out.println("hellooo");}
}
}
