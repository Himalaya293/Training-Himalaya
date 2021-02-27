import java.util.LinkedHashSet;
class setdemo{
public static void main(String []args)
{
LinkedHashSet<String> hs=new LinkedHashSet<String>();
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
System.out.print(hs);
}
}