package com.yash.tester;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class TestSpEL2 {

	public static void main(String[] args) {
		ExpressionParser parser=new SpelExpressionParser();
		Expression exp = parser.parseExpression("'Hello World'.bytes");  
		byte[] bytes = (byte[]) exp.getValue();  
		for(int i=0;i<bytes.length;i++){  
		    System.out.print(bytes[i]+" ");  
		}  
		System.out.println();
		//get length
		System.out.println(parser.parseExpression("'pranaw kaushal'.bytes.length").getValue());
		
	}
}
