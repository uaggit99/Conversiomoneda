package retoAluraMoneda;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Moneda {
	private String nombreMoneda[] = { "Dolares", "Euros", "Libra Esterlinas", "Yen Japones", "Won sul-coreano" };
	private double valorMoneda[] = { 4758.26, 5047.00, 5810.9, 35.38, 3.65 };
	public static double valorConversion;
	//String numeroformat;

	public Moneda() {

	}

	/*
	 * /public Moneda(String[] moneda, double[] valor) { this.nombreMoneda = moneda;
	 * this.valorMoneda = valor;
	 * 
	 * 
	 * }
	 */

	public String[] getNombreMoneda() {
		return nombreMoneda;
	}

	public void setNombreMoneda(String[] nombreMoneda) {
		this.nombreMoneda = nombreMoneda;
	}

	public double[] getValorMoneda() {
		return valorMoneda;
	}

	public void setValorMoneda(double[] valorMoneda) {
		this.valorMoneda = valorMoneda;
	}

	public  double conversion(int numero, double valor) {
		switch (numero) {
		case 0:
			this.valorConversion = (valor / this.valorMoneda[0]);
			break;
		case 1:
			this.valorConversion = (valor / this.valorMoneda[1]);
			break;
		case 2:
			this.valorConversion = (valor / this.valorMoneda[2]);
			break;
		case 3:
			this.valorConversion = (valor / this.valorMoneda[3]);
			break;
		case 4:
			this.valorConversion = (valor / this.valorMoneda[4]);
			break;
		case 5:
			this.valorConversion = (valor * this.valorMoneda[0]);
			break;
		case 6:
			this.valorConversion = (valor * this.valorMoneda[1]);
			break;
		case 7:
			this.valorConversion = (valor * this.valorMoneda[2]);
			break;
		case 8:
			this.valorConversion = (valor * this.valorMoneda[3]);
			break;
		case 9:
			this.valorConversion = (valor * this.valorMoneda[4]);
			break;
		default:
			System.out.println("indice desconocido");
		}
		
		//valorConversion = Math.round((valorConversion * 100.0) / 100.0);

		return this.valorConversion;
	}

	
}
