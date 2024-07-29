package basic;

public class Variable {

	public static void main(String[] args) {
		boolean a = 25 > 36; //(= -> 대입)
		System.out.println(a);
		System.out.println();
		
		char b = 'A';
		System.out.println(b);
		System.out.println();

		char c = 65;
		System.out.println(c);  //A *
		System.out.println();
		
		//byte d = 300; - error 
		
		int e = 65;
		System.out.println(e); //65
		System.out.println();
		
		int f = 'A';
		System.out.println(f); //65
		System.out.println();
		
		long g = 25L; //long형 상수
		System.out.println(g);
		System.out.println();
		
		//float h = 43.8; - error
		
		//첫 번째
		//float h = 43.8f; //float형 상수
		
		//두 번째 - 많이 씀
		float h = (float)43.8; //Casting(강제형변환)
		System.out.println(h);
		
	}

}
