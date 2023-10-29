package jc01_homework_lesson02_app;

public class Task_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double number_one = 5;
		double number_two = 7;
		
		double arithmetical_mean = (Math.pow(number_one, 3) + Math.pow(number_two, 3))/2;
		// Среднее арифметическое кубов
		
		double geometry_mean = Math.sqrt(Math.abs(number_one * number_two));
		// Среднее геометрическое модулей
		System.out.println("Среднее арифметическое кубов = " + arithmetical_mean);
		System.out.println("Среднее геометрическое модулей = " + geometry_mean);
	}

}
