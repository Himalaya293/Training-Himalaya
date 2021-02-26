import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class digits69 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a=sc.nextInt();
        String num = Integer.toString(a);

        for (int i = 0; i < num.length(); i++){
            char c = num.charAt(i);
            if(c=='6') {
                num = num.substring(0, i) + '9' + num.substring(i + 1);
               break; 
            }
        }
        System.out.println("Largest Number is : "+num);
    }


}

