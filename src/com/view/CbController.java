package com.view;


import java.util.List;

import com.crud.MateriaDAO;
import com.model.Materia;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;

public class CbController {
	
	Materia materiaSelecionada;

    @FXML
    private  ChoiceBox<Materia> cb;
    
    @FXML
    private Button treinarButton;
    
    @FXML
	private void initialize(){
    	treinarButton.setDisable(true);
    	
    	List<Materia> lista = MateriaDAO.getTodasMaterias();
    	lista.add(0, new Materia(-1,"Todas"));
		for (Materia materia : lista) {
			cb.getItems().add(materia);
		}
		cb.setOnAction((event) -> {
			System.out.println(cb.getValue().idMateria);
			materiaSelecionada = cb.getValue();		
			if(materiaSelecionada==null)
				treinarButton.setDisable(true);
			else
				treinarButton.setDisable(false);
		});
    }

}
