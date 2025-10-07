package com.demo.packages.p2;

import com.demo.packages.p1.P1C1;

public class P2C1 {
    public static void main(String[] args){
        P1C1 p1c1 = new P1C1();
//        System.out.println(p1c1.privateVar);
//        p1c1.privateMethod();
//        System.out.print(p1c1.packagePrivateVar);
//        p1c1.packagePrivateMethod();
//        System.out.println(p1c1.protectedVar);
//        p1c1.protectedMethod();
        System.out.println(p1c1.getPrivateVar());
        p1c1.setPrivateVar("New private Var");
        System.out.println(p1c1.getPrivateVar());

    }
}
