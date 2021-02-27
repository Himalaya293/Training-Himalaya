import java.util.*;
//import java.util.List;
//import java.util.ArrayList;

class rotatelist{

public static void main(String[] args) {
List list = new ArrayList();
List newlist = new ArrayList();
for (int i = 60; i >= 10; i -= 10) {
list.add(i);
}
System.out.println(list);
System.out.println("Enter a number whch is less than "+list.size());
Scanner sc = new Scanner(System.in);
int k = sc.nextInt();
for(int i=k; i<list.size(); i++) {
newlist.add(list.get(i));
}
if(list.size() - newlist.size() > 0 ) {
for(int j=0; j<k; j++) {
newlist.add(list.get(j));
}
}
System.out.println(newlist);
}
}