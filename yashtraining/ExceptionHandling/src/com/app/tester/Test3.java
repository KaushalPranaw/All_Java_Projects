package com.app.tester;
public class Test3{     
    public static void main(String args[]){
          try{
                String arr[] = new String[10];
                arr = null;
                //arr[0] = "one";
               // System.out.print(arr[0]);
          }catch(NullPointerException nex){
                System.out.print("null pointer exception");
          }   
    }
}