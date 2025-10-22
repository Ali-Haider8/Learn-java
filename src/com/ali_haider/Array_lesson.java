package com.ali_haider;

import java.util.ArrayList;

public class Array_lesson {
    
    public static String Demo="";
    
    public static void main(String[] args) {
        
        //array
        Integer[] name=new Integer[4];
        name[0]=1;
        name[1]=2;
        name[2]=3;
        name[3]=4;
        for (int i=0;i<4;i++){
        System.out.println(name[i]);
        }
        
        //array_list
            ArrayList<Integer> numbers=new ArrayList<Integer>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(4);
            System.out.println(numbers);       
    }
    
}
