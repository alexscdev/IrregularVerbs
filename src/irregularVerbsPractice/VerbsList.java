package irregularVerbsPractice;


import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

public class VerbsList {
	
	private static Map<Integer, String> infinitivo = new TreeMap<Integer, String>();
	private static Map<Integer, String> pasadoSimple = new TreeMap<Integer, String>();
	private static Map<Integer, String> participioPasado = new TreeMap<Integer, String>();
	private static Map<Integer, String> español = new TreeMap<Integer, String>();
	
	private static Random r = new Random();
	private static Scanner scanner = new Scanner(System.in);
	
	
	private static void meteVerbos() {
		infinitivo.put(0,"arise");
		infinitivo.put(1,"awake");
		infinitivo.put(2,"be/am,are,is");
		infinitivo.put(3,"bear");
		infinitivo.put(4,"beat");
		infinitivo.put(5,"become");
		infinitivo.put(6,"begin");
		infinitivo.put(7,"bend");
		infinitivo.put(8,"bet");
		infinitivo.put(9,"bind");
		
		pasadoSimple.put(0,"arose");
		pasadoSimple.put(1,"awoke");
		pasadoSimple.put(2,"was/were");
		pasadoSimple.put(3,"bore");
		pasadoSimple.put(4,"beat");
		pasadoSimple.put(5,"became");
		pasadoSimple.put(6,"began");
		pasadoSimple.put(7,"bent");
		pasadoSimple.put(8,"bet");
		pasadoSimple.put(9,"bound");
		
		
		participioPasado.put(0,"arisen");
		participioPasado.put(1,"awoken");
		participioPasado.put(2,"been");
		participioPasado.put(3,"borne/born");
		participioPasado.put(4,"beaten");
		participioPasado.put(5,"become");
		participioPasado.put(6,"begun");
		participioPasado.put(7,"bent");
		participioPasado.put(8,"bet");
		participioPasado.put(9,"bound");
		
		español.put(0,"surgir/levantarse");
		español.put(1,"despertarse");
		español.put(2,"ser/estar");
		español.put(3,"soportar/dar a luz");
		español.put(4,"golpear");
		español.put(5,"llegar a ser");
		español.put(6,"empezar");
		español.put(7,"doblar");
		español.put(8,"apostar");
		español.put(9,"atar/encuadernar");
		
	}
	
	public static void sacaVerbo() {
		int tiempo = elijeTiempo();
		int verbo= elijeVerbo();
		
		if(tiempo==0) {
			System.out.printf("Infinitivo: %s",infinitivo.get(verbo));
			
		}
		if(tiempo==1) {
			System.out.printf("Pasado Simple: %s",pasadoSimple.get(verbo));
			
	}
		
		if(tiempo==2) {
			System.out.printf("Participio Pasado: %s",participioPasado.get(verbo));
			
		}
		
		if(tiempo==3) {
			System.out.printf("Español: %s",español.get(verbo));
			

		}
		
		pideVerbos(elijeTiempo(),verbo, tiempo);
	}
	
	public static void pideVerbos(int tiempo,int verbo, int tiempoDado) {
		
		
		if(tiempo==0 && tiempo!=tiempoDado) {
			System.out.println("\nDame el infinitivo del verbo anterior");
			String texto = scanner.nextLine();
			String salida = infinitivo.get(verbo).equalsIgnoreCase(texto)? "true": "Error: " +infinitivo.get(verbo);
			System.out.println(salida);
		}	
		
		if(tiempo==1  && tiempo!=tiempoDado) {
			System.out.println("\nDame el Pasado Simple del verbo anterior");
			String texto2 = scanner.nextLine();
			String salida = pasadoSimple.get(verbo).equalsIgnoreCase(texto2)? "true": "Error: " +pasadoSimple.get(verbo);
			System.out.println(salida);
		}
		
		if(tiempo==2 && tiempo!=tiempoDado) {
			System.out.println("\nDame el Participio Pasado del verbo anterior");
			String texto3 = scanner.nextLine();
			String salida = participioPasado.get(verbo).equalsIgnoreCase(texto3)? "true": "Error: " +participioPasado.get(verbo);
			System.out.println(salida);
		}
		
		if(tiempo==3 && tiempo!=tiempoDado) {
			System.out.println("\nDame el Español del verbo anterior");
			String texto4 = scanner.nextLine();
			String salida = español.get(verbo).equalsIgnoreCase(texto4)? "true": "Error: " +español.get(verbo);
			System.out.println(salida);
		}
		
	}
	
	
	
	private static int elijeVerbo() {
		meteVerbos();
		return r.nextInt(infinitivo.size()-1);
	}
	
	private static int elijeTiempo() {
		return r.nextInt(4);
	}

}
