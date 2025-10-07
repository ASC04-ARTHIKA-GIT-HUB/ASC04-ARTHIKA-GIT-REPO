package Lab2;
import java.util.Scanner;

import java.util.Scanner;

public class Welcome_Msg_Md {
    public static String welcomeMessage(String name) {
        return "Hello " + name + ", Welcome to Java World!";
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name: ");
        String s=sc.nextLine();
        String msg=welcomeMessage(s);
        System.out.println(msg);
    }


}
