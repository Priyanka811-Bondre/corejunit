package com.csi.controller;

public class ArithmaticApplication {
    public static void main(String[] args) {
        System.out.println("\n Addition Result:"+add(4,5));
        System.out.println("\n Subtraction Result:"+sub(7,5));
        System.out.println("\n Multiplication Result:"+mul(4,5));
        System.out.println("\n Division Result:"+div(10,5));
    }
    public static int add(int n1,int n2){
        return n1+n2;
    }
    public static int sub(int n1,int n2){
        return  n1-n2;
    }
    public static int mul(int n1,int n2){
        return n1*n2;
    }
    public static int div(int n1,int n2){
        return n1/n2;
    }
}
