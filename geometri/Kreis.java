package geometri;

public class Kreis extends Shape {

	private double radius;

	public Kreis(String farbe, double radius) {
		super(farbe);
		this.radius = radius;
	}

	public double getFlaeche() {

		System.out.println("Kreis flaeche: " + Math.pow(radius, 2) * Math.PI);
		return Math.PI * radius * radius;

	}

	@Override
	public String toString() {
		return super.toString() + " , Radius: " + radius;
	}

}
