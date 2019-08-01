// package statement always comes first, before import statement
// Order is, 1)package, 2)import,3) class/interface
//java.util.* <---- this package will be imported implicitly
// package statement occurs only once in java file
package com.com.SCJP;

import static java.lang.Integer.MAX_VALUE; // you import static members like this with "static" keyWord

// only one public class per file, can have multiple "class" without public
public class Basic {

   static public Basic INSTANCE = new Basic(); // static public is also valid


    //1) default value for an object is null,
    //2) This is a class variable, i.e, one variable per class,(all static variables are class variables)
    public static Integer classVariable = Integer.valueOf(3);


    // This is Instance variable, i.e, there will be one separate variable per Object,(all instance will have it's own copy)
    public Integer instanceVariable= Integer.valueOf(3);


    public String shadow ="global value";

/*
* On calling--> java Basic 1 2 3 4 : File Name(Basic) is not a part of arguments: args[0]=1, so on...
* Valid main method declarations:
* 1) final static public void main(String [] args){}
* 2) public static void main(String ... args){}
*
* you can't access instance variable directly inside static block.
* */
   public static void main(String [] args){

       Basic [] names = new Basic[]{new Basic(), new Basic()};
       System.out.println(names);// will print-->  [Lcom.com.SCJP.Basic;@1b6d3586
       System.out.println(names[0]);// will print--> com.com.SCJP.Basic@4554617c
       System.out.println(names[0].instanceVariable);// will print--> 3

        INSTANCE.shadowGlobalVariable();

   }



   public void shadowGlobalVariable(){
       try{
           String shadow = "localGlobal";
        // local variables will shadow the global variables
       }catch (Exception e){

       }

       System.out.println("print global ==>" + shadow);// This will print the global instance variable, local variable "shadow" is out of scope.

   }

   int a;
  static int b;
   int retinstanceA(){
   // you can access both static and non static variable inside non-static method
      // return a; valic
       return b;// valid
   }
   static int retStaticA(){

      // return  a; invalid cuz, it's a instance member.
   return b;// valid, static members can be accessed inside static method.
   }

}


class Basic1{

}
