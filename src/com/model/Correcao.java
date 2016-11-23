package com.model;

import com.util.RemoveCaracteresEspeciais;

public class Correcao {
	
	public static boolean corrigeSimples(Questao q, String entrada){
				
		RemoveCaracteresEspeciais cleaner = new RemoveCaracteresEspeciais();
		return cleaner.clean(q.getResposta()).equalsIgnoreCase(cleaner.clean(entrada));
	}

}
