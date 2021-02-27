import java.util.HashMap;
class mapdemo{
public static void main(String []args)
{
HashMap<Integer,String> hs=new HashMap<Integer,String>();
hs.put(98745623,"hima");
hs.put(89745631,"padma");
hs.put(5987456,"bharu");
hs.put(89563247,"geetha");
hs.put(7894562,"lasya");
System.out.println(hs);
System.out.println(hs.get(98745623));
System.out.println(hs.containsKey(89563247));
}
}