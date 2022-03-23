package by.epam.training.entity;

public class Time {

	private int hours;
	private int minutes;
	private int seconds;

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		if (hours > 24 || hours < 0) {
			hours = 0;
			return;
		}
		this.hours = hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		if (minutes > 60 || minutes < 0) {
			minutes = 0;
			return;
		}
		this.minutes = minutes;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		if (seconds > 60 || seconds < 0) {
			seconds = 0;
			return;
		}
		this.seconds = seconds;
	}

	public Time() {
		hours = 0;
		minutes = 0;
		seconds = 0;
	}

	public Time(int hours, int minutes, int seconds) {
		if (hours > 24 || hours < 0) {
			hours = 0;
		}
		this.hours = hours;

		if (minutes > 60 || minutes < 0) {
			minutes = 0;
		}
		this.minutes = minutes;

		if (seconds > 60 || seconds < 0) {
			seconds = 0;
		}
		this.seconds = seconds;
	}

	public void changeHours(int h) {
		
		if ((hours + h) > 24 && (hours - h) < 0) {
			throw new RuntimeException("Incorrect value of hours!");
		} else if ((hours + h) > 24) {
			hours -= h;
		} else {
			hours += h;
		}
	}

	public void changeMinutes(int m) {
		if ((minutes + m) > 60 && (minutes - m) < 0) {
			throw new RuntimeException("Incorrect value of minutes!");
		} else if ((minutes + m) > 60) {
			minutes -= m;
		} else {
			minutes += m;
		}
	}

	public void changeSeconds(int s) {
		if ((seconds + s) > 60 && (seconds - s) < 0) {
			throw new RuntimeException("Incorrect value of seconds!");
		} else if ((seconds + s) > 60) {
			seconds -= s;
		} else {
			seconds += s;
		}
	}

	public void print() {
		System.out.println("Current time: " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds.");
	}
}
