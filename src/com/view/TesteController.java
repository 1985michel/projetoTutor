package com.view;

import com.MainApp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;


public class TesteController {

    @FXML
    private AnchorPane anchorPaneBase;

    @FXML
    private Label labelTeste;
    
    // Reference to the main application.
    private MainApp mainApp;

	
    
    /**
     * Construtor 
     */
    public TesteController() {}
    
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
    
    
    

}
