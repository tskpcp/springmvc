package test;

public class HelloWord {
	private String name;
	public void setName(String name){
		this.name=name;
	}
	public void hello(){
		System.out.println("hello:"+name);
	}
	
	public HelloWord(){
		System.out.println("HelloWord is Constructor");
	}
	public HelloWord(String name){
		
	}
}
