package com;



import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.List;

import com.crud.QuestaoDAO;
import com.model.Questao;
import com.view.CadastrarQuestaoController;
import com.view.CbController;
import com.view.TelaInicialController;
import com.view.TreinarSimplesController;

public class MainApp extends Application {

	private Stage primaryStage;
	private AnchorPane rootLayout;
	private TelaInicialController base;

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Projeto Tutor - Learn once, remember forever!");

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
    public void showTeste(BorderPane areaDeTrabalhoBorderPane) {
        try {
            // Carrega o person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/cb.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();
            
			CbController controller = loader.getController();
		


            // Define o person overview dentro do root layout.
            areaDeTrabalhoBorderPane.setCenter(personOverview);
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

	
	public void showCadastrarMateria(BorderPane areaDeTrabalhoBorderPane) {
		try {
            // Carrega o person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/cadastrarMateria.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();

            // Define o person overview dentro do root layout.
            areaDeTrabalhoBorderPane.setCenter(personOverview);
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}
	
	
	public void showCadastrarQuestao(BorderPane areaDeTrabalhoBorderPane) {
		try {
            // Carrega o person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/cadastrarQuestao.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();
            
            CadastrarQuestaoController controller = loader.getController();
			controller.setMainApp(this);

            // Define o person overview dentro do root layout.
            areaDeTrabalhoBorderPane.setCenter(personOverview);
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}
	
	public void showCB(BorderPane areaDeTrabalhoBorderPane) {
		try {
            // Carrega o person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/cb.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();

            // Define o person overview dentro do root layout.
            areaDeTrabalhoBorderPane.setCenter(personOverview);
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}
	
	public void showTreinarSimples(BorderPane areaDeTrabalhoBorderPane) {
		try {
            // Carrega o person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/treinarSimples.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();
            
            TreinarSimplesController controller = loader.getController();
			controller.setMainApp(this);

            // Define o person overview dentro do root layout.
            areaDeTrabalhoBorderPane.setCenter(personOverview);
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}

	public List<Questao> getListaDeQuestoes() {
		// TODO Auto-generated method stub
		return QuestaoDAO.getTodasQuestoes();
	}
}