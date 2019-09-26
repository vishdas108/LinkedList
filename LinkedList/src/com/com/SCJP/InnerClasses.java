package com.com.SCJP;

import com.sun.org.apache.bcel.internal.classfile.InnerClass;

public class InnerClasses {

    class Inner {

    }


    public static void main(String[] args) {

        Inner i = new InnerClasses().new Inner();

    }
}
