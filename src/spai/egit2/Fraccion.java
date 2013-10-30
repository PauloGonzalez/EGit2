package spai.egit2;

public class Fraccion {
	private int numerador;

	private int denominador;

	public Fraccion(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}

	public Fraccion() {
		this(1, 1);
	}

	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	public double decimal() {
		return (double) numerador / denominador;
	}

	public static Fraccion sumar(Fraccion fraccion1, Fraccion fraccion2) {
		Fraccion resultado = new Fraccion();
		resultado.numerador = (fraccion1.numerador * fraccion2.denominador)
				+ (fraccion1.denominador * fraccion2.numerador);
		resultado.denominador = fraccion1.denominador * fraccion2.denominador;
		return resultado;
	}

	public static Fraccion restar(Fraccion fraccion1, Fraccion fraccion2) {
		int denominadorComun = 1;
		if (fraccion1.getDenominador() == fraccion2.getDenominador()) {
			denominadorComun = fraccion1.getDenominador();
		}

		Fraccion resultado = new Fraccion();
		resultado.numerador = ((fraccion1.numerador * fraccion2.denominador) - (fraccion1.denominador * fraccion2.numerador))
				/ denominadorComun;
		resultado.denominador = (fraccion1.denominador * fraccion2.denominador)
				/ denominadorComun;
		return resultado;
	}

}
