import java.io.FileInputStream;
import java.util.*;
class filein{
public static void main(String []args){
   try{
         FileInputStream fin=new FileInputStream("D:\\testin.txt");
         int i=fin.read();
         System.out.print((char)i);
         fin.close();
        }
 catch(Exception e){System.out.println("hellooo");}
}
}
