package com.com.SCJP;

import java.util.HashMap;
import java.util.Map;

public class StringExamples {

    public static void main(String[] args) {
        /*Strings are Immutable
         String pool(Set) is maintained only for String literals.
         Why we maintain StringPool?
            for JVM memory optimization and reuse of memory.
            String is heavily used in any programming language, memory allocation is costly.
            Pool concept was introduced.

        String Objects are different than String Literal.

        Objects are stored in HeapArea, Literals are stored in Pool

        StringPool is not a Java class. it's internal implementation of JVM using native code.


    *
    * */

        // HashCode of two objects can be same.
        // we've created a String literal, this will be stored in String Pool.
        String manisha = "manisha";
       // System.out.println(System.identityHashCode(manisha));
        System.out.println(System.identityHashCode(manisha));// printing hashCode of an object

        String manishaObject = new String("manisha");// we've created a manishaObject, this will be stored in Heap memory location.
        System.out.println(System.identityHashCode(manishaObject));// printing hashCode of an object
     //   System.out.println(System.identityHashCode(manishaObject));
        manishaObject=   manishaObject.intern();//intern() is a way of saying JVM to store the String Object from Heap Location to POOL location
        System.out.println(manishaObject.getClass().getName()+"@"+Integer.toHexString(System.identityHashCode(manishaObject)));

        //While dealing with String things you need to identify if it's a literal or an Object

        // comparing two String literals

//--------------------------------------------------------------------------------------
        String poolData1 = "krsna"; // first object is created in pool
        String poolData2 = "krsna";// first object is reused, no new object is created
        String poolData3 = "krsna";// first object is reused, no new object is created
            // total only one object is created in pool

        String heapObject1  = new String("krsna");// new object created
        String heapObject2  = new String("krsna");// new object created
        String heapObject3  = new String("krsna");// new object created
        // total 3 objects are created in Heap.

        // ** System.identityHashCode(Object) will return the reference.

        // hashCode is same for all the above objects.
        // identity hashCode is same for all PoolData Objects (cuz reference are same)
        // identity hashCode is different for all heapObjects  (reference are different)

        // Comparing the objects among literals and heap.

        //**  operator == compares reference
        //**  .equals() compares content



        String poolData11 = "krsna";
        String poolData12 = "krsna";
        String poolData13 = "krsna";



        String heapObject11  = new String("krsna");
        String heapObject12  = new String("krsna");
        String heapObject13  = new String("krsna");

        heapObject11 = heapObject11.intern();
        heapObject12 = heapObject12.intern();
        heapObject13 = heapObject13.intern();
        System.out.println("-------------------------------------------------------------");

        System.out.println(poolData11.hashCode());
        System.out.println(poolData12.hashCode());
        System.out.println(poolData13.hashCode());

        System.out.println(heapObject11.hashCode());
        System.out.println(heapObject12.hashCode());
        System.out.println(heapObject13.hashCode());


        /*if(poolData11.hashCode() == heapObject11.hashCode())// false  true
        if(heapObject11.hashCode() == heapObject12.hashCode())// false true
            if(poolData11.hashCode()== poolData12.hashCode())// true true
        */


        Map<String, String> mp = new HashMap<>();
        mp.put(heapObject11, heapObject11);





    }
}
