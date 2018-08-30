package Operacion;

public class Operacion {

	public Operacion() {
		
	}
	
	public  int suma(int a, int b) {
		return a + b;
	}

	public  int dividir(int a, int b) {
		return a / b;
	}	

	public void metodoDuracionExcesiva() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
}
