// package statement always comes first, before import statement
// Order is, 1)package, 2)import,3) class/interface
//java.util.* <---- this package will be imported implicitly
// package statement occurs only once in java file
// if package statement is absent, then it belongs to default package.
// classes inside default package can't be imported within classes inside another package
package com.com.SCJP;

import static java.lang.Integer.MAX_VALUE; // you import static members like this with "static" keyWord

// only one public class per file, can have multiple "class" without public
public class Basic {

/*
* Class Level means static fields, blocks, methods--> can be accessed from anywhere(inside non-static methods as well), and also from outside the class, depending on accessibility
*
* */

   static public Basic INSTANCE = new Basic(); // static public is also valid

    // Instance or static vairables can have access modifiers,
    //public, private, default, protected. and final, transient, volatile, and static.

    /*
        ex: All are valid, replace with public and protected
        private static String v;
        private volatile static  String g;
        private transient static String stat;
        private volatile transient static String sd;

    * */

    /*
    * "this" keyword:
    * can't have this = new Object();
    * this reference is only for object
    * this--> means current Object's
    * */

    //1) default value for an object is null,
    //2) This is a class variable, i.e, one variable per class,(all static variables are class variables)

    public static Integer classVariable = Integer.valueOf(3);


    // This is Instance variable, i.e, there will be one separate variable per Object,(all instance will have it's own copy)
    // Instance level variables--> these are accessed only from instance methods
    public Integer instanceVariable= Integer.valueOf(3);


    public String shadow ="global value";

    public String main =""; // you can have both method and variable with same name.

/*
* On calling--> java Basic 1 2 3 4 : File Name(Basic) is not a part of arguments: args[0]=1, so on... in total four arguments are present
* Valid main method declarations:
* 1) final static public void main(String [] args){}
* 2) public static void main(String ... args){}
* 3) public final static void main(String [] args){}.. you can have "final" key word in main method
* you can't access instance variable directly inside static block.
*
* This method will make the class executable, can have multiple methods with name "main", different signature.
*  "final" keyword in static methods means--> subclasses cannot shadow.
* */
   public static void main(String [] args){



       Basic [] names = new Basic[]{new Basic(), new Basic()};
       // [] means array, it can either come before or after variable name
       // Basic names[], name; names is array, name is an object;
       System.out.println(names);// will print-->  [Lcom.com.SCJP.Basic;@1b6d3586
       System.out.println(names[0]);// will print--> com.com.SCJP.Basic@4554617c
       System.out.println(names[0].instanceVariable);// will print--> 3

        INSTANCE.shadowGlobalVariable();

   }



   public void shadowGlobalVariable(){
       try{
           // you can't specify the visibility of a local variable, like public, private, protected are not valid, accessible within a method only
           // only final is valid. i.e,
           // final String shadow =""; this is valid
           // local variable must be initialized before usage
          // you can't apply "synchronized" and "native" to any variable
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
   /*
   * you don't need instance to access this method,i.e, static method
   * possible declarations of a static method
   * public static void someMethod(){}
   * static void someMethod1(){}
   * protected static int someMethod1(){ return 0;}
   * */
   static int retStaticA(){

      // return  a; invalid cuz, it's a instance member.
   return b;// valid, static members can be accessed inside static method.
   }

}


class Basic1{

}
