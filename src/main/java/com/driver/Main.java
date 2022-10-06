package com.driver;

public class Main {
    public static  void main(String[] args){

        B obj =new B();
        String ans=obj.meth();
        System.out.println(ans);
        A obj1 = new B();
        System.out.println(obj1.meth());
    }
}

class A{
    String meth(){
        return "Invoking method from class A";
    }
}
class B extends A{
    String meth(){
        return "Method is overridden in Extendend class B";
    }
}