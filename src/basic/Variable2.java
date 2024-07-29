package basic;

public class Variable2 {
	int a; //필드 클래스 소속, 이미 초기화 되어있음(0) =>static 아닌거 
	       // => 요구에의해 그때그때 만든거 그러므로 new 이용해서 만들어주세요 해야함. 
	
	static int b; // 필드, 이미 초기화 되어있음. => 미리 만들어놓은거 
	              // 어디 소속인지만 밝히면 바로 쓸 수 있음
	
	static String c; // 클래스 타입의 초기값은 null / String 타입만 new 안 써도 됨. 유별남.
	
	
	// c = "apple"; - error 모든 명령어들은 함수 안으로 들어가야 함.
	                     // 클래스 쪽에 쓰는 것은 선언만 됨.
	
	public static void main(String[] args) {
		int a = 100; // local variable (지역변수), 쓰레기 값 들어가기때문에 반드시 초기화 해야함.
		System.out.println(a);
		
		//int = a; -- error 이미 있기 때문 중복.
		
		System.out.println("필드 a = " + new Variable2().a); // 요청해야함
		//System.out.println("필드 b = " + b); //미리 만들어놓은 것
		System.out.println("필드 b = " + Variable2.b); //위에랑 같음
		
		//c = "apple"; // 리터럴 생성 - 얘만 이렇게 가능함.
		c = new String("apple"); // 원래 이게 맞는데 스트링 클래스만 위에처럼 가능
		System.out.println("필드 c = " + c); 
	}

}
