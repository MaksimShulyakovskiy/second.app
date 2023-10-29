package jc01_homework_lesson02_app;

public class Task_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a = 0;
		double b = 5;
		double c = 3;
		double d = -1;
		
		if (c == 0) {
			System.out.println("Неверное значение выражения");
		}
		
		else if (d == 0) {
			System.out.println("Неверное значение выражения");			
		}
		
		else {
			double result = (a / c) *( b / d) - (a * b - c)/(c * d);
		System.out.println("Значение выражения = " + result);		
		}
	}
}
