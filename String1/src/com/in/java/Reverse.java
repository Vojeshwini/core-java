package com.in.java;


//reverse the given sentence without using the length()
public class Reverse {
    public static void main(String[] args){
        String name="madikeri";
      char[] val= name.toCharArray();
     int count=0;
     for(char i:val){
count++;
     }
for(int i=count-1;i>=0;i--){
    System.out.print(val[i]);
}


    }
}
