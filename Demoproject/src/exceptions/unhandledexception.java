package exceptions;

public class unhandledexception {
    public static void main(String[] args){
        int i=100;
        System.out.println("divide by zero");
        int res=i/0;
        System.out.println("abruptly terminated, so this does not execute");
        System.out.println(res);
    }
}
