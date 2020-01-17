package com.yash.tester;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import com.yash.pojos.Calculation;

public class TestSpEL3_calculation {

	public static void main(String[] args) {
		Calculation calculation=new Calculation();
		System.out.println(calculation.getNumber());
		StandardEvaluationContext context=new StandardEvaluationContext(calculation);
		
		ExpressionParser parser=new SpelExpressionParser();
		parser.parseExpression("number").setValue(context, "5");
		System.out.println(calculation.cube());
		
	}
}
