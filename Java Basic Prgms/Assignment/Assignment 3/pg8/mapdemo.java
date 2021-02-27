import java.util.HashMap;
import java.util.Collections;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;

class mapdemo{
public static void main(String []args)
{
HashMap<Integer,String> hs=new HashMap<Integer,String>();
hs.put(3,"India");
hs.put(2,"punjab");
hs.put(5,"Nigeria");
hs.put(4,"Manipur");
hs.put(1,"Rajasthan");
System.out.println(hs);
  Set s=hs.entrySet();
  Iterator i=s.iterator();
  while(i.hasNext())
    {
       Map.Entry m=(Map.Entry)i.next();
       System.out.println(m.getKey()+" "+m.getValue());
    }
}
}