package test;

public class Asiento {
	String color;
	int precio;
	int registro;

	void cambiarColor(String color) {
		if (color.equals("rojo")) {
			this.color = color;
		}
	}
}