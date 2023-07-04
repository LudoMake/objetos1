/**
 * 
 */
package clases;

/**
 * @author IFCD0111ADRI
 *
 */
public class Cuentabancaria {

	// variable miembro o de estancia
	private long numCuenta;
	private long dni;
	private double saldo;
	private double interes;

	public static final double INTERESNORMAL = 0.05;

	// variable de clase
	private static long generadorCuenta = 100001;

	public Cuentabancaria() {
		this.numCuenta = Cuentabancaria.generadorCuenta;
		Cuentabancaria.generadorCuenta++;
		this.dni = 0;
		this.saldo = 0;
		this.interes = INTERESNORMAL;
	}

	public Cuentabancaria(long dni, double saldo, double interes) {
		this.numCuenta = Cuentabancaria.generadorCuenta;
		Cuentabancaria.generadorCuenta++;
		this.dni = dni;
		this.saldo = saldo;
		this.interes = interes;
	}

	// Getter y setter
	public long getNumCuenta() {
		return this.numCuenta;
	}

	public long getDni() {
		return this.dni; // getter
	}

	public void setDni(long dni) {
		this.dni = dni; // setter
	}

	public double getInteres() {
		return this.interes;
	}

	public double getSaldo() {
		return this.saldo;
	}

	/**
	 * metodo de la clase que actualiza el saldo de la cuenta añadiendo los
	 * intereses diarios
	 */
	public void actualizarSaldo() {
		this.saldo = this.saldo + this.saldo * this.interes / 365;
	}

	public boolean ingresar(double cantidad) {
		if (cantidad > 0) {// para que no se pueda hacer un ingreso negativo
			this.saldo = this.saldo + cantidad;
			return true;
		}
		return false;
	}

	/*
	 * cambiar void por boolean aplicar para ingresar tambien
	 */
	public boolean retirar(double cantidad) {
		if (this.saldo >= cantidad) {
			this.saldo = this.saldo - cantidad;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Cuentabancaria [numCuenta=" + numCuenta + ", dni=" + dni + ", saldo=" + saldo + ", interes=" + interes
				+ "]";
	} // para mostrar los datos bien en un string(asi no sale la referencia del dato
		// sino el dato)

	public void setInteres(double interes) {
		this.interes = interes;
	}
}
