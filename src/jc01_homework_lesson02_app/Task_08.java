package jc01_homework_lesson02_app;

public class Task_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a = 0;
		double b = 5;
		double c = 8;
		
		if (a == 0) {
			System.out.println("Неверное значение выражения");
		}
		else {
			double result = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c))/(2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
		System.out.println("Значение выражения = " + result);
	
		}
	}
}
