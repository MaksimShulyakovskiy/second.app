package jc01_homework_lesson02_app;

public class Task_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x1 = 3;
		double y1 = 5;
		
		double x2 = 11;
		double y2 = 9;
		
		double x3 = 13;
		double y3 = 4;
		
		double length_a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		double length_b = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		
		double length_c = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
		// Длины сторон треугольника
		
		double P = length_a + length_b + length_c;
		// Периметр треугольника
		
		double p = length_a + length_b + length_c;
		// Полупериметр треугольника
		
		double S = Math.sqrt(p * (p - length_a) * (p - length_b) * (p - length_c));
		// Формула Герона
		
		System.out.println("Периметр треугольника = " + P);
		System.out.println("Площадь треугольника = " + S);
	}

}
