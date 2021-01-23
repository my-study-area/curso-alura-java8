package br.com.alura;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ExerciciosData {

	public static void main(String[] args) {
		//imprima a data atual utilizando a classe LocalDate
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		//Crie um LocalDate para representar o dia 25 de Janeiro de 2099.
		//opção 01
		LocalDate dataFutura = LocalDate.of(2099, Month.JANUARY, 25);
		System.out.println(dataFutura);
		
		//opção 02
		LocalDate dataFutura2 = LocalDate.of(2099, 1, 25);
		System.out.println(dataFutura2);
		
		//Como criar um período entre hoje e a data que você criou no exercício anterior?
		Period periodo = Period.between(hoje, dataFutura);
		System.out.println(periodo);
		
		//Crie um formatador para o pattern dd/MM/yyyy e imprima a data de hoje formatada.
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(hoje.format(formatador));
		
		
	}

}
