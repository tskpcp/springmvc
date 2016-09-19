package aop.helloworld;

import java.lang.reflect.Proxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ArithmeticCalculatorLoggingProxy{
		private  ArithmeticCalculator target;
		
		public ArithmeticCalculatorLoggingProxy(ArithmeticCalculator target) {
			super();
			this.target = target;
		}

		public ArithmeticCalculator getLogginProxy(){
			ArithmeticCalculator proxy=null;
			//代理对象由哪一个类加载器负责加载
			ClassLoader loader=target.getClass().getClassLoader();
			//代理对象的类型，即其中有哪些方法
			Class[] interfaces=new Class[]{ArithmeticCalculator.class};
			//当调用代理对象其中的方法时，该执行的代码
			InvocationHandler h=new InvocationHandler(){
				/*
				 * proxy:正在返回的那个代理对象，一般情况下，在invoke方法中都不使用该对象
				 * interfaces:正在调用的方法
				 * h:调用方法时，传入的参数
				 */
				@Override
				public Object invoke(Object proxy,Method method,Object[] args)throws Throwable{
					String methodName=method.getName();
					//日志
					System.out.println("the method "+methodName+" begins with "+Arrays.asList(args));
					//执行方法
					Object result=method.invoke(target, args);
					//日志
					System.out.println("the method "+methodName+" ends with "+result);
					return 0;
				}
			};
			proxy=(ArithmeticCalculator)Proxy.newProxyInstance(loader, interfaces, h);
			
			return proxy;
		}
}
