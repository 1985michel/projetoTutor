package com.util;

import java.text.Normalizer;

public class RemoveCaracteresEspeciais {
		
	public static String removerAcentos(String str) {
	    return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "").replaceAll("[.;,:!?]", "");
	    //telefone.replaceAll("[^0-9]", "");
	}
	
	public String clean(String txt){
		return removerAcentos(txt);
	}
	
}