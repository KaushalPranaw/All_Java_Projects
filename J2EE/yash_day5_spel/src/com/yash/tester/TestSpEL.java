package com.yash.tester;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class TestSpEL {

	public static void main(String[] args) {
		ExpressionParser expressionParser=new SpelExpressionParser();
		Expression expression=expressionParser.parseExpression("'Hello Spel'");
		String msg=(String) expression.getValue();
		System.out.println(msg);
		//concat() method
		System.out.println(expressionParser.parseExpression("'Welcome SPEL'.concat('!')").getValue());  
		
		
	}
}
