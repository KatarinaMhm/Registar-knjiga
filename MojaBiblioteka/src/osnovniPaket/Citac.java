package osnovniPaket;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import Kategorije.Drugo;
import Kategorije.Enciklopedija;
import Kategorije.Fikcija;
import Kategorije.FikcijaKnjizevniRod;
import Kategorije.Recnik;
import Kategorije.Strucna;
import knjiga.Knjiga;

public class Citac {

	static Scanner input = new Scanner(System.in);

	static List<Knjiga> listaKnjiga = new ArrayList<Knjiga>();

	public static void unesiKnjigu() {

		boolean zaUnos = false;

		do {

			System.out.println(
					"Koju vrstu knjige zelite da unesete?\nUnesite 1 za fikciju, 2 za enciklopediju, 3 za recnik, 4 za strucnu knjigu ili 5 za drugu vrstu knjige.\nUkoliko ne zelite da unesete knjigu, unesite 6.");

			String izbor = input.next();

			if (izbor.equals("1") || izbor.equals("2") || izbor.equals("3") || izbor.equals("4") || izbor.equals("5")) {

				System.out.println("Unesite izdavaca: ");
				String izdavac = input.next();

				System.out.println("Unesite autora ili grupu autora: ");
				String autor = input.next();

				System.out.println("Unesite naslov: ");
				String naslov = input.next();

				System.out.println("Unesite godinu izdanja: ");
				Integer godinaIzdanja = 0;

				boolean zaGodinuIzdanja = false;
				do {
					try {
						godinaIzdanja = input.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("Unesite broj.");
						input.next();
						zaGodinuIzdanja = true;
					}
				} while (zaGodinuIzdanja == true);

				System.out.println("Da li je meki povez? Unesite 'da' ili 'ne'. ");
				String povez = null;
				Boolean pov = null;

				boolean unos = false;
				do {
					String zaPovez = input.next();
					if (zaPovez.equalsIgnoreCase("da")) {
						pov = true;
						break;
					} else if (zaPovez.equalsIgnoreCase("ne")) {
						pov = false;
						break;
					} else {
						System.out.println("Pogresan unos. Ponovite.");
						unos = true;
					}

				} while (unos = true);

				povez = alati.Formater.format(pov, "tvrdi povez", "meki povez");

				System.out.println("Unesite format knjige: ");
				String formatKnjige = input.next();

				System.out.println("Unesite broj strana: ");
				Integer brojStrana = 0;

				boolean zaBrojStrana = false;
				do {
					try {
						brojStrana = input.nextInt();
						break;
					} catch (InputMismatchException e) {
						System.out.println("Unesite broj.");
						input.next();
						zaBrojStrana = true;
					}
				} while (zaBrojStrana == true);

				if (izbor.equals("1")) {

					FikcijaKnjizevniRod knjizevniRod = null;
					System.out.println("Unesite rod (lirika/epika/drama): ");

					boolean zaRodKnjige = false;
					do {
						try {
							String rodKnjige = input.next().toUpperCase();
							knjizevniRod = FikcijaKnjizevniRod.valueOf(rodKnjige);
							continue;
						} catch (IllegalArgumentException e) {
							System.out.println("Pogresan unos. Ponovite.");
							zaRodKnjige = true;
						}
					} while (zaRodKnjige == true);

					listaKnjiga.add(new Fikcija(izdavac, autor, naslov, godinaIzdanja, povez, formatKnjige, brojStrana, knjizevniRod));

				} else if (izbor.equals("2")) {

					Kategorije.TipEnciklopedije te = null;
					System.out.println("Unesite tip enciklopedije (univerzalna/specijalna/nacionalna): ");

					boolean zaEnciklopediju = false;
					do {
						try {
							String tipEnciklopedije = input.next().toUpperCase();
							te = Kategorije.TipEnciklopedije.valueOf(tipEnciklopedije);
							continue;
						} catch (IllegalArgumentException e) {
							System.out.println("Pogresan unos. Ponovite.");
							zaEnciklopediju = true;
						}
					} while (zaEnciklopediju == true);

					listaKnjiga.add(new Enciklopedija(izdavac, autor, naslov, brojStrana, formatKnjige, formatKnjige, brojStrana, te));

				} else if (izbor.equals("3")) {

					Kategorije.TipRecnika tr = null;
					System.out.println("Unesite tip recnika(jednojezicni/dvojezicni/visejezicni): ");

					boolean zaRecnik = false;
					do {
						try {
							String tipRecnika = input.next().toUpperCase();
							tr = Kategorije.TipRecnika.valueOf(tipRecnika);
							continue;
						} catch (IllegalArgumentException e) {
							System.out.println("Pogresan unos. Ponovite.");
							zaRecnik = true;
						}
					} while (zaRecnik == true);

					listaKnjiga.add(new Recnik(izdavac, autor, naslov, brojStrana, formatKnjige, formatKnjige, brojStrana, tr));

				} else if (izbor.equals("4")) {

					System.out.println("Unesite strucnu oblast: ");
					String strucnaOblast = input.next();

					listaKnjiga.add(new Strucna(izdavac, autor, naslov, brojStrana, strucnaOblast, strucnaOblast, brojStrana, strucnaOblast));

				} else if (izbor.equals("5")) {

					System.out.println("Unesite drugi tip knjige: ");
					String vrstaDrugeKnjige = input.next();

					listaKnjiga.add(new Drugo(izdavac, autor, naslov, brojStrana, vrstaDrugeKnjige, vrstaDrugeKnjige, brojStrana, vrstaDrugeKnjige));

				}

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
