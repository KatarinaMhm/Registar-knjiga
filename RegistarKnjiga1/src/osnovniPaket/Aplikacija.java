package osnovniPaket;
import enciklopedijeRecnici.Recnik;
import enciklopedijeRecnici.TipRecnika;
import fikcija.Fikcija;
import fikcija.Rod;
import knjiga.Knjiga;
import ostalo.Ostalo;

public class Aplikacija {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// izbor: pogledati listu ili uneti novu knjigu (ili izbrisati neku)
		// kasnije da listu cuvam negde gde ce biti stalna

		// unos knjiga

		Knjiga k = new Fikcija("Vulkan", "Haruki Murakami", "Norveska suma", 2000, "meki povez", "A5", 400, Rod.EPIKA,"roman", "savremena japanska knjizevnost");
		Knjiga k1 = new Recnik("OUP", "A.T.", "English Learner's Dictionary", 2010, "meki povez", "A5`", 950,TipRecnika.JEDNOJEZICNI);
		Knjiga k2 = new Ostalo("Pi Press", "grupa autora", "Narodne izreke i mudrosti", 2017, "tvrdi povez", "15x23", 210, "kolekcija izreka");
		Knjiga k3 = new Fikcija("Laguna", "Borislav Pekic", "Besnilo", 2002, "tvrdi povez", "A5", 400, Rod.EPIKA,"roman", "savremena srpska knjizevnost");
		Citac.listaKnjiga.add(k);
		Citac.listaKnjiga.add(k1);
		Citac.listaKnjiga.add(k2);
		Citac.listaKnjiga.add(k3);

		Citac.unesiKnjigu();

		// ispis knjiga

		Ispis.ispisKnjiga();
		
		// uklanjanje sa liste

	}

}
