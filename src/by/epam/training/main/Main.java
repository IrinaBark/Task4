package by.epam.training.main;

import by.epam.training.entity.Time;

public class Main {
	public static void main(String[] args) {

		Time time = new Time(100, 200, 300);

		time.print();

		time.changeHours(23);
		time.print();

		time.changeHours(23);
		time.print();
		
		time.changeHours(14);
		time.print();
		
		time.changeHours(11);
		time.print();

	}
}
