package com.view;

import java.util.List;

import com.MainApp;
import com.crud.MateriaDAO;
import com.crud.QuestaoDAO;
import com.model.Materia;
import com.model.Questao;
import com.util.Alertadora;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class CadastrarQuestaoController {

	MainApp mainApp;
	
	Materia materiaSelecionada;

	@FXML
	private TextArea perguntaTextArea;

	@FXML
	private TextArea respostaIdealTextArea;

	@FXML
	public ComboBox<Materia> mcb;
	
	

	@FXML
	private Button cadastrarPerguntaButton;

	/**
	 * Initialize - é chamado ao carregar o fxml
	 */
	@FXML
	private void initialize() {
		List<Materia> lista = MateriaDAO.getTodasMaterias();
		for (Materia materia : lista) {
			mcb.getItems().add(materia);
		}
		mcb.setOnAction((event) -> {
			//System.out.println(mcb.getValue().idMateria);
			materiaSelecionada = mcb.getValue();
		});

		

	}

	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
		//this.carregaComboBox();

	}
	
	@FXML
	public void handleCadastrarQuestao(){
		
		if(materiaSelecionada==null){
			alertarMateriaNaoSelecionada();
			return;
		}
		String pergunta = perguntaTextArea.getText();
		String resposta = respostaIdealTextArea.getText();
		QuestaoDAO.novaQuestao(new Questao(materiaSelecionada.idMateria, pergunta, resposta));
		
	}

	private void alertarMateriaNaoSelecionada() {
		Alertadora.alertarWarning("Qual a matéria?", "",
				"Favor informar a materia");
		
	}

	

}
