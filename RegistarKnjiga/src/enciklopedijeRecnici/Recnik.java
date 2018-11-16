package enciklopedijeRecnici;

import java.util.Scanner;

import knjiga.Knjiga;

public class Recnik extends Knjiga {

	private TipRecnika tipRecnika;

	// konstruktor

	public Recnik(String izdavac, String autor, String naslov, Integer godinaIzdanja, String povez, String formatKnjige,
			Integer brojStrana, TipRecnika tipRecnika) {
		super(izdavac, autor, naslov, godinaIzdanja, povez, formatKnjige, brojStrana);
		this.tipRecnika = tipRecnika;
	}

	// geteri i seteri

	public TipRecnika getTipRecnika() {
		return tipRecnika;
	}

	public void setTipRecnika(TipRecnika tipRecnika) {
		this.tipRecnika = tipRecnika;
	}

	// unos i informacije

	static Scanner input = new Scanner(System.in);

	public static Recnik unosRecnika() {

		Knjiga.unosKnjige();

		TipRecnika tr = null;
		System.out.println("Unesite tip recnika(jednojezicni/dvojezicni/visejezicni): ");

		boolean b = false;
		do {
			try {
				String tipRecnika = input.next().toUpperCase();
				tr = TipRecnika.valueOf(tipRecnika);
				continue;
			} catch (IllegalArgumentException e) {
				System.out.println("Pogresan unos. Ponovite.");
				b = true;
			}
		} while (b == true);

		return new Recnik(izdavac, autor, naslov, godinaIzdanja, povez, formatKnjige, brojStrana, tr);
	}

	@Override
	public void informacijeOKnjizi(int i) {
		super.informacijeOKnjizi(i);
		System.out.println("Tip recnika: " + getTipRecnika());
	}

	@Override
	public void osnovneInformacije(int i) {
		System.out.println("\n" + getTipRecnika() + " recnik: " + getNaslov());
	}
}
