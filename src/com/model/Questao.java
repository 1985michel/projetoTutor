package com.model;

public class Questao {
	
	public int idQuestao;
	public int idMateria;
	public String pergunta;
	public String resposta;
	
	
	
	public Questao( int idMateria, String pergunta, String resposta) {
		super();
		this.idQuestao = 0;
		this.idMateria = idMateria;
		this.pergunta = pergunta;
		this.resposta = resposta;
	}
	
	public Questao(int idQuestao, int idMateria, String pergunta, String resposta) {
		super();
		this.idQuestao = idQuestao;
		this.idMateria = idMateria;
		this.pergunta = pergunta;
		this.resposta = resposta;
	}
	public int getIdQuestao() {
		return idQuestao;
	}
	public void setIdQuestao(int idQuestao) {
		this.idQuestao = idQuestao;
	}
	public int getIdMateria() {
		return idMateria;
	}
	public void setIdMateria(int idMateria) {
		this.idMateria = idMateria;
	}
	public String getPergunta() {
		return pergunta;
	}
	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}
	public String getResposta() {
		return resposta;
	}
	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	
	

}
