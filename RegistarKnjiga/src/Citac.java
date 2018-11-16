import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import enciklopedijeRecnici.Enciklopedija;
import enciklopedijeRecnici.Recnik;
import fikcija.Fikcija;
import knjiga.Knjiga;
import ostalo.Ostalo;
import struke.Struke;

public class Citac {

	static Scanner input = new Scanner(System.in);

	static List<Knjiga> listaKnjiga = new ArrayList<Knjiga>();

	public static void unesiKnjigu() {

		System.out.println(
				"Koju vrstu knjige zelite da unesete?\nUnesite 1 za fikciju, 2 za enciklopediju, 3 za recnik, 4 za strucnu knjigu ili 5 za ostalo.\nUkoliko ne zelite da unesete knjigu, unesite 6.");

		boolean zaUnos = false;

		do {

			String izbor = input.next();

			if (izbor.equals("1")) {

				Fikcija f = Fikcija.unosFikcije();
				listaKnjiga.add(f);

			} else if (izbor.equals("2")) {

				Enciklopedija e = Enciklopedija.unosEnciklopedije();
				listaKnjiga.add(e);

			} else if (izbor.equals("3")) {

				Recnik r = Recnik.unosRecnika();
				listaKnjiga.add(r);

			} else if (izbor.equals("4")) {

				Struke s = Struke.unosStruke();
				listaKnjiga.add(s);

			} else if (izbor.equals("5")) {

				Ostalo o = Ostalo.unosOstalo();
				listaKnjiga.add(o);

			} else if (izbor.equals("6")) {

				break;

			} else {

				System.out.println("Uneli ste pogresan izbor. Ponovite.");
				zaUnos = true;
				continue;

			}

			// za novi unos

			boolean greska = false;
			do {
				System.out.println("Zelite li da unesete jos jednu knjigu? Unesite 1 za da ili 2 za ne.");
				izbor = input.next();
				if (izbor.equals("1")) {
					zaUnos = true;
				} else if (izbor.equals("2")) {
					zaUnos = false;
					break;
				} else {
					System.out.println("Uneli ste pogresan izbor. Ponovite.");
					greska = true;
				}
			} while (greska == true);

			// kraj novog unosa

		} while (zaUnos == true);

	}

}
