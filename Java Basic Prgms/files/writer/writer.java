import java.io.Writer;
import java.util.*;
import java.io.*;
 
class writer{
public static void main(String []args){
   try{
         Writer wt=new FileWriter("D;\\writer.txt");
         String s="this is an ByteArrayOutputStream";
         wt.write(s);
         wt.close();
         System.out.print("hi this is himalaya");
        }
 catch(Exception e){System.out.println("hellooo");}
}
}
