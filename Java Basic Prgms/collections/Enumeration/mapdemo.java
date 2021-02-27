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
Enumeration<Integer> ee=hs.elements();
while(ee.hasMoreElements())
{
    System.out.println(ee.nextElement());
}
}
}