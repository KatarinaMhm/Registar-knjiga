package Kategorije;

import knjiga.Knjiga;

public class Strucna extends Knjiga {

	private String strucnaOblast;

	public Strucna(String izdavac, String autor, String naslov, Integer godinaIzdanja, String povez,
			String formatKnjige, Integer brojStrana, String strucnaOblast) {
		super(izdavac, autor, naslov, godinaIzdanja, povez, formatKnjige, brojStrana);
		this.strucnaOblast = strucnaOblast;
	}

	public String getStrucnaOblast() {
		return strucnaOblast;
	}

	public void setStrucnaOblast(String strucnaOblast) {
		this.strucnaOblast = strucnaOblast;
	}

	@Override
	public void informacijeOKnjizi() {
		super.informacijeOKnjizi();
	}

	@Override
	public void osnovneInformacije() {
		super.osnovneInformacije();
	}

}
