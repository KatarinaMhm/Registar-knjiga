package Kategorije;

import knjiga.Knjiga;

public class Recnik extends Knjiga {

	private TipRecnika tipRecnika;

	public Recnik(String izdavac, String autor, String naslov, Integer godinaIzdanja, String povez, String formatKnjige,
			Integer brojStrana, TipRecnika tipRecnika) {
		super(izdavac, autor, naslov, godinaIzdanja, povez, formatKnjige, brojStrana);
		this.tipRecnika = tipRecnika;
	}

	public TipRecnika getTipRecnika() {
		return tipRecnika;
	}

	public void setTipRecnika(TipRecnika tipRecnika) {
		this.tipRecnika = tipRecnika;
	}

	@Override
	public void informacijeOKnjizi() {
		super.informacijeOKnjizi();
		System.out.println("Tip recnika: " + getTipRecnika());
	}

	@Override
	public void osnovneInformacije() {
		System.out.println("\n" + getTipRecnika() + " " + getNaslov() + " izdavaca " + getIzdavac());
	}
}
