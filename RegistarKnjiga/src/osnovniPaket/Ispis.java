package osnovniPaket;
import java.util.Scanner;

import knjiga.Knjiga;

public class Ispis extends Citac {

	public static void ispisKnjiga() {

		Scanner input = new Scanner(System.in);
		System.out
				.println("Unesite 1 ako zelite osnovne informacije o knjigama ili 2 ako zelite kompletne informacije.");

		boolean info = false;
		do {
			String izbor = input.next();

			
			if (izbor.equals("1")) {
				for (int i = 0; i < listaKnjiga.size(); i++) {
					listaKnjiga.get(i).osnovneInformacije(i);
				}
			} else if (izbor.equals("2")) {
				for (int i = 0; i < listaKnjiga.size(); i++) {
					listaKnjiga.get(i).informacijeOKnjizi(i);
				}
			} else {
				System.out.println("Pogresan unos. Ponovite.");
				info = true;
			}

		} while (info == true);

	}
}