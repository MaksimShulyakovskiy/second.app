package jc01_homework_lesson02_app;

public class Task_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a = 6;
		
		double S = Math.pow(a, 2) * Math.sqrt(3);
		
		double h = a * Math.sqrt(3) / 2;
		
		double R = 2 * h / 3;
		
		double r = a * Math.sqrt(3) / 4;
		
		System.out.println("Площадь равностороннего треугольника = " + S);
		System.out.println("Высота равностороннего треугольника = " + h);
		System.out.println("Радиус описанной окружности = " + R);
		System.out.println("Радиус вписанной окружности = " + r);
	}

}
