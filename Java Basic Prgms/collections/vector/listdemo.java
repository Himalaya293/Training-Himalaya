import java.util.Vector;
class listdemo{
public static void main(String []args)
{
Vector<Integer> hs=new Vector<Integer>();
hs.add(23);
hs.add(28);
hs.add(23);
hs.add(32);
hs.add(71);
hs.add(78);
hs.add(95);
hs.add(21);
hs.add(9);
hs.add(112);
hs.add(100);
hs.add(95);
hs.add(88);
hs.add(61);
hs.add(62);
System.out.println(hs);
hs.set(3,95);
System.out.println(hs);
}
}