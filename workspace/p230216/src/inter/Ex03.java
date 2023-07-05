package inter;

import java.security.PublicKey;

interface Method{
	// 메서드 pulic abstract
	void one();
	public abstract void two();
	
	
	
	
	// Java 8 부터 지원 
	// default method 
	default void method() {
		System.out.println("interface 내 default method:");
		
	}
	// static method
	public static void staticMethod() {
		System.out.println("interface 내 static method");
	}
	
}




class Sub implements Method{

	@Override
	public void one() {
		System.out.println("sub class overiding one");
	}
	

	
	@Override
	public void two() {
	System.out.println("sub class overiding two");
	
	
	}
	
}



public class Ex03 {
	public static void main(String[] args) {
	//다형성 
	Method m = new Sub();
	m.one();
	m.two();
	m.method();
	Method.staticMethod();
	}
}
