package com.demo.packages.p1;

public class P1C1 {
    private String privateVar="private Var";
    private void privateMethod(){
        System.out.println("Private Method!");

    }

    String packagePrivateVar="package private var";
    void packagePrivateMethod(){
        System.out.print("PackagePrivateMethod");
    }

    protected String protectedVar="protected var";
    protected void protectedMethod(){
        System.out.print("ProtectedMethod");
    }

    public String getPrivateVar() {
        return privateVar;
    }

    public void setPrivateVar(String privateVar) {
        this.privateVar = privateVar;
    }

    public String publicVar="public var";
    public void publicMethod(){
        System.out.print("Public Method");
    }

    public static void main(String[] args){
        P1C1 p1c1 = new P1C1();
        System.out.println(p1c1.privateVar);
        p1c1.privateMethod();
        System.out.print(p1c1.packagePrivateVar);
        p1c1.packagePrivateMethod();
        System.out.println(p1c1.protectedVar);
        p1c1.protectedMethod();
        System.out.println(p1c1.publicVar);
        p1c1.publicMethod();

    }
}
