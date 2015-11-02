package com.fdmgroup.example.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;




@Aspect

public class ConsoleLog {
	
	
	@Before("execution(* *(..))")
	public void logEntry()
	{
		System.out.println("Entering a method...");
	}
	
	
	@After("execution(* work(..))")
	public void logExitWork()
	{
		System.out.println("Exiting work()...");
	}
	
	
	@AfterReturning(pointcut="pointcutMethod()", returning="returnedObject")
	public void logReturnUser(User returnedObject)
	{	
		System.out.println("User was returned: "+ returnedObject);
	}
	
	@Pointcut("execution(com.fdmgroup.example.aop.User com.fdmgroup.example.aop.*.*(..))")
	public void pointcutMethod(){
		
	}
	
	@Pointcut("execution(* *(..))")
	public void anyMethodPointcut(){
		
	}
	
	
	@AfterThrowing(pointcut="anyMethodPointcut()", throwing="thrownException")
	public void logThrowException(Exception thrownException)
	{
		System.out.println("Log: An Exception was thrown: "+ 
					thrownException.getClass().getSimpleName());
	}
	
	@Around("execution (* setName(..))")
	public void displayAroundMethodCall(ProceedingJoinPoint joinpoint){
		System.out.println("Before calling get instance");
		
		Object[] args = joinpoint.getArgs();
		args[0] = "Mohamad is Great";
		try{
			joinpoint.proceed(args);
		}
		catch(Throwable e){
			e.printStackTrace();
		}
		System.out.println("Logging after getting the isntance");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
