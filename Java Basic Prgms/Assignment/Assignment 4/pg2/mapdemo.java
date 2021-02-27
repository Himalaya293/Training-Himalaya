import java.util.*;
import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;
class Student{  
  int empid;  
  String name;  
  String email;
  String gender;
  float salary;  
  Student(int rollno,String name,String email,String gender,float salary){  
   this.empid=empid;  
   this.name=name;  
   this.email=email;
   this.gender=gender;
   this.salary=salary;  
  }  
}  

class mapdemo{  
 public static void main(String args[]){  
 
  List<Student> al=new ArrayList<Student>();  
  Student s1=new Student(101,"lasya","lasya@123gmail.com","female",25.35f);  
  Student s2=new Student(102,"Ravi","ravi@1234gmail.com","male",56.28f);  
  Student s3=new Student(103,"dharani","dharani@123gmail.com","female",35.78f);
  Student s4=new Student(104,"madhavi","madhavi@123gmail.com","female",35.78f); 
  Student s5=new Student(105,"latha","latha@123gmail.com","female",35.78f);  
  
  al.add(s1);
  al.add(s2);  
  al.add(s3);  
  List<Student> pl=new ArrayList<Student>();
  pl.add(s4);
  pl.add(s5);
  
  Iterator itr=al.iterator();  
  while(itr.hasNext()){  
    Student st=(Student)itr.next();  
    System.out.println(st.empid+" "+st.name+" "+st.gender);  
  
  }  
   System.out.println(al.get(2));
   System.out.println(al.add(s2));
   System.out.println(al.removeAll(pl));
   System.out.println(al.retainAll(pl));
 }  
}  