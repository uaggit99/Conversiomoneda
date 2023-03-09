package retoAluraMoneda;

public class Temperatura {
	private String nombreGrados[] = { "Celsius","Kelvin", "Fahrenheit"};
	double conversionGrados;

	public Temperatura() {

	}
	

	/*public Temperatura(String[] nombreGrados, double conversionGrados) {
		super();
		this.nombreGrados = nombreGrados;
		this.conversionGrados = conversionGrados;
	}*/


	public String[] getNombreGrados() {
		return nombreGrados;
	}

	public void setNombreGrados(String[] nombreGrados) {
		this.nombreGrados = nombreGrados;
	}

	public double conversionGrados(int num, double ingreso) {
		switch (num) {
		case 0:
			conversionGrados= (ingreso*1.8)+32; //Fahrenheit

			break;
		case 1:
			conversionGrados= ingreso+274.15;//kevin

			break;
		case 2:
			conversionGrados= (ingreso*1.8)-457.87;	//Fahrenheit		

			break;
		case 3:
			conversionGrados= ingreso-273.15;//celsius			

			break;
		case 4:
			conversionGrados=(ingreso-32)*0.55; //celsius

			break;
		case 5:
			conversionGrados=(ingreso+459.67)*0.55; //kevin

			break;
		default:
			System.out.println("indice desconocido");
		}

		return conversionGrados;

	}

}
