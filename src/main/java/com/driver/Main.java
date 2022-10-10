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

        B obj =new B();
        String ans1=obj.meth()
        System.out.println(ans1);
        String ans2=obj.meth();
        System.out.println(ans2);
    }
}

