package operator;

public class Operator05 {
	public static void main(String[] args) {
		boolean a = 25 > 36;
		System.out.println("a = " + a); // false니까 a에는 0 들어감
		System.out.println("!a = " + !a); // false니까 a에는 0 들어감
		System.out.println();
		
		String b = "apple"; // 변수 -> 객체  문자열은 메모리에/ 주소(시작위치)는 변수에 담김. 
		                    // b에는 apple이라는 글자가 아니라 주소를 주는 것
		
		String c = "apple"; // 메모리에 문자열 잡히지 x 이미 똑같은거 있으므로
		                    // b가 가리키는 주소 똑같이 가리킴.  
		                    // ex) tv가 한 대인데 리모콘이 두 개
		
		String d = new String("apple"); // new라는 연산자를 쓰면 메모리에 계속 새로 만듦.  
		                                // String 안에 "apple" / d는 주소를 가짐.
		
		
		//주소 비교 !! 문자열 비교아님.
		System.out.println("b == c : " + (b == c ? "같다" : "다르다")); 
		//주소 비교
		System.out.println("b == d : " + (b == d ? "같다" : "다르다")); 
		System.out.println();
		
		
		//문자열 자체 비교
		System.out.println("b.equals(c) : " + (b.equals(c) ? "같다" : "다르다"));
		//문자열 자체 비교
		System.out.println("b.equals(d) : " + (b.equals(d) ? "같다" : "다르다")); 
		System.out.println();
		
		
		//문자열 자체 비교 -> 부정
		System.out.println("!b.equals(c) : " + (!b.equals(c) ? "같다" : "다르다"));
		//문자열 자체 비교 -> 부정
		System.out.println("!b.equals(d) : " + (!b.equals(d) ? "같다" : "다르다")); 
		System.out.println();
	}
}
