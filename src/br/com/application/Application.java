package br.com.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Application {

	public static void main(String[] args) {
		
		// 3 Objetos (Calçados) do tipo String
		
		String calcado1 = "Tenis";
		String calcado2 = "Sapatenis";
		String calcado3 = "Chinelo";
		
		//Lista genérica da interface java.util 
		ArrayList<String> calcados = new ArrayList<>();
		calcados.add(calcado1);
		calcados.add(calcado2);
		calcados.add(calcado3);
		
		System.out.println(calcados);
		
		//Implementando collection responsável pela ordenação da lista por ordem alfabética
		Collections.sort(calcados);
		System.out.println(calcados);
		
		//Exemplo de insercao de dados duplicados pelo usuário
		calcados.add(calcado3);
		System.out.println(calcados);
		
		//Implementando collection responsável pelo tratamento de dados duplicados
		HashSet<String> naoDuplicada = new HashSet<>(calcados);
		System.out.println(naoDuplicada);
	}

}
