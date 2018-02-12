package com.akirix.newHire.quickSort.comparables;

public class Planet<T> implements Comparable<Planet<T>> {
	
	private final System<T> system;

	public Planet(System<T> system) {
		this.system = system;
	}

	public int compareTo(Planet<T> that) {
		return that.getSystem().getPos() - this.getSystem().getPos();
	}
	
	public System<T> getSystem() {
		return system;
	}
	
	public interface System<T> {
		public int getPos();
	}
	
	public String toString() {
		return this.getSystem().toString();
	}

	public enum SolarSystem implements System<SolarSystem> {
		MERCURY(0), VENUS(1), EARTH(2), MARS(3), JUPITER(4), SATURN(5), URANUS(6), NEPTUNE(7);
		private final int pos;
		SolarSystem(int pos) {
			this.pos = pos;
		}
		public int getPos() {
			return pos;
		}
		public String toString() {
			return this.name();
		}
	}
}
