import java.util.function.*;
interface sayable{  
    void say(String msg);  
}  
public class functionalinterfaceexample implements sayable{  
    public void say(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
    functionalinterfaceexample fie = new functionalinterfaceexample();  
    fie.say("Hello there");  
    }  
}  

