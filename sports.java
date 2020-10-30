class sports{
void indoor(){
System.out.println("Indoor games");
}
void outdoor(){
System.out.println("Outdoor games");
}
}
class chess extends sports{
void indoor(){
System.out.println("It consist of 2");
}
void outdoor(){
System.out.println("It consist of 3");
}
}
class carroms extends sports{
void indoor(){
System.out.println("It consist of 4");
}
void outdoor(){
System.out.println("It consist of 8");
}
}
class methodoverriding{
public static void main(String []args){
sports x=new sports();
x.indoor();
x.outdoor();
x=new chess();
x.indoor();
x.outdoor();
x=new carroms();
x.indoor();
x.outdoor();
}
}
