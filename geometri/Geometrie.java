package geometri;

public class Geometrie {
	public static void main(String[] args) {

		Shape[] shapes = new Shape[5];
		// shapes [3] = new Shape ("orange");
		shapes[0] = new Kreis("blau", 10);
		shapes[1] = new Ring("lila", 10, 3);
		shapes[2] = new Ring("grün", 10, 5);
		shapes[3] = new Dreieck("gelb", 10, 10);
		for (int i = 0; i < shapes.length; i++) {
			System.out.println(shapes[i]);
		}

//		Shape farbe1 = new Shape("orange");
//		farbe1.getFarbe();
//		System.out.println(farbe1.toString());
//
//		Kreis k1 = new Kreis("blau", 10);
//		System.out.printf(Locale.UK,"Flaeche: %.2f\n", k1.getFlaeche());
//
//		Rechteck r1 = new Rechteck("grün", 10, 5);
//		System.out.println(r1);
//		r1.getFlaeche();
//
//		Dreieck d1 = new Dreieck("gelb", 10, 10);
//		System.out.println(d1);
//		d1.getFlaeche();
//
//		Ring y1 = new Ring("lila", 10, 3);
//		System.out.println(y1);
//		y1.getFlaeche();

	}

	public static void zeigeFlaeche(Shape s) {
		System.out.printf("Fläche: %.2f\n", s.getFlaeche());
	}

}
