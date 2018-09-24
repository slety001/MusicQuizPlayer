package data;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Klasse speichert die "score"-Daten im File ab
 * 
 * @author Letychevskyy
 * @version 0.5 Beta
 */

public class SaveData implements ISaveData {

	/**
	 * speichert die "score"-Daten im File ab
	 * 
	 * @param userName
	 *            Name des eingelogten Benutzers
	 * @param score
	 *            Punkte des eingelogten Benutzers
	 */
	@Override
	public void saveScore(String name, int score) {
		BufferedWriter bw = null;

		try {
			File file = new File("Highscore.txt");
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file, true);
			bw = new BufferedWriter(fw);
			bw.write(name + " " + score + "\n");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
			} catch (Exception ex) {
				System.out.println("Error in closing the BufferedWriter" + ex);
			}
		}
	}

}
