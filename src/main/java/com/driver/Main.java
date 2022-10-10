package com.driver;

public class Main {
    static class A{
        public String meth(){
            return "Invoking method from class A";
        }
    }
    static class B extends A{
        public String meth(){
            return "Method is overridden in Extendend class B";
        }
    }
    public static  void main(String[] args){

        A obj =new B();
        String ans1=obj.meth();
        System.out.println(ans1);
        B obj2=new B();
        String ans2=obj2.meth();
        System.out.println(ans2);
    }
}

