import java.io.StringReader;
import java.io.FileInputStream;
import java.util.*;
import java.io.*;

class stringarray {
public static void main(String []args){
   try{
         String s="this is himalaya";
         StringReader frin=new StringReader(s);
         int i=0;
         while((i=frin.read())!=-1){
         char ch=(char)i;
         System.out.print(ch);}
        }
 catch(Exception e){System.out.println("hellooo");}
}
}
