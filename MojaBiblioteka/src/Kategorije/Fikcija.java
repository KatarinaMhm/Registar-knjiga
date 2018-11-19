package Kategorije;

import java.util.Scanner;

import knjiga.Knjiga;

public class Fikcija extends Knjiga {

	private FikcijaKnjizevniRod knjizevniRod;

	public Fikcija(String izdavac, String autor, String naslov, Integer godinaIzdanja, String povez,
			String formatKnjige, Integer brojStrana, FikcijaKnjizevniRod knjizevniRod) {
		super(izdavac, autor, naslov, godinaIzdanja, povez, formatKnjige, brojStrana);
		this.knjizevniRod = knjizevniRod;
	}

	public FikcijaKnjizevniRod getKnjizevniRod() {
		return knjizevniRod;
	}

	public void setKnjizevniRod(FikcijaKnjizevniRod knjizevniRod) {
		this.knjizevniRod = knjizevniRod;
	}

	@Override
	public void informacijeOKnjizi() {
		super.informacijeOKnjizi();
		System.out.println("Knjizevni rod: " + getKnjizevniRod());
	}

	@Override
	public void osnovneInformacije() {
		super.osnovneInformacije();
	}
}
