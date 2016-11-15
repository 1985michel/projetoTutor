package com;



import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import java.io.IOException;

import com.view.TelaInicialController;

public class MainApp extends Application {

	private Stage primaryStage;
	private AnchorPane rootLayout;
	private TelaInicialController base;

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("AddressApp");

		initRootLayout();

		showTeste(base.areaDeTrabalhoBorderPane);
	}

	/**
	 * Inicializa o root layout (layout base).
	 */
	public void initRootLayout() {
		try {
			// Carrega o root layout do arquivo fxml.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/telaInicial.fxml"));
			rootLayout = (AnchorPane) loader.load();

			TelaInicialController controller = loader.getController();
			controller.setMainApp(this);
			this.base = controller;
			
			// Mostra a scene (cena) contendo o root layout.
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
     * Mostra o person overview dentro do root layout.
     */
    public void showTeste(BorderPane areaDeTrabalho) {
        try {
            // Carrega o person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/teste.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();

            // Define o person overview dentro do root layout.
            areaDeTrabalho.setCenter(personOverview);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

	

	/**
	 * Retorna o palco principal.
	 * 
	 * @return
	 */
	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public static void main(String[] args) {
		launch(args);
	}
}