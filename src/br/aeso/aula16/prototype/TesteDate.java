package br.aeso.aula16.prototype;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class TesteDate {

	public static void main(String[] args) {
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate hoje = LocalDate.parse("03/02/1979", formatador);
		System.out.println(hoje); //2014-04-08 (formato ISO-8601)
	}

}
