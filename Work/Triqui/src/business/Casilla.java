package business;

public class Casilla {

	private byte posicion;
	private String simbolo;

	public Casilla(byte posicion) {
		setPosicion(posicion);
		simbolo = "";
	}

	public Casilla(byte posicion, String simbolo) {
		this.posicion = posicion;
		this.simbolo = simbolo;
	}

	public void marcar(String simbolo) {
		if (estaMarcada()) {
			throw new RuntimeException("No es posible volver a marcar. Ya existe en esta casilla el simbolo");
		}

		setSimbolo(simbolo);
	}

	private boolean cadenaEsVacioONula(String cadena) {
		return (simbolo == null || "".intern() == simbolo.trim().intern());
	}

	public boolean estaMarcada() {
		return (!cadenaEsVacioONula(simbolo));

	}

	private void setSimbolo(String simbolo) {

		if (cadenaEsVacioONula(simbolo)) {
			throw new RuntimeException("No es posible colocar un simbolo vacio o nulo");
		}

		if (simbolo.trim().length() != 1) {
			throw new RuntimeException("No es posible colocar un simbolo con longitud diferente de 1");

		}

		this.simbolo = simbolo.trim();
	}

	private void setPosicion(byte posicion) {
		if (posicion < 1 || posicion > 9) {
			throw new RuntimeException("No es posible configura una casilla en la oposicion fuera del rango");

		}
		this.posicion = posicion;
	}

	public String getSimbolo() {

		return simbolo;
	}

	public byte getPosicion() {
		return posicion;
	}

	public static void main(String[] args) {
		byte b = 1;
		Casilla casilla = new Casilla(b);

	}

	public Casilla getCasilla() {
		return new Casilla(getPosicion(), getSimbolo());
	}
	// String aString = null;

	// System.out.println("".equals(aString.trim()));
	// }
}