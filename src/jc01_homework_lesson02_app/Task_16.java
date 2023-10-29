package jc01_homework_lesson02_app;

public class Task_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 7463;
		
		int a = number/1000;
		int b = number%1000/100;
		int c = number%100/10;
		int d = number%10;
		
		int result = a + b + c + d;
		System.out.println("Сумма цифр = " + result);
	}

}
