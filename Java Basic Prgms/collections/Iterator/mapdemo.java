import java.util.Iterator;
import java.util.Enumeration;
import java.util.Vector;
class mapdemo{
public static void main(String []args)
{
Vector<Integer> hs=new Vector<Integer>();
hs.add(23);
hs.add(28);
hs.add(23);
hs.add(32);
hs.add(71);
System.out.println(hs);
Iterator<Integer> ee=hs.iterator();
while(ee.hasNext())
{
    System.out.println(ee.next());
}
}
}