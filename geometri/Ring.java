package geometri;

public class Ring extends Kreis {
	double innenradius;

	public Ring(String farbe, double radius, double innenradius) {
		super(farbe, radius);
		this.innenradius = innenradius;
	}

	public double getFlaeche() {
		return super.getFlaeche() - innenradius * innenradius * Math.PI;
	}

	@Override
	public String toString() {
		return super.toString() + "Ring innenradius=" + innenradius;
	}

}
