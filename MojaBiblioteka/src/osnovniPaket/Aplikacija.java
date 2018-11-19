package osnovniPaket;

import Kategorije.Drugo;
import Kategorije.Fikcija;
import Kategorije.FikcijaKnjizevniRod;
import Kategorije.Recnik;
import Kategorije.Strucna;
import Kategorije.TipRecnika;

public class Aplikacija {

	public static void main(String[] args) {

		Fikcija f = new Fikcija("Laguna", "Sun Cu", "Umece ratovanja", 1988, "tvrdi povez", "A6", 190, FikcijaKnjizevniRod.EPIKA);
		Fikcija g = new Fikcija("Vuklan", "Oskar Vajld", "Slika Dorijana Greja", 2001, "meki povez", "A4", 250, FikcijaKnjizevniRod.EPIKA);
		Recnik r = new Recnik("OUP", "grupa autora", "thesaurus", 2016, "meki povez", "25x15", 800, TipRecnika.JEDNOJEZICNI);
		Drugo s = new Drugo("Cigoja", "Dr Nikola Rot", "Tipovi licnosti", 1997, "tvrdi povez", "40x30", 143, "psihologija");
		
		Citac.listaKnjiga.add(f);
		Citac.listaKnjiga.add(g);
		Citac.listaKnjiga.add(r);
		Citac.listaKnjiga.add(s);
		
		Citac.unesiKnjigu();
		
		Ispis.ispisKnjiga();
	}

}
