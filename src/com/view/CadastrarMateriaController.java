package com.view;


import com.crud.MateriaDAO;
import com.model.Materia;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CadastrarMateriaController {

    @FXML
    private TextField nomeMateriaTextField;

    @FXML
    private Button cadastraMateriaButton;
    
    @FXML
    public void handleCadastrarMateria(){
    	String nome = nomeMateriaTextField.getText();
    	MateriaDAO.novaMateria(new Materia(nome));    	
    }

}
