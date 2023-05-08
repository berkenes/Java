package geometri;

public class Rechteck extends Shape {
	private double breite;
	private double laenge;

	public Rechteck(String farbe, double breite, double laenge) {
		super(farbe);
		this.breite = breite;
		this.laenge = laenge;
	}

	public double getFlaeche() {

		double flaeche = breite * laenge;
		System.out.println("Rechteck getflaeche: " + flaeche);
		return flaeche;

	}

	@Override
	public String toString() {
		return super.toString() + ", länge: " + laenge + " breite: " + breite;
	}

}
