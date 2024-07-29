package homework;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//DecimalFormat df = new DecimalFormat();		
		
		System.out.print("이름 입력 : ");
		String name = scan.next();
		
		System.out.print("직급 입력 : ");
		String pos = scan.next();
		
		System.out.print("기본급 입력 : ");
		int sal = scan.nextInt();
		
		System.out.print("수당 입력 : ");
		int pay = scan.nextInt();
		

		int sum = sal + pay;
		int tax = (int)(sum * 0.03);
		int money = sum - tax;
		
		System.out.println("*** " + name + pos + " 월급 ***");
		System.out.println("기본급 : " + new DecimalFormat().format(sal) + "원");
		//System.out.println("기본급 : " + df.format(sal) + "원");
		
		System.out.println("수당 : " + new DecimalFormat().format(pay) + "원");
		System.out.println("합계 : " + new DecimalFormat().format(sum) + "원");
		System.out.println("세금 : " + new DecimalFormat().format(tax) + "원");
		System.out.println("월급 : " + new DecimalFormat().format(money) + "원");
		
	}
}


/*
 [문제] 월급 계산 프로그램
이름, 직급, 기본급, 수당을 입력하여 합계, 세금, 월급을 출력하시오
       
합계 = 기본급 + 수당
세금 = 합계 * 세율
월급 = 합계 - 세금

[조건]
1. 세율은 3%(0.03)으로 한다.
2. 숫자는 3자리마다 , 표시
3. 소수이하는 표시하지 않는다. (정수형)  
4. Scanner 클래스 사용

[실행결과]
이름 입력 : 홍길동
직급 입력 : 부장
기본급 입력 : 4900000
수당 입력 : 200000

*** 홍길동 부장 월급 ***
기본급 : 4,900,000원
수당 : 200,000원
합계 : 5,100,000원
세금 : 153,000원
월급 : 4,947,000원
 */
