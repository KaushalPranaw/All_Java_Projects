package com.app.overriding;
public class GFG { 
    public static void fun() 
    { 
        System.out.println("Welcome to GeeksforGeeks!!"); 
    } 
  
    public static void main(String[] args) 
    { 
        ((GFG)null).fun();
    } 
}