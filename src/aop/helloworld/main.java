package aop.helloworld;

public class main {
	//AOP
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmeticCalculator target=new ArithmeticCalculatorImpl();
		ArithmeticCalculator proxy=new ArithmeticCalculatorLoggingProxy(target).getLogginProxy();
		
		int result=proxy.add(1, 2);
		System.out.println("-->"+result);
		
		result=proxy.div(4, 2);
		System.out.println("-->"+result);
	}

}
