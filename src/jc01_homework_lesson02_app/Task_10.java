package jc01_homework_lesson02_app;

public class Task_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x = 30;
		double y = 60;
		
		double result = (Math.sin(x) + Math.cos(y))/(Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
		System.out.println("Значение выражения = " + result );
	}

}
