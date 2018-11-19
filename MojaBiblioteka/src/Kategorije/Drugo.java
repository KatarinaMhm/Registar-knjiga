package Kategorije;

import knjiga.Knjiga;

public class Drugo extends Knjiga {

	private String vrstaDrugeKnjige;

	public Drugo(String izdavac, String autor, String naslov, Integer godinaIzdanja, String povez, String formatKnjige,
			Integer brojStrana, String vrstaDrugeKnjige) {
		super(izdavac, autor, naslov, godinaIzdanja, povez, formatKnjige, brojStrana);
		this.vrstaDrugeKnjige = vrstaDrugeKnjige;
	}

	public String getVrstaDrugeKnjige() {
		return vrstaDrugeKnjige;
	}

	public void setVrstaDrugeKnjige(String vrstaDrugeKnjige) {
		this.vrstaDrugeKnjige = vrstaDrugeKnjige;
	}

	@Override
	public void informacijeOKnjizi() {
		super.informacijeOKnjizi();
		System.out.println("Tip knjige: " + getVrstaDrugeKnjige());
	}

	@Override
	public void osnovneInformacije() {
		super.osnovneInformacije();
	}
}
