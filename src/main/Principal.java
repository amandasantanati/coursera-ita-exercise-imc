package main;


import dominio.Diagnostico;
import dominio.Paciente;

public class Principal {
	public static void main(String[] args) {
		Paciente pacienteUm = new Paciente(100.0, 1.63);
		Paciente pacienteDois = new Paciente(58.0, 1.54);
		Paciente pacienteTres = new Paciente(39.0, 1.54);
		
		Diagnostico diagnosticoUm = new Diagnostico(pacienteUm);
		Diagnostico diagnosticoDois = new Diagnostico(pacienteDois);
		Diagnostico diagnosticoTres = new Diagnostico(pacienteTres);
		
		System.out.println(diagnosticoUm.resultado());
		System.out.println(diagnosticoDois.resultado());
		System.out.println(diagnosticoTres.resultado());
	}
}
