/**
 * 
 */
package modul.fw_modul;

import jtoolbox.Dezimal;
import modul.DFD__Daten;
import modul.DFD__IF_Modul;

/**
 * @author Witt
 * 
 */
public class FW_A2_ATAN extends DFD__FunktionWork {

	// *** Vorbelegung. Muss überschrieben werden
	// ************************************
	// Sortierung innerhalb der Gruppe
	public static final int sortierung = 33;
	// Gruppe, in die die Funktioon eingeordnet wird
	public static final String gruppe = "Zahlen-2";

	// Name in der Auswahl
	public static final String bezeichnung = "arcTan(x)";

	/**
	 * Konstruktor
	 * 
	 */
	public FW_A2_ATAN() {
		anzeige = "arcTan($0$)";
		tabellenkalkulatorString = "ARCTAN($0$)";

		anzEingaenge = 1;

		eingangsbezeichungen = new String[anzEingaenge];
		eingangsbezeichungen[0] = "x";

		eingangstypen = new DFD_Datentyp[anzEingaenge];
		eingangstypen[0] = DFD_Datentyp.Dezimal;

		ausgangsbezeichnung = "ArcusTangens";
	}

	@Override
	public DFD__Daten funktionBerechnen(DFD__Daten[] datenAmEingang) {
		DFD__Daten erg = new DFD__Daten();

		Dezimal tmp = new Dezimal(datenAmEingang[0].getDezimal());

		double d_tmp = Math.atan(tmp.toDouble());

		if (Double.isNaN(d_tmp)) {
			erg.setGueltig(!DFD__IF_Modul.gueltig);
			erg.setzeError();
		} else {
			erg.setzeWert(d_tmp);
			erg.setGueltig(DFD__IF_Modul.gueltig);
		}

		return erg;
	}

}
