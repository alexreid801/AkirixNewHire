package com.akirix.newHire.quickSort.comparables;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HoursAndMinutes implements Comparable<HoursAndMinutes> {

	private int hours;
	private int minutes;
	
	public HoursAndMinutes(String rep) {
		Pattern p = Pattern.compile("(\\d{2}):(\\d{2})");
		Matcher m = p.matcher(rep);
		if (m.matches() ) {
			setHours(Integer.parseInt(m.group(1))); 
			setMinutes(Integer.parseInt(m.group(2)));
		}
		else throw new IllegalArgumentException("String representation must be in the format: HH:MM");
	}

	public int compareTo(HoursAndMinutes that) {
		if(this.getHours() < that.getHours()) return -1;
		if(this.getHours() > that.getHours()) return 1;
		if(this.getMinutes() < that.getMinutes()) return -1;
		if(this.getMinutes() > that.getMinutes()) return 1;
		return 0;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		if(hours >= 0 && hours <= 12) {
			this.hours = hours;
		} else throw new IllegalArgumentException("Hours value must be a number 0 through 12");
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		if(minutes >= 0 && minutes <= 59) {
			this.minutes = minutes;
		} else throw new IllegalArgumentException("Minutes value must be a number 0 through 59");
	}
	
	public String toString() {
		return Integer.toString(this.getHours()) + ":" + Integer.toString(this.getMinutes());
	}
}
