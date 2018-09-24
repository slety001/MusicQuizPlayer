package logic;

/**
 * Aufzaehlung der Typen, in die die Schwierigkeitsgrade eingeteilt werden
 * koennen.
 * 
 * <p>
 * Fuer jeden Typ laesst sich der ausgeschriebene Name
 * <code>String getLabel()</code> abfragen.
 * 
 * @author Letychevskyy
 * @version 0.5
 */

public enum DifficultyType {

	/**
	 * Typ-Konstante fuer Easy
	 */
	EASY("Easy"),
	/**
	 * Typ-Konstante fuer Normal
	 */
	NORMAL("Normal"),
	/**
	 * Typ-Konstante fuer Hard
	 */
	HARD("Hard");

	private String label;

	/**
	 * Konstruktor zur Uebergabe des ausgeschriebenen Namens eines Typs
	 * 
	 * @param label
	 *            Name der Gruppe
	 */
	private DifficultyType(String label) {
		this.label = label;
	}

	/**
	 * Gibt den ausgeschriebenen Namen des Typs zurueck
	 * 
	 * @return Name
	 */
	public String getLabel() {
		return this.label;
	}
}
