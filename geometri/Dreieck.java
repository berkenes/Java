package geometri;

public class Dreieck extends Shape {
	double basis, hoehe;

	public Dreieck(String farbe, double basis, double hoehe) {
		super(farbe);
		this.basis = basis;
		this.hoehe = hoehe;
	}

	public double getFlaeche() {
		double dreieckflaeche = (hoehe * basis) / 2;
		System.out.println("Dreieckflaeche: " + dreieckflaeche);
		return dreieckflaeche;
	}

	public String toString() {
		return super.toString() + ", basis: " + basis + " höhe: " + hoehe;
	}

}
