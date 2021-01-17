package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenaStringsLambda {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		
		System.out.println("Ordem de adição:");
		palavras.forEach(System.out::println);
		System.out.println("");
		
		System.out.println("Ordem natural:");
		Collections.sort(palavras);
		palavras.forEach(System.out::println);
		System.out.println("");
		
		System.out.println("Ordem por Tamanho de palavra:");
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		palavras.forEach(p -> System.out.println(p));
	}

}
