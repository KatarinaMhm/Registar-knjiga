package ostalo;

import java.util.Scanner;

import knjiga.Knjiga;

public class Ostalo extends Knjiga {

	String tipOstalo;

	// konstruktor

	public Ostalo(String izdavac, String autor, String naslov, Integer godinaIzdanja, String povez, String formatKnjige, Integer brojStrana, String tipOstalo) {
		super(izdavac, autor, naslov, godinaIzdanja, povez, formatKnjige, brojStrana);
		this.tipOstalo = tipOstalo;
	}

	// geter i seter

	public String getTipOstalo() {
		return tipOstalo;
	}

	public void setTipOstalo(String tipOstalo) {
		this.tipOstalo = tipOstalo;
	}
	
	// unos i informacije
	
static Scanner input = new Scanner(System.in);
	
	public static Ostalo unosOstalo() {
		
		Knjiga.unosKnjige();
		
		System.out.println("Unesite tip knjige: ");
		String tipOstalo = input.next();
		
		return new Ostalo(izdavac, autor, naslov, godinaIzdanja, povez, formatKnjige, brojStrana, tipOstalo);

	}

	@Override
	public void informacijeOKnjizi(int i) {
		super.informacijeOKnjizi(i);
		System.out.println("Tip knjige: " + getTipOstalo());
	}
	
	@Override
	public void osnovneInformacije(int i) {
		super.osnovneInformacije(i);
	}

}
