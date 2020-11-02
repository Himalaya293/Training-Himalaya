import java.util.HashSet;
public class MyHashSet{
public static void main(String []args)
{
  HashSet<String> h=new HashSet<String>();
  h.add("satya");
  h.add("lasya");
  h.add("nithya");
  h.add("kranthi");
  System.out.print(h);
  System.out.print(h.contains("nithya"));
  System.out.print(h.add("rahul"));
  System.out.print(h.remove("kranthi"));
}
}

 
 