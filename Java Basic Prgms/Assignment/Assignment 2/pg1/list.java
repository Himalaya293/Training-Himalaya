import java.util.LinkedList;
class List{
public static void main(String []args)
{
LinkedList<Integer> k=new LinkedList<Integer>();
k.add(1);
k.add(2);
k.add(3);
k.add(6);
k.add(5);
k.add(6);
k.add(8);
System.out.println(k);
k.remove(2);
System.out.println(k);
}
}