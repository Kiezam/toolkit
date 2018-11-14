package zeitrechner;

import java.util.Scanner;

public class zeitrechner {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int auswahl = 0;
			

		System.out.println("Zeit umrechnen\n");
		
										
		while(auswahl < 5) {
			
			System.out.println(
					  "--------------- \n"
					+ "1	Sekunden \n"
					+ "2	Minuten \n"
					+ "3	Stunden \n"
					+ "4	Tagen \n"
					+ "5	Fertig \n"	
					+ "---------------");
			System.out.println("Geben Sie nun bitte eine Nummer ein:");
			
			auswahl = scanner.nextInt();
		
		switch(auswahl)													
		{
		case 1:
			System.out.println("Sekunden: ");
			
			int sekundeneingabe = scanner.nextInt();
			berechnesekunden (sekundeneingabe);
			break;
			
		case 2:
			System.out.println("Minuten: ");
			
			int minuteneingabe = scanner.nextInt();
			berechneminuten (minuteneingabe);
			break;
			
		case 3:
			System.out.println("Stunden: ");
			
			int stundeneingabe = scanner.nextInt();
			berechnestunden (stundeneingabe);
			break;
		
		case 4:
			System.out.println("Geben Sie bitte die Tage an:");
			
			int tageeingabe = scanner.nextInt();
			berechnetage (tageeingabe);
			break;
			
		case 5:
			System.out.println("Fertig");
			break;
			
			default:
				System.out.println("Bitte wählen Sie eine der oben genannten Optionen aus");
		
				
		}
		}

}
	
	public static void berechnesekunden(int sek)
	{
		
		int minuten = sek / 60;
		int stunden = minuten / 60;
		int tage = stunden / 24;
		System.out.println(sek + " Sekunden sind: \n");
		System.out.println(minuten + " Minuten, " + stunden + " Stunden ," + tage + " Tage. \n\n");

	}
	
	public static void berechneminuten(int min)
	{
		
		int sekunden = min * 60;
		int stunden = min / 60;
		int tage = stunden / 24;
		System.out.println(min + " Minuten sind: \n");
		System.out.println(sekunden + " Sekunden, " + stunden + " Stunden, " + tage + " Tage. \n\n");

	}
	
	public static void berechnestunden(int std)
	{
		
		int tage = std / 24;
		int minuten = std * 60;
		int sekunden = minuten * 60;		
		
		System.out.println(std + " Stunden sind: \n");
		System.out.println(sekunden + " Sekunden, " + minuten + " Minuten, " + tage + " Tage. \n\n");

	}
	
	public static void berechnetage(int d)
	{
		
		int stunden = d * 24;
		int minuten = stunden * 60;
		int sekunden = minuten * 60;		
		
		System.out.println(d + " Tage sind: \n");
		System.out.println(sekunden + " Sekunden, " + minuten + " Minuten, " + stunden + " Stunden. \n\n");

	}
	
	
	
	}
