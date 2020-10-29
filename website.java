class website{
String features;
String websitename;
int websitecount;
website(String features,String websitename,int websitecount){
this.features=features;
this.websitename=websitename;
this.websitecount=websitecount;
}
void display(){
System.out.println("features are"+features);
System.out.println("website name is="+websitename);
System.out.println("Its counted as="+websitecount);
}
}
class constructor{
public static void main(String []args)
{
website hima=new website("this is used for all the couses related to software","JNIT",3);
hima.display();
website siri=new website("this is the updated version of JNIT","JNIT3",1);
siri.display();
}
}