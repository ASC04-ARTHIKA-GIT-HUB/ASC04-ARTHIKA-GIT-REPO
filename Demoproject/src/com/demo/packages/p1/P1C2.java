package com.demo.packages.p1;

public class P1C2 {
    public static void main(String[] args){
        P1C1 p1c1 = new P1C1();
        System.out.print(p1c1.packagePrivateVar);
        p1c1.packagePrivateMethod();
        System.out.println(p1c1.protectedVar);
        p1c1.protectedMethod();
    }
}
