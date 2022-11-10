package br.com.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Application {

	public static void main(String[] args) {
		
		// 3 Objetos (Cal�ados) do tipo String
		
		String calcado1 = "Tenis";
		String calcado2 = "Sapatenis";
		String calcado3 = "Chinelo";
		
		//Lista gen�rica da interface java.util 
		ArrayList<String> calcados = new ArrayList<>();
		calcados.add(calcado1);
		calcados.add(calcado2);
		calcados.add(calcado3);
		
		System.out.println(calcados);
		
		//Implementando collection respons�vel pela ordena��o da lista por ordem alfab�tica
		Collections.sort(calcados);
		System.out.println(calcados);
		
		//Exemplo de insercao de dados duplicados pelo usu�rio
		calcados.add(calcado3);
		System.out.println(calcados);
		
		//Implementando collection respons�vel pelo tratamento de dados duplicados
		HashSet<String> naoDuplicada = new HashSet<>(calcados);
		System.out.println(naoDuplicada);
	}

}
