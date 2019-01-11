
public class conversormonedas {
	
	public static double dolaresToeuros (double dinero) {
		return 1.1435*dinero;
	}
	public static double eurosTodolares (double dinero) {
		return 1.1435/ dinero;
	}
	public static void main (String [] args) {
		System.out.println("20 dolares son "+ dolaresToeuros(20) + " euros");
	}
}
