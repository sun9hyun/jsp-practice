package task;

public class Calc {
	
	int add(int num1,int num2) { //더하기
		int result = num1 + num2;
		return result;
	}
	
	int subtract(int num1,int num2) { //빼기
		int result = num1 - num2;
		return result;
	}
	
	int multuply(int num1,int num2) { //곱하기
		int result = num1 * num2;
		return result;
	}
	
	int devide(int num1,int num2) {//나누기
		try {
			num2 = 0;
		} catch (Exception e) {
			System.out.println("다시 입력해 주세요");
		}
		int result = num1 / num2;
		return result;
	}
}
