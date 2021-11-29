package org.generation.italy.utils;

public class CalcoliHelper {
	
	
	//costruttore private per non creare istanze
	private CalcoliHelper() {
		
	}
	
	
	
	//OVERLOAD DEI METODI
	
	
	
	//metodo somma di due numeri int/double
	public static int somma(int x, int y) {
		int somma = x + y;
		return somma;
	}
	
	public static double somma(double x, double y) {
		double somma = x + y;
		return somma;
	}
	
	
	
	//metodo differenza tra due numeri int/double
	public static int differenza(int x, int y) {
		int differenza = x - y;
		return differenza;
	}
	
	public static double differenza(double x, double y) {
		double differenza = x - y;
		return differenza;
	}
	
	
	
	//metodo moltiplicazione di due numeri int/double
	public static int moltiplicazione(int x, int y) {
		int moltiplicazione = x * y;
		return moltiplicazione;
	}
	
	public static double moltiplicazione(double x, double y) {
		double moltiplicazione = x * y;
		return moltiplicazione;
	}
	
	
	
	//metodo valore assoluto di un numero int/double
	public static int valoreAssoluto(int x) {
		int valoreAssoluto = Math.abs(x);
		return valoreAssoluto;
	}
	
	public static double valoreAssoluto(double x) {
		double valoreAssoluto = Math.abs(x);
		return valoreAssoluto;
	}
	
	
	
	//metodo minimo tra due numeri int/double
	public static int min(int x, int y) {
		int min = Math.min(x, y);
		return min;
	}
	
	public static double min(double x, double y) {
		double min = Math.min(x, y);
		return min;
	}
	
	
	
	//metodo massimo tra due numeri int/double
	public static int max(int x, int y) {
		int max = Math.max(x, y);
		return max;
	}
	
	public static double max(double x, double y) {
		double max = Math.max(x, y);
		return max;
	}
	
}
