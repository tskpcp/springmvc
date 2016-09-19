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

//�������������һ�����棬��Ҫ�Ѹ�����뵽IOC�����У�������΢һ������
@Order(2)
@Aspect
@Component
public class LoggingAspect {
	/*
	 * ����һ�����������������������ʽ��һ��ģ��÷������ٲ���Ҫ���������Ĵ���
	 * ʹ��@Pointcut�������������ʽ
	 * ���������ֱ֪ͨ��ʹ�÷����������õ�ǰ���������ʽ
	 */
	@Pointcut("execution(public int aop.Impl.ArithmeticCalculator.*(..))")
	public void declareJoinPointExpression(){}
	//�÷�����һ��ǰ��֪ͨ����Ŀ�귽����ʼ֮ǰִ��
	//ǰ��֪ͨ
	@Before("declareJoinPointExpression()")
	public void  beforeMethod(JoinPoint joinPoint){
		String methodName=joinPoint.getSignature().getName();
		List<Object> args=Arrays.asList(joinPoint.getArgs());
		System.out.println("the method "+methodName+" begins with "+args);
	}
	//����֪ͨ����Ŀ�귽��ִ�к������Ƿ�����̣���ִ��֪ͨ
	//�ں���֪ͨ�л����ܷ���Ŀ�귽����ִ�н��
	@After("declareJoinPointExpression()")
	public void afterMethond(JoinPoint joinPoint){
		String methodName=joinPoint.getSignature().getName();
		List<Object> args=Arrays.asList(joinPoint.getArgs());
		System.out.println("the method "+methodName+" Ends with "+args);
	}
	//����֪ͨ:�ڷ�������������ִ�еĴ���
	@AfterReturning(value="declareJoinPointExpression()",returning="result")
	public void afterReturning(JoinPoint joinPoint,Object result){
		String methodName=joinPoint.getSignature().getName();
		System.out.println("the method "+methodName+" return with "+result);
	}
	//�쳣֪ͨ:�ڷ��������쳣ʱ��ִ�еĴ��룬���Է��ʵ��쳣�����ҿ���ָ�������ض��쳣ʱ��ִ��֪ͨ����
	@AfterThrowing(value="declareJoinPointExpression()",throwing="ex")
	public void afterThrowing(JoinPoint joinPoint,Exception ex){
		String methodName=joinPoint.getSignature().getName();
		System.out.println("the method "+methodName+" occurs excetion "+ex);
	}
	
//	//����֪ͨ:,��ҪЯ��ProceedingJoinPoint���͵Ĳ���
//	//����֪ͨ�����붯̬�����ȫ���̣�ProceedingJoinPoint���͵Ĳ������Ծ����Ƿ�ִ��Ŀ�귽��
//	//�һ���֪ͨ�����з���ֵ������ֵ��ΪĿ�귽���ķ���ֵ
//	@Around("declareJoinPointExpression()")
//	public Object aroundMethod(ProceedingJoinPoint pjd){
//		//ִ��Ŀ�귽��
//		Object result=null;
//		String methodName=pjd.getSignature().getName();
//		try{
//			//ǰ��֪ͨ
//			System.out.println("the method "+methodName+" begins with "+Arrays.asList(pjd.getArgs()));
//			result=pjd.proceed();
//			//����֪ͨ
//			System.out.println("the method "+methodName+" ends with "+result);
//		}
//		catch(Throwable ex){
//			
//			//�쳣֪ͨ
//			System.out.println("the method "+methodName+" occure exception��"+ex);
//			throw new RuntimeException(ex);
//		}
//		//����֪ͨ
//		System.out.println("the method "+methodName+" ends");
//		return result;
//	}

}
