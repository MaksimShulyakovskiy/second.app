package jc01_homework_lesson02_app;

public class Task_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a = 3;
		double b = 4;
		
		if (a == 0) {
			System.out.println("Неверное значение длины катета \"a\"");
		}
		
		else if (b == 0) {
			System.out.println("Неверное значение длины катета \"a\"");
		}
		
		else {
		double P = a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		double S = a * b / 2;
		
		System.out.println("Периметр прямоугоьного треугольника = " + P);
		
		System.out.println("Площадь прямоугольного треугольника = " + S);
		}
	}
}
