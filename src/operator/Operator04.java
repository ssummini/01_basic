package operator;

public class Operator04 {

	public static void main(String[] args) {
		int num1=0, num2=0;
		boolean result;
		
		result = ( (num1+=10) < 0 && (num2+=10) > 0 ); //앞에가 거짓이므로 뒤에 수행 x
		
		System.out.println("result = "+result); //result = false
		System.out.println("num1 = "+ num1 + " num2 = "+ num2); // num1 = 10 num2 = 0
		System.out.println();
		
		result = ( (num1+=10) > 0 || (num2+=10) > 0 ); //결과가 뻔하면 뒤에꺼 수행x
		System.out.println("result = "+result); //result = true
		System.out.println("num1 = "+ num1 + " num2 = "+ num2); //num1 = 20 num2 = 0
	}
}
