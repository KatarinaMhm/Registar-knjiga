package knjiga;

public abstract class Knjiga {

	private String izdavac;
	private String autor;
	private String naslov;
	private Integer godinaIzdanja;
	private String povez;
	private String formatKnjige;
	private Integer brojStrana;

	public Knjiga(String izdavac, String autor, String naslov, Integer godinaIzdanja, String povez, String formatKnjige,
			Integer brojStrana) {
		super();
		this.izdavac = izdavac;
		this.autor = autor;
		this.naslov = naslov;
		this.godinaIzdanja = godinaIzdanja;
		this.povez = povez;
		this.formatKnjige = formatKnjige;
		this.brojStrana = brojStrana;
	}

	public String getIzdavac() {
		return izdavac;
	}

	public void setIzdavac(String izdavac) {
		this.izdavac = izdavac;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getNaslov() {
		return naslov;
	}

	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}

	public Integer getGodinaIzdanja() {
		return godinaIzdanja;
	}

	public void setGodinaIzdanja(Integer godinaIzdanja) {
		this.godinaIzdanja = godinaIzdanja;
	}

	public String getPovez() {
		return povez;
	}

	public void setPovez(String povez) {
		this.povez = povez;
	}

	public String getFormatKnjige() {
		return formatKnjige;
	}

	public void setFormatKnjige(String formatKnjige) {
		this.formatKnjige = formatKnjige;
	}

	public Integer getBrojStrana() {
		return brojStrana;
	}

	public void setBrojStrana(Integer brojStrana) {
		this.brojStrana = brojStrana;
	}

	public void informacijeOKnjizi() {
		System.out.println(
				"\nIzdavac: " + getIzdavac() + "\nAutor (grupa autora): " + getAutor() + "\nNaslov: " + getNaslov() + "\nGodina izdanja: " + getGodinaIzdanja() + "\nVrsta poveza: " + getPovez()
				+ "\nFormat: " + getFormatKnjige() + "\nBroj strana: " + getBrojStrana());
	}

	public void osnovneInformacije() {
		System.out.println("\nAutor (grupa autora): " + getAutor() + "\nNaslov: " + getNaslov());
	}

}
