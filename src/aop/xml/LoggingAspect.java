package aop.xml;


import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


public class LoggingAspect {
	
	public void  beforeMethod(JoinPoint joinPoint){
		String methodName=joinPoint.getSignature().getName();
		List<Object> args=Arrays.asList(joinPoint.getArgs());
		System.out.println("the method "+methodName+" begins with "+args);
	}
	
	
	public void afterMethond(JoinPoint joinPoint){
		String methodName=joinPoint.getSignature().getName();
		List<Object> args=Arrays.asList(joinPoint.getArgs());
		System.out.println("the method "+methodName+" Ends with "+args);
	}
	
	
	public void afterReturning(JoinPoint joinPoint,Object result){
		String methodName=joinPoint.getSignature().getName();
		System.out.println("the method "+methodName+" return with "+result);
	}
	

	public void afterThrowing(JoinPoint joinPoint,Exception ex){
		String methodName=joinPoint.getSignature().getName();
		System.out.println("the method "+methodName+" occurs excetion "+ex);
	}
	
	public Object aroundMethod(ProceedingJoinPoint pjd){
		
		Object result=null;
		String methodName=pjd.getSignature().getName();
		try{
			
			System.out.println("the method "+methodName+" begins with "+Arrays.asList(pjd.getArgs()));
			result=pjd.proceed();
		
			System.out.println("the method "+methodName+" ends with "+result);
		}
		catch(Throwable ex){
			
			
			System.out.println("the method "+methodName+" occure exception��"+ex);
			throw new RuntimeException(ex);
		}
		
		System.out.println("the method "+methodName+" ends");
		return result;
	}
}
