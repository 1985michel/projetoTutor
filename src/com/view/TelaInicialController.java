package com.view;

import com.MainApp;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class TelaInicialController {

    @FXML
    private AnchorPane menuAnchorPane;

    @FXML
    public BorderPane areaDeTrabalhoBorderPane;

    @FXML
    private AnchorPane areaDeTrabalhoAnchorPane;

	public MainApp mainApp;
    
    /**
     * Construtor 
     */
    public TelaInicialController() {}
    
    /**
     * Inicializa a classe controller. Este m�todo � chamado automaticamente
     *  ap�s o arquivo fxml ter sido carregado.
     */
    @FXML
    private void initialize() {
        
    }

    /**
     * � chamado pela aplica��o principal para dar uma refer�ncia de volta a si mesmo.
     * 
     * @param mainApp
     */
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }
    
    public void exibirCadastrarMateria(){
    	this.mainApp.showCadastrarMateria(this.areaDeTrabalhoBorderPane);
    }

}

