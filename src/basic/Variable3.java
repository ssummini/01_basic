package basic;

import java.util.Random;

public class Variable3 {

	public static void main(String[] args) {
		int big = Math.max(25, 36);
		System.out.println("큰값 = " + big); //큰값 = 36
		
		//12.7, 78.5 중에서 작은 값을 구하시오
		double small = Math.min(12.7, 78.5);
		System.out.println("작은값 = " + small); //작은값 = 12.7
		
		//2의 5승
		double power = Math.pow(2, 5);
		System.out.println("2의 5승 = " + power); //2의 5승 = 32.0
		
		//난수
		//컴퓨터가 불규칙하게  발생하는 수
		// 0<= 난수 < 1
		double a = Math.random();
		System.out.println(a); //Variable3.java
		
		//a에서 소수 2째자리까지만 출력하시오.
		int c = (int)(a * 100); // 0 ~ 99 ★★★★★
		System.out.println(c); //39
		
		
		// x~y사이의 난수 발생 (int)(Math.random() * (y-x+1) + x)
		//65 ~ 90 사이의 난수
		int d = (int)(Math.random() * 26 + 65);
		System.out.println(d); //75
		
		char e = (char)(Math.random() * 26 + 65);
		System.out.println(e); //P
		

		double b = new Random().nextDouble(); //★★★★★ Random클래스는 static 아님. -> new
		System.out.println(b); //0.3157687918819152

	}

}
