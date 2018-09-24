package gui;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Die Haupt- Application Klasse / startet das Programm
 * 
 * @author Letychevskyy
 * @version 0.5 Beta
 */

public class AppStart extends Application {

	/**
	 * Startet die Application
	 * 
	 * @param args
	 *            Kommandozeilenparameter
	 */
	public static void main(String args[]) {
		Application.launch(args);
	}

	/**
	 * Startet das Hauptfenster
	 * 
	 * @param primaryStage
	 *            der Parameter defeniert, welche Scene in der Application
	 *            gezeigt wird
	 */
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Music Quiz");
		primaryStage.setWidth(1280);
		primaryStage.setHeight(1024);
		SceneManager sceneManager = new SceneManager(primaryStage);
		sceneManager.goToLoginScene(sceneManager);
	}
}
