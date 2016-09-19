package aop.Impl;


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

//把这个类声明成一个切面，需要把该类放入到IOC容器中，再声明微一个切面
@Order(2)
@Aspect
@Component
public class LoggingAspect {
	/*
	 * 定义一个方法，用于声明切入点表达式，一般的，该方法中再不需要填入其他的代码
	 * 使用@Pointcut来声明切入点表达式
	 * 后面的其他通知直接使用方法名来引用当前的切入点表达式
	 */
	@Pointcut("execution(public int aop.Impl.ArithmeticCalculator.*(..))")
	public void declareJoinPointExpression(){}
	//该方法是一个前置通知，在目标方法开始之前执行
	//前置通知
	@Before("declareJoinPointExpression()")
	public void  beforeMethod(JoinPoint joinPoint){
		String methodName=joinPoint.getSignature().getName();
		List<Object> args=Arrays.asList(joinPoint.getArgs());
		System.out.println("the method "+methodName+" begins with "+args);
	}
	//后置通知：在目标方法执行后（无论是否发生议程），执行通知
	//在后置通知中还不能访问目标方法的执行结果
	@After("declareJoinPointExpression()")
	public void afterMethond(JoinPoint joinPoint){
		String methodName=joinPoint.getSignature().getName();
		List<Object> args=Arrays.asList(joinPoint.getArgs());
		System.out.println("the method "+methodName+" Ends with "+args);
	}
	//返回通知:在方法正常结束后执行的代码
	@AfterReturning(value="declareJoinPointExpression()",returning="result")
	public void afterReturning(JoinPoint joinPoint,Object result){
		String methodName=joinPoint.getSignature().getName();
		System.out.println("the method "+methodName+" return with "+result);
	}
	//异常通知:在方法出现异常时会执行的代码，可以访问到异常对象，且可以指定出现特定异常时在执行通知代码
	@AfterThrowing(value="declareJoinPointExpression()",throwing="ex")
	public void afterThrowing(JoinPoint joinPoint,Exception ex){
		String methodName=joinPoint.getSignature().getName();
		System.out.println("the method "+methodName+" occurs excetion "+ex);
	}
	
//	//环绕通知:,需要携带ProceedingJoinPoint类型的参数
//	//环绕通知类似与动态代理的全过程：ProceedingJoinPoint类型的参数可以决定是否执行目标方法
//	//且环绕通知必须有返回值，返回值即为目标方法的返回值
//	@Around("declareJoinPointExpression()")
//	public Object aroundMethod(ProceedingJoinPoint pjd){
//		//执行目标方法
//		Object result=null;
//		String methodName=pjd.getSignature().getName();
//		try{
//			//前置通知
//			System.out.println("the method "+methodName+" begins with "+Arrays.asList(pjd.getArgs()));
//			result=pjd.proceed();
//			//后置通知
//			System.out.println("the method "+methodName+" ends with "+result);
//		}
//		catch(Throwable ex){
//			
//			//异常通知
//			System.out.println("the method "+methodName+" occure exception："+ex);
//			throw new RuntimeException(ex);
//		}
//		//后置通知
//		System.out.println("the method "+methodName+" ends");
//		return result;
//	}

}
