package operator;

import java.util.Scanner;

public class Operator01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //키보드를 통해서 입력할 수 있는 클래스 생성
		
		System.out.print("현금 입력 : ");
		int money = scan.nextInt();
		
		System.out.println("천원 : " + (money / 1000) + "장");
		System.out.println("백원 : " + ((money%1000) / 100) + "개");
		System.out.println("십원 : " + ((money%1000%100) / 10) + "개");
		System.out.println("일원 : " + ((money%1000%100%10) / 1)  + "개");
	}
}



/*
[문제] 동전 교환
현금을 입력하여 천, 백, 십, 일의 개수를 구하시오

[실행결과]
현금 입력 : 5723
천원 : 5장
백원 : 7개
십원 : 2개
일원 : 3개
*/