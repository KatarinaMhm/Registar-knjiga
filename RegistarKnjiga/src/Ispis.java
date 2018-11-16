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
				for (Knjiga knjiga : listaKnjiga) {
					knjiga.osnovneInformacije();
				}
			} else if (izbor.equals("2")) {
				for (Knjiga knjiga : listaKnjiga) {
					knjiga.informacijeOKnjizi();
				}
			} else {
				System.out.println("Pogresan unos. Ponovite.");
				info = true;
			}

		} while (info == true);

	}
}