package irregularVerbsPractice;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean salir = false;
		int menu;
		
			
				

				
			while(!salir) {
				System.out.println("\nIntroduce 1 o 0 para salir");
				menu = scanner.nextInt();
				
			switch (menu) { 
			    case 1:
			    	VerbsList.sacaVerbo();
			    	break;
			    
			    case 0:
			    	salir = true;
			    	break;
			    default:
			    	System.out.println("\nIntroduce 1 o 0 solo");
			    
			    
					}
			}
	}
}
