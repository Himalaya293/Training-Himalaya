import java.util.TreeSet;
class setdemo{
public static void main(String []args)
{
TreeSet<String> hs=new TreeSet<String>();
hs.add("F");
hs.add("h");
hs.add("l");
hs.add("m");
hs.add("F");
hs.add("c");
hs.add("a");
hs.add("a");
hs.add("F");
hs.add(" ");
hs.add("g");
hs.add("p");
hs.add("n");
hs.add("s");
hs.add("r");
System.out.println(hs);
System.out.println(hs.headSet("p",false));
System.out.println(hs.tailSet("p",false));
System.out.println(hs.subSet("p","s"));
}
}