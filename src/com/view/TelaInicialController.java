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
     * Inicializa a classe controller. Este método é chamado automaticamente
     *  após o arquivo fxml ter sido carregado.
     */
    @FXML
    private void initialize() {
        
    }

    /**
     * É chamado pela aplicação principal para dar uma referência de volta a si mesmo.
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

