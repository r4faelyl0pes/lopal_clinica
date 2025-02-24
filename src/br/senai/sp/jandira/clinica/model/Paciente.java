package br.senai.sp.jandira.clinica.model;

import java.time.LocalDate;

public class Paciente {

	private String nome;
	public String cpf;
	private double altura;
	private double peso;
	public String telefone;
	public LocalDate dataNascimento;

	public void setAltura(double altura) {

		if (altura > 0 && altura < 3) {
			// TRUE
			this.altura = altura;
		} else {
			// FALSE
			System.out.println("A altura do(a) paciente " + nome + 
					" deve ser maior que zero e menor que três!");
		}

	}

	public void setPeso(double peso) {
		
		if (peso > 30 && peso < 500) {
			// TRUE
			this.peso = peso;
		} else {
			// FALSE
		System.out.println("O peso do(a) paciente " + nome + 
				" deve ser maior que trinta e menor que quinhentos!");
		}
	}
	
	public void setNome (String nome) {
		this.nome = nome.toUpperCase();
	}

	public String getNome() {
		return nome; 
	}

	public void mostrarDados() {
		System.out.println("----------------------------------------");
		System.out.println("DADOS DO PACIENTE");
		System.out.println("----------------------------------------");
		System.out.println("Nome: " + nome);
		System.out.println("Peso: " + peso + " kgs");
		System.out.println("Altura: " + altura + "m");
		System.out.println("Cpf: " + cpf);
		System.out.println("----------------------------------------");
		System.out.println();
	}

}
