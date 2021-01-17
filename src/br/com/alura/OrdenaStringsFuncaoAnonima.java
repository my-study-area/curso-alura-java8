package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStringsFuncaoAnonima {

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
		Comparator<String> comparador = new ComparadorDeStringPorTamanho();
// 		Antes do java 8
//		Collections.sort(palavras, comparador);
//		Java 8
		palavras.sort(comparador);
		
		Consumer<String> consumidor = new ConsumidorDeString();
		palavras.forEach(consumidor);
		
	}
	

}

class ComparadorDeStringPorTamanho implements Comparator<String> {
	
	@Override
	public int compare(String s1, String s2) {
		if(s1.length() > s2.length()) return 1;
		if(s1.length() < s2.length()) return -1;
		return 0;
	}
	
}

class ConsumidorDeString implements Consumer<String> {
    public void accept(String s) {
        System.out.println(s);
    }
}