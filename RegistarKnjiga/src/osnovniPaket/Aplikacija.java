package osnovniPaket;


import enciklopedijeRecnici.Recnik;
import enciklopedijeRecnici.TipRecnika;
import fikcija.Fikcija;
import fikcija.Rod;
import knjiga.Knjiga;
import struke.Struke;

public class Aplikacija {


	public static void main(String[] args) {

		// izbor: pogledati listu ili uneti novu knjigu (ili izbrisati neku)
		// kasnije da listu cuvam negde gde ce biti stalna

		// unos knjiga

		Knjiga k = new Fikcija("Vulkan", "Haruki Murakami", "Norveska suma", 1988, "meki povez", "A5", 300, Rod.EPIKA,
				"roman", "savremena japanska knjizevnost");
		Knjiga k1 = new Recnik("OUP", "grupa autora", "Thesaurus", 2016, "tvrdi povez", "20x25", 600,
				TipRecnika.JEDNOJEZICNI);
		Knjiga k2 = new Struke("Pegaz", "Erik From", "Umece ljubavi", 2010, "meki povez", "A6", 200, "psihologija");
		Knjiga k3 = new Fikcija("Laguna", "Borislav Pekic", "Besnilo", 2000, "meki povez", "A5", 450, Rod.EPIKA,
				"roman", "savremena srpska knjizevnost");

		Citac.listaKnjiga.add(k);
		Citac.listaKnjiga.add(k1);
		Citac.listaKnjiga.add(k2);
		Citac.listaKnjiga.add(k3);

		Citac.unesiKnjigu();

		// ispis knjiga

		Ispis.ispisKnjiga();

	}

}
