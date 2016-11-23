package com.view;

import java.util.List;

import com.MainApp;
import com.crud.MateriaDAO;
import com.model.Correcao;
import com.model.Materia;
import com.model.Questao;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class TreinarSimplesController {
	
	private List<Questao> lista;
	private int indiceAtualDalista;
	
	MainApp mainApp;

	@FXML
	private TextArea respostaIdealTextArea;

	@FXML
	private Label perguntaLabel;
	
	 @FXML
	private Label resultadoLabel;

	@FXML
	private Button responderButton;

	/**
	 * Initialize - é chamado ao carregar o fxml
	 */
	@FXML
	private void initialize(){}
	
	@FXML
	public void comecar(){
		//carregando a lista de questoes
		carregarLista();
		
		//Setando a posição do indice
		indiceAtualDalista=lista.size()-1;
		
		//Exibindo a primeira pergunta
		exibirQuestao();
		
		//Alterando o texto do botão
		responderButton.setText("Responder");	
		
		//Alterando o método do botão		
		responderButton.setOnAction((event) -> handleResponder());
		
	}

	private void carregarLista() {
		lista = mainApp.getListaDeQuestoes();		
	}

	@FXML
	public void handleResponder() {
		resultado(Correcao.corrigeSimples(
				lista.get(indiceAtualDalista), respostaIdealTextArea.getText())
				);
	}

	@FXML
	public void exibirQuestao() {		
		perguntaLabel.setText(lista.get(indiceAtualDalista).getPergunta());	
	}
	
	@FXML
	public void exibirProximaQuestao() {
		if(indiceAtualDalista>0)indiceAtualDalista--;	
		perguntaLabel.setText(lista.get(indiceAtualDalista).getPergunta());			
	}
	
	@FXML
	public void exibirQuestaoAnterior() {
		if((indiceAtualDalista+1)<lista.size())indiceAtualDalista++;	
		perguntaLabel.setText(lista.get(indiceAtualDalista).getPergunta());			
	}
	
	
	
	private void resultado(boolean b){
		if(b){
			resultadoLabel.setText("Acertou!");
			
		}
		else{
			resultadoLabel.setText("Errou\nResposta Correta: "+lista.get(indiceAtualDalista).getResposta());			
		}
	}

	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
		
	}

}