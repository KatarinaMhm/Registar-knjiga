package Kategorije;

import knjiga.Knjiga;

public class Enciklopedija extends Knjiga {

	private TipEnciklopedije tipEnciklopedije;

	public Enciklopedija(String izdavac, String autor, String naslov, Integer godinaIzdanja, String povez,
			String formatKnjige, Integer brojStrana, TipEnciklopedije tipEnciklopedije) {
		super(izdavac, autor, naslov, godinaIzdanja, povez, formatKnjige, brojStrana);
		this.tipEnciklopedije = tipEnciklopedije;
	}

	public TipEnciklopedije getTipEnciklopedije() {
		return tipEnciklopedije;
	}

	public void setTipEnciklopedije(TipEnciklopedije tipEnciklopedije) {
		this.tipEnciklopedije = tipEnciklopedije;
	}

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
