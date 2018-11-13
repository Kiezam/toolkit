package zeitrechner;
import java.util.Scanner;

public class methoden {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String name = "Isa"
		String name ="sieht scheisse aus"

		System.out.println("Willkommen in meiner Umrechnungsanwendung.\n");
		System.out.println("Leider ist die Anwendung noch im Aufbau, deswegen geben Sie bitte per Zahl ihre gewünschte Umrechnungsart an. \n");
		System.out.println("Folgend sehen Sie die Zahlen für die einzelnen Umrechnungen");
		System.out.println("Mit der 0 rechnen Sie mit Sekunden \nMit der 1 rechnen Sie mit Minuten \nMit der 2 rechnen Sie mit Stunden \nMit der 3 rechen Sie mit Tagen");
		System.out.println("Geben Sie nun bitte eine Nummer ein:");
		
		int auswahl = scanner.nextInt();
										
		
		switch(auswahl)													
		{
		case 0: 
			System.out.println("Sie haben sich für Sekunden entschieden. \n Möchten Sie Sekunden umrechnen, oder Minuten/Stunden/Tage in Sekunden rechnen? \n Geben Sei dafür bite die 0 für ersteres und 1 für zweiteres ein:");
			int auswahlsekunden = scanner.nextInt();
			switch(auswahlsekunden) {
			case 0:
				System.out.println("Geben Sie bitte eine Sekundenzahl an:");
				
				int sekundeneingabe = scanner.nextInt();
				berechneSekunden (sekundeneingabe);
				break;										// bei Eingabe 0 kann erneut 0 oder 1 eingegeben werden
			case 1:											// bei eingabe 1 ist danach schluss
				System.out.println("Geben Sie zuerst die Tage ein:");
				int tageeingabe = scanner.nextInt();
				System.out.println("Geben Sie nun die Stunden ein:");
				int stundeneingabe = scanner.nextInt();
				System.out.println("Geben Sie zuletzt die Minuten ein:");
				int minuteneingabe = scanner.nextInt();
				
				berechnefunktionsekunden (tageeingabe,stundeneingabe,minuteneingabe);
				break;
				
			}
			break;
		case 1:
			System.out.println("Sie haben sich für Minuten entschieden. \n Möchten Sie Minuten umrechnen, oder Sekunden/Stunden/Tage in Minuten rechnen? \n Geben Sei dafür biite die 0 für ersteres und 1 für zweiteres ein:");
			int auswahlminuten = scanner.nextInt();
			switch(auswahlminuten) {
			case 0:
				System.out.println("Geben Sie bitte eine Minutenzahl an:");
				
				int minuteneingabe = scanner.nextInt();
				berechneminuten (minuteneingabe);
				break;
			case 1:
				System.out.println("Geben Sie zuerst die Tage ein:");
				int tageeingabe = scanner.nextInt();
				System.out.println("Geben Sie nun die Stunden ein:");
				int stundeneingabe = scanner.nextInt();
				System.out.println("Geben Sie zuletzt die Sekunden ein:");
				int sekundeneingabe = scanner.nextInt();
				
				berechnefunktionminuten (tageeingabe,stundeneingabe,sekundeneingabe);
				break;
			}
			break;
		case 2:
			System.out.println("Sie haben sich für Stunden entschieden. \n Möchten Sie Stunden umrechnen, oder Sekunden/Minuten/Tage in Stunden rechnen? \n Geben Sei dafür biite die 0 für ersteres und 1 für zweiteres ein:");
			int auswahlstunden = scanner.nextInt();
			switch(auswahlstunden) {
			case 0:
				System.out.println("Geben Sie bitte eine Stundenenzahl an:");
				
				int stundeneingabe = scanner.nextInt();
				berechnestunden (stundeneingabe);
				break;
			case 1:
				System.out.println("Geben Sie zuerst die Tage ein:");			// das ganze in eine Funktion packen
				int tageeingabe = scanner.nextInt();
				System.out.println("Geben Sie nun die Minuten ein:");
				int minuteneingabe = scanner.nextInt();
				System.out.println("Geben Sie zuletzt die Sekunden ein:");
				int sekundeneingabe = scanner.nextInt();
				
				berechnefunktionstunden (tageeingabe,minuteneingabe,sekundeneingabe);
				break;
			}
			break;
		case 3:
			System.out.println("Sie haben sich für Tage entschieden. \n Möchten Sie Tage umrechnen, oder Sekunden/Minuten/Stunden in Tage rechnen? \n Geben Sei dafür biite die 0 für ersteres und 1 für zweiteres ein:");
			int auswahltage = scanner.nextInt();
			
			switch(auswahltage) {
			case 0:
				System.out.println("Geben Sie bitte die Tage an:");
				
				int tageeingabe = scanner.nextInt();
				berechnetage (tageeingabe);
				break;
			case 1:
				System.out.println("Geben Sie zuerst die Stunden ein:");
				int stundeneingabe = scanner.nextInt();
				System.out.println("Geben Sie nun die Minuten ein:");
				int minuteneingabe = scanner.nextInt();
				System.out.println("Geben Sie zuletzt die Sekunden ein:");
				int sekundeneingabe = scanner.nextInt();
				
				berechnefunktiontage (stundeneingabe,minuteneingabe,sekundeneingabe);
				break;
			}
			break;
		
		default:
				System.out.println("Bitte eine andere Zahl eingeben.");
			
		}
			
			
		
		
	}
	/*
	 * 
	 * 
	 * 						sehr unübersichtlich
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
		

	public static void berechneSekunden(int x)
	{
		
		int minuten = x / 60;
		int stunden = minuten / 60;
		int tage = stunden / 24;
		System.out.println(x + " Sekunden sind: \n");
		System.out.println(minuten + " Minuten " + stunden + " Stunden" + " und " + tage + " Tage.");

	}
	
	public static int berechnefunktionsekunden (int d, int h, int m)
	{
		int ergebnis = d * 24 * 60 * 60;
		ergebnis = ergebnis + h * 60 * 60;
		ergebnis = ergebnis + m * 60;
		System.out.println(ergebnis);
		return ergebnis;
		
	}
	public static void berechneminuten(int min)
	{
		
		int sekunden = min * 60;
		int stunden = min / 60;
		int tage = stunden / 24;
		System.out.println(min + " Minuten sind: \n");
		System.out.println(sekunden + " Sekunden " + stunden + " Stunden" + " und " + tage + " Tage.");

	}
	
	public static int berechnefunktionminuten (int d, int h, int s)
	{
		int ergebnis = d * 24 * 60;
		ergebnis = ergebnis + h * 60;
		ergebnis = ergebnis + s / 60;
		System.out.println(ergebnis);
		return ergebnis;
	}
	public static void berechnestunden(int std)
	{
		
		int tage = std / 24;
		int minuten = std * 60;
		int sekunden = minuten * 60;		
		
		System.out.println(std + " Stunden sind: \n");
		System.out.println(sekunden + " Sekunden " + minuten + " Minuten" + " und " + tage + " Tage.");

	}
	
	public static int berechnefunktionstunden (int d, int m, int s)
	{
		int ergebnis = d * 24;
		ergebnis = ergebnis + m / 60;
		ergebnis = ergebnis + s / 60 / 60;
		System.out.println(ergebnis);
		return ergebnis;
	}
	public static void berechnetage(int d)
	{
		
		int stunden = d * 24;
		int minuten = stunden * 60;
		int sekunden = minuten * 60;		
		
		System.out.println(d + " Tage sind: \n");
		System.out.println(sekunden + " Sekunden " + minuten + " Minuten" + " und " + stunden + " Stunden.");

	}
	
	public static int berechnefunktiontage (int h, int m, int s)
	{
		int ergebnis = h / 24;
		ergebnis = ergebnis + m / 60 / 24;
		ergebnis = ergebnis + s / 60 / 60 / 24;
		System.out.println(ergebnis);
		return ergebnis;
	}
}
