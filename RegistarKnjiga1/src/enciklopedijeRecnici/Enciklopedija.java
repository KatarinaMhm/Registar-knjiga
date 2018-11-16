package enciklopedijeRecnici;

import java.util.Scanner;

import knjiga.Knjiga;

public class Enciklopedija extends Knjiga {

	private TipEnciklopedije tipEnciklopedije;

	// konstruktor

	public Enciklopedija(String izdavac, String autor, String naslov, Integer godinaIzdanja, String povez,
			String formatKnjige, Integer brojStrana, TipEnciklopedije tipEnciklopedije) {
		super(izdavac, autor, naslov, godinaIzdanja, povez, formatKnjige, brojStrana);
		this.tipEnciklopedije = tipEnciklopedije;
	}

	// geteri i seteri

	public TipEnciklopedije getTipEnciklopedije() {
		return tipEnciklopedije;
	}

	public void setTipEnciklopedije(TipEnciklopedije tipEnciklopedije) {
		this.tipEnciklopedije = tipEnciklopedije;
	}

	// unos i informacije

	static Scanner input = new Scanner(System.in);

	public static Enciklopedija unosEnciklopedije() {

		Knjiga.unosKnjige();

		TipEnciklopedije te = null;
		System.out.println("Unesite tip enciklopedije (univerzalna/specijalna/nacionalna): ");
		
		boolean b = false;
		do {
			try {
				String tipEnciklopedije = input.next().toUpperCase();
				te = TipEnciklopedije.valueOf(tipEnciklopedije);
				continue;
			} catch (IllegalArgumentException e) {
				System.out.println("Pogresan unos. Ponovite.");
				b = true;
			}
		} while (b == true);

		return new Enciklopedija(izdavac, autor, naslov, godinaIzdanja, povez, formatKnjige, brojStrana, te);
	}

	/*
	  @Override
	public void informacijeOKnjizi(int i) {
		super.informacijeOKnjizi(i);
		System.out.println("Tip enciklopedije: " + getTipEnciklopedije());
	}

	@Override
	public void osnovneInformacije(int i) {
		System.out.println("\n" + getTipEnciklopedije() + " enciklopedija: " + getNaslov());
	}
	
	*/
	
	@Override
	public void informacijeOKnjizi() {
		super.informacijeOKnjizi();
		System.out.println("Tip enciklopedije: " + getTipEnciklopedije());
	}

	@Override
	public void osnovneInformacije() {
		System.out.println("\n" + getTipEnciklopedije() + " enciklopedija: " + getNaslov());
	}
}
