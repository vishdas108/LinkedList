package com.com.SCJP;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HashCodeEquals {
private String name;
private Integer age;
    public HashCodeEquals(String name, Integer age){
        this.name = name;
        this.age= age;


    }

    @Override
    public int hashCode() {
        Random random = new Random();
       // return random.nextInt();
       // return super.hashCode();
        return 0;
    }

    @Override
    public boolean equals(Object object) {
                if(!(object instanceof HashCodeEquals)){
                    return false;
                }
                    HashCodeEquals thatObject = (HashCodeEquals)object;

                    if(this.name== thatObject.name && this.age== thatObject.age){
                        return true;
                    }

        return false;
    }

    @Override
    public String toString() {
        return this.name + "  "+ this.age;
    }

    public static void main(String[] args) {
        HashCodeEquals hc1 = new HashCodeEquals("abhi1", 25);
        HashCodeEquals hc2 = new HashCodeEquals("abhi2", 26);
        HashCodeEquals hc3 = new HashCodeEquals("abhi3", 27);

        Map<HashCodeEquals,  HashCodeEquals> map = new HashMap<>();

        map.put(hc3, hc3);
        map.put(hc3, hc3);
        map.put(hc2, hc2);
        map.put(hc2, hc2);
        map.put(hc1, hc1);
        map.put(hc1, hc1);
        map.put(hc1, hc1);
        map.put(hc1, hc1);
        map.put(hc1, hc1);
        map.put(hc1, hc1);

        System.out.println(map.size());
//        System.out.println(map);

    }
}
