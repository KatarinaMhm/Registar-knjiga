package struke;

import java.util.Scanner;

import knjiga.Knjiga;

public class Struke extends Knjiga {

	private String strucnaOblast;

	// konstruktor
	
	public Struke(String izdavac, String autor, String naslov, Integer godinaIzdanja, String povez, String formatKnjige, Integer brojStrana, String strucnaOblast) {
		super(izdavac, autor, naslov, godinaIzdanja, povez, formatKnjige, brojStrana);
		this.strucnaOblast = strucnaOblast;
	}

	// geteri i seteri

	public String getStrucnaOblast() {
		return strucnaOblast;
	}

	public void setStrucnaOblast(String strucnaOblast) {
		this.strucnaOblast = strucnaOblast;
	}

	// unos i informacije
	
	static Scanner input = new Scanner(System.in);
	
	public static Struke unosStruke() {
		
		Knjiga.unosKnjige();
		
		System.out.println("Unesite strucnu oblast: ");
		String strucnaOblast = input.next();
		
		return new Struke(izdavac, autor, naslov, godinaIzdanja, povez, formatKnjige, brojStrana, strucnaOblast);

	}

	@Override
	public void informacijeOKnjizi() {
		super.informacijeOKnjizi();
		System.out.println("Strucna oblast: " + getStrucnaOblast());
	}
	
	@Override
	public void osnovneInformacije() {
		super.osnovneInformacije();
	}
}
