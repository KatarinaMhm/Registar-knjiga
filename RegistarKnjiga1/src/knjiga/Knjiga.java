package knjiga;

import java.util.InputMismatchException;
import java.util.Scanner;

import enciklopedijeRecnici.TipRecnika;

public class Knjiga {

	protected static String izdavac;
	protected static String autor;
	protected static String naslov;
	protected static Integer godinaIzdanja;
	protected static String povez;
	protected static String formatKnjige;
	protected static Integer brojStrana;

	// konstruktor

	public Knjiga(String izdavac, String autor, String naslov, Integer godinaIzdanja, String povez, String formatKnjige,
			Integer brojStrana) {
		super();
		Knjiga.izdavac = izdavac;
		Knjiga.autor = autor;
		Knjiga.naslov = naslov;
		Knjiga.godinaIzdanja = godinaIzdanja;
		Knjiga.povez = povez;
		Knjiga.formatKnjige = formatKnjige;
		Knjiga.brojStrana = brojStrana;
	}

	// geteri i seteri

	public String getIzdavac() {
		return izdavac;
	}

	public void setIzdavac(String izdavac) {
		Knjiga.izdavac = izdavac;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		Knjiga.autor = autor;
	}

	public String getNaslov() {
		return naslov;
	}

	public void setNaslov(String naslov) {
		Knjiga.naslov = naslov;
	}

	public Integer getGodinaIzdanja() {
		return godinaIzdanja;
	}

	public void setGodinaIzdanja(Integer godinaIzdanja) {
		Knjiga.godinaIzdanja = godinaIzdanja;
	}

	public String getPovez() {
		return povez;
	}

	public void setPovez(String povez) {
		Knjiga.povez = povez;
	}

	public String getFormatKnjige() {
		return formatKnjige;
	}

	public void setFormatKnjige(String formatKnjige) {
		Knjiga.formatKnjige = formatKnjige;
	}

	public Integer getBrojStrana() {
		return brojStrana;
	}

	public void setBrojStrana(Integer brojStrana) {
		Knjiga.brojStrana = brojStrana;
	}

	// unos i informacije

	static Scanner input = new Scanner(System.in);

	public static Knjiga unosKnjige() {

		System.out.println("Unesite izdavaca: ");
		String izdavac = input.next();

		System.out.println("Unesite autora ili grupu autora: ");
		String autor = input.next();

		System.out.println("Unesite naslov: ");
		String naslov = input.next();

		System.out.println("Unesite godinu izdanja: ");
		Integer godinaIzdanja = 0;

		boolean b = false;
		do {
			try {
				godinaIzdanja = input.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Unesite broj.");
				input.next();
				b = true;
			}
		} while (b == true);

		System.out.println("Da li je meki povez? Unesite 'da' ili 'ne'. ");
		String povez = null;
		Boolean pov = null;

		boolean unos = false;
		do {
			String p = input.next();
			if (p.equalsIgnoreCase("da")) {
				pov = true;
				break;
			} else if (p.equalsIgnoreCase("ne")) {
				pov = false;
				break;
			} else {
				System.out.println("Pogresan unos. Ponovite.");
				unos = true;
			}

		} while (unos = true);

		povez = Formater.format(pov, "tvrdi povez", "meki povez");

		System.out.println("Unesite format knjige: ");
		String formatKnjige = input.next();

		System.out.println("Unesite broj strana: ");
		Integer brojStrana = 0;

		boolean c = false;
		do {
			try {
				brojStrana = input.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Unesite broj.");
				input.next();
				c = true;
			}
		} while (c == true);

		return new Knjiga(izdavac, autor, naslov, godinaIzdanja, povez, formatKnjige, brojStrana);

	}
	
	/* mozda bih ovako mogla da dodjem do konkretne stavke u listi
	 
	 public void informacijeOKnjizi(int n) {

		System.out.println("\nIzdavac: " + Citac.listaKnjiga.get(n).getIzdavac() + "\nAutor (grupa autora): "
				+ Citac.listaKnjiga.get(n).getAutor() + "\nNaslov: " + Citac.listaKnjiga.get(n).getNaslov()
				+ "\nGodina izdanja: " + Citac.listaKnjiga.get(n).getGodinaIzdanja() + "\nVrsta poveza: "
				+ Citac.listaKnjiga.get(n).getPovez() + "\nFormat: " + Citac.listaKnjiga.get(n).getFormatKnjige() + "\nBroj strana: "
				+ Citac.listaKnjiga.get(n).getBrojStrana());
	}

	public void osnovneInformacije(int n) {
		System.out.println("\nAutor (grupa autora): " + Citac.listaKnjiga.get(n).getAutor() + "\nNaslov: "
				+ Citac.listaKnjiga.get(n).getNaslov());
	}
	 
	*/

	public void informacijeOKnjizi() {
		System.out.println("\nIzdavac: " + this.getIzdavac() + "\nAutor (grupa autora): " + this.getAutor() + "\nNaslov: "
				+ this.getNaslov() + "\nGodina izdanja: " + this.getGodinaIzdanja() + "\nVrsta poveza: " + this.getPovez()
				+ "\nFormat: " + this.getFormatKnjige() + "\nBroj strana: " + this.getBrojStrana());
	}

	public void osnovneInformacije() {
		System.out.println("\nAutor (grupa autora): " + getAutor() + "\nNaslov: " + getNaslov());
	}

}
