package inter;

// 탐색기 실행 : alt shift w
interface A{}
interface B{}
interface C extends A{}
interface D extends A,B{}  // 다중 상속 허용

class E{}
class F{}
class G extends E{}
class H extends E, F{}   // 다중 상속 불허용, 불가능능
class I extends A{}  	 // 확장자가 에러
class J implements A{}   

class K extends E implements A, B{} //클래스 K를 정의 하고 E를 부모로 상속 하고 A,B를 interface로 사용할 수 있다. 

class L implements A extends F{} // 앙되용 우선적으로 같은 type이 먼저 온당 ㅇ

interface M implement E{}

public class Ex01 {

}
