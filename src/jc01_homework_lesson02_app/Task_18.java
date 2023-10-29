package jc01_homework_lesson02_app;

public class Task_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a = 6;
		
		double S_edge = Math.pow(a, 2);
		// Площадь грани
		
		double S_surface = 6 * S_edge;
		// Площадь полной поверхности
		
		double V = Math.pow(a, 3);
		//Объем куба
		
		System.out.println("Площадь грани куба = " + S_edge);
		System.out.println("Площадь полной поверхности куба = " + S_surface);
		System.out.println("Объем куба = " + V);
	}

}
