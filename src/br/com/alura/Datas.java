package br.com.alura;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate olimpiadaRio = LocalDate.of(2016, Month.JUNE, 5);
		int anos =  hoje.getYear() - olimpiadaRio.getYear();
		System.out.println(anos);
		
		Period periodo = Period.between(olimpiadaRio, hoje);
		System.out.println("Ano: " + periodo.getYears());
		System.out.println("Meses: " + periodo.getMonths());
		System.out.println("Dias: " + periodo.getDays());
		
		System.out.println(hoje.minusYears(1));
		System.out.println(hoje.minusMonths(4));
		System.out.println(hoje.minusDays(2));
		
		System.out.println(hoje.plusYears(1));
		System.out.println(hoje.plusMonths(4));
		System.out.println(hoje.plusDays(2));
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String valorFormatado = hoje.format(formatador);
		System.out.println("Data formatada: " + valorFormatado);
		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora);
		
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		System.out.println(agora.format(formatadorComHoras));
		
		YearMonth anoMes = YearMonth.of(2015, Month.JANUARY);
		System.out.println(anoMes);
		
		LocalTime intervalo = LocalTime.of(12, 30);
		System.out.println(intervalo);
		
	}

}
