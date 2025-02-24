package br.senai.sp.jandira.clinica;

import java.time.LocalDate;

import br.senai.sp.jandira.clinica.model.Paciente;

public class ClinicaApp {

	public static void main(String[] args) {
	
		// Criar um objeto do tipo Paciente
		Paciente p1 = new Paciente();
		p1.nome = "Ana Maria";
		p1.cpf = "999.888.666-77";
		p1.altura = 1.63;
		p1.peso = 75.450;
		p1.telefone = "(11)96523-8888";
		p1.dataNascimento = LocalDate.of(2003,8, 16);
				
		
		
		Paciente p2 = new Paciente();
		p2.nome = "Rafaely";
		p2.cpf = "444.555.666.77";
		p2.altura = 1.45;
		p2.peso = 35.550;
		p2.telefone = "(11)99120-6849";
		p2.dataNascimento = LocalDate.of(2006,11,29);
		
		p1.mostrarDados();
		p2.mostrarDados();
		
		System.out.println(p2.dataNascimento.getDayOfWeek());
		

	}

}
