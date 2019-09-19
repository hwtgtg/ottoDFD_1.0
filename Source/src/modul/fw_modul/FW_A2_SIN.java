/**
 * 
 */
package modul.fw_modul;

import jtoolbox.Dezimal;
import modul.DFD__Daten;

/**
 * @author Witt
 * 
 */
public class FW_A2_SIN extends DFD__FunktionWork {

	// *** Vorbelegung. Muss �berschrieben werden
	// ************************************
	// Sortierung innerhalb der Gruppe
	public static final int sortierung = 11;
	// Gruppe, in die die Funktioon eingeordnet wird
	public static final String gruppe = "Zahlen-2";
	
	// Name in der Auswahl
	public static final String bezeichnung = "sin(x)";


	/**
	 * Konstruktor
	 * 
	 */
	public FW_A2_SIN() {
		anzeige = "sin($0$)" ;
		tabellenkalkulatorString = "SIN($0$)";

		anzEingaenge = 1;
		
		eingangsbezeichungen = new String[anzEingaenge];
		eingangsbezeichungen[0] = "x";

		eingangstypen = new DFD_Datentyp[anzEingaenge];
		eingangstypen[0] = DFD_Datentyp.Dezimal;

		ausgangsbezeichnung = "SIN";
	}



	@Override
	public DFD__Daten funktionBerechnen(DFD__Daten[] datenAmEingang) {
		DFD__Daten erg = new DFD__Daten();

		Dezimal tmp = new Dezimal(datenAmEingang[0].getDezimal());
		double d_tmp = Math.sin(tmp.toDouble());
		
		erg.setzeWert(d_tmp);
		erg.setGueltig(true);

		return erg;
	}

}