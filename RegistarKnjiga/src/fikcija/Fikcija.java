package fikcija;

import java.util.Scanner;

import knjiga.Knjiga;

public class Fikcija extends Knjiga {

	private Rod rod;
	private String vrsta;
	private String knjizevniPeriod;

	// konstruktor

	public Fikcija(String izdavac, String autor, String naslov, Integer godinaIzdanja, String povez,
			String formatKnjige, Integer brojStrana, Rod rod, String vrsta, String knjizevniPeriod) {
		super(izdavac, autor, naslov, godinaIzdanja, povez, formatKnjige, brojStrana);
		this.rod = rod;
		this.vrsta = vrsta;
		this.knjizevniPeriod = knjizevniPeriod;
	}

	// geteri i seteri

	public Rod getRod() {
		return rod;
	}

	public void setRod(Rod rod) {
		this.rod = rod;
	}

	public String getVrsta() {
		return vrsta;
	}

	public void setVrsta(String vrsta) {
		this.vrsta = vrsta;
	}

	public String getKnjizevniPeriod() {
		return knjizevniPeriod;
	}

	public void setKnjizevniPeriod(String knjizevniPeriod) {
		this.knjizevniPeriod = knjizevniPeriod;
	}

	// unos i informacije

	static Scanner input = new Scanner(System.in);
	
	

	public static Fikcija unosFikcije() {

		Knjiga.unosKnjige();

		Rod rod = null;
		System.out.println("Unesite rod (lirika/epika/drama): ");

		boolean b = false;
		do {
			try {
				String rodKnjige = input.next().toUpperCase();
				rod = Rod.valueOf(rodKnjige);
				continue;
			} catch (IllegalArgumentException e) {
				System.out.println("Pogresan unos. Ponovite.");
				b = true;
			}
		} while (b == true);

		System.out.println("Unesite vrstu: ");
		String vrsta = input.next();

		System.out.println("Unesite knjizevni period: ");
		String knjizevniPeriod = input.next();

		return new Fikcija(izdavac, autor, naslov, godinaIzdanja, povez, formatKnjige, brojStrana, rod, vrsta,
				knjizevniPeriod);
	}

	@Override
	public void informacijeOKnjizi(int i) {
		super.informacijeOKnjizi(i);
		System.out
				.println("Rod: " + getRod() + "\nVrsta: " + getVrsta() + "\nKnjizevni Period: " + getKnjizevniPeriod());
	}

	@Override
	public void osnovneInformacije(int i) {
		super.osnovneInformacije(i);
	}

}
