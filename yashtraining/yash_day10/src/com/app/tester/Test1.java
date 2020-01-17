package com.app.tester;
class Grandparent  
{ 
    public void Print()  
    { 
        System.out.println("Grandparent's Print()");  
    }  
} 
  
class Parent extends Grandparent  
{ 
    public void Print()  
    { 
        System.out.println("Parent's Print()");  
    }  
} 
  
class Child extends Parent  
{ 
    public void Print()    
    { 
        super.Print(); 
        System.out.println("Child's Print()");  
    }  
} 
  
public class Test1  
{ 
	public static void main(String[] args) 
    { 
        System.out.println((100/25.0)*Integer.parseInt("5") + 50); 
    } 
} 