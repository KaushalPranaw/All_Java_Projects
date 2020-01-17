package com.yash.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class EmployeeAOP {

	@Pointcut("within(com.yash.dao..*)")
	@Before("execution(public * *(..))")
	public void logBeforeGetAllEmp(JoinPoint joinPoint)
	{
		System.out.println("logBeforeGetAllEmp() called : "+joinPoint.getSignature().getName());
	}
	
	@After("execution(* com.yash.dao.EmployeeDao.*(..))")
	public void logAfterGetAllEmp(JoinPoint joinPoint)
	{
		System.out.println("logAfterGetAllEmp() called : "+joinPoint.getSignature().getName());
	}
	
	@AfterReturning("execution(* com.yash.dao.EmployeeDao.*(..))")
	public void logAfterReturningGetAllEmp(JoinPoint joinPoint)
	{
		System.out.println("logAfterReturningGetAllEmp() called : "+joinPoint.getSignature().getName());
	}
	
	@AfterThrowing("execution(* com.yash.dao.EmployeeDao.*(..))")
	public void logAfterThrowingGetAllEmp(JoinPoint joinPoint)
	{
		System.out.println("logAfterThrowingGetAllEmp() called : "+joinPoint.getSignature().getName());
	}
	
	@Around("execution(* com.yash.dao.EmployeeDao.*(..))")
	public void logAroundGetAllEmp(ProceedingJoinPoint joinPoint) throws Throwable
	{
		System.out.println("logAroundGetAllEmp() called : preprocessing"+joinPoint.getSignature().getName());
		joinPoint.proceed();
		System.out.println("logAroundGetAllEmp() called : postprocessing"+joinPoint.getSignature().getName());
	}
	
}
