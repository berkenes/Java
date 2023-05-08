package geometri;

public abstract class Shape {
	private String farbe;

	public Shape(String farbe) {

		this.farbe = farbe;
	}

	public String getFarbe() {
		return farbe;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " " + farbe;
	}

	public abstract double getFlaeche();

}
