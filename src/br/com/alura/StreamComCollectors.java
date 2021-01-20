package br.com.alura;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamComCollectors {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		Optional<Curso> optional = cursos.stream()
			   .filter(c -> c.getAlunos() > 100)
			   .findAny();
		
		optional.ifPresent(c -> System.out.println(c.getNome()));
		
		List<Curso> resultados = cursos.stream()
			.filter(c -> c.getAlunos() > 100)
			.collect(Collectors.toList());
		
		System.out.println("");
		resultados.forEach(c -> System.out.println(c.getNome()));
		
		Map<String, Integer> mapa =  cursos.stream()
			.filter(c -> c.getAlunos() > 100)
			.collect(Collectors.toMap(Curso::getNome, Curso::getAlunos));
		
		System.out.println("");
		System.out.println(mapa);

	}
}
