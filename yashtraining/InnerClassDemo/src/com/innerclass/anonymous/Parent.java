package com.innerclass.anonymous;

public abstract class Parent {

	 abstract void eat();
	  
	public static void main(String[] args) {
		 Parent parent= new Parent()
				 {

					@Override
					void eat() {
						System.out.println("eating");
						
					}
			 		
				 };
				 parent.eat();
	}
}
