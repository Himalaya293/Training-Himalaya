import java.util.*;

public class capitals {
	

	private static boolean isStringUpperCase(String s) {
       
		char[] ch = s.toCharArray();
        for(int i=0; i < ch.length; i++){
 
            if( !Character.isUpperCase( ch[i] ))
                return false;
        }
        return true;
	}
        private static boolean isStringLowerCase(String s) {
            
    		char[] ch = s.toCharArray();
            for(int i=0; i < ch.length; i++){
     
                if( !Character.isLowerCase( ch[i] ))
                    return false;
            }
		return true;
	}
      private static boolean isStringTitleCase(String s) {
            
    		char[] ch = s.toCharArray();
            for(int i=0; i < ch.length; i++){
     
              //if(ch[0] >= 90&ch[0]<=65&ch[0+1]<=97&ch[0+1]>=122);
                    if (!Character.isLowerCase(ch[1])&!Character.isTitleCase(ch[0]));
                        return false;
            }
		return true;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter s value");
		String s=sc.next();
		System.out.println("it is in uppercase ="+isStringUpperCase(s));
		System.out.println("it is in lowercase ="+isStringLowerCase(s));
		System.out.println("it is in Titlecase ="+isStringTitleCase(s));

	}

}
