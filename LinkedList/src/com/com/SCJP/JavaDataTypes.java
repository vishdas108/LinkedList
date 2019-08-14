package com.com.SCJP;


/*
* FINAL fields can't be changed once the've been set.
* {you can set static and non static fields from nonstatic block}
* {you can't set non static fields inside static block= gives you C.E}
*
*
*
* */


public class JavaDataTypes {

    public static void main(String[] args) {
        byte b = -128;
        int i = b;// you can assign byte into integer(no data loss), sign of the value is preserved
        String s = new String();
        String s2 =s;  // here only one object s is created, s2 has a reference of s.


    }
}
