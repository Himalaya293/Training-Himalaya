class sample<E>{
void show(E a) {
System.out.println(a);
}
}

class gene {
public static void main(String[] args) {
 sample<Integer> s=new sample<Integer>();		
s.show(100);
sample<Double> k=new sample<Double>();		
k.show(15.3);
sample<String> p=new sample<String>();		
p.show("hello world");
}
}