package dominio;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Test;

import dominio.Diagnostico;
import dominio.Paciente;

public class DiagnosticoTeste {

	@Test
	public void deveCalcularIMC() {
		Paciente paciente = new Paciente(100.0, 1.63);
		Diagnostico diagnostico = new Diagnostico(paciente);
		
		assertThat(diagnostico.calcularImc(), equalTo(37.63));
	}
	
	@Test
	public void deveDiagnosticarComoBaixoPesoMuitoGrave() {
		Paciente paciente = new Paciente(40.0, 1.63);
		Diagnostico diagnostico = new Diagnostico(paciente);
		
		assertThat(diagnostico.resultado(), equalTo("Baixo peso muito grave"));
	}
	
	@Test
	public void deveDiagnosticarComoBaixoPesoGrave() {
		Paciente paciente = new Paciente(43.0, 1.63);
		Diagnostico diagnostico = new Diagnostico(paciente);
		
		assertThat(diagnostico.resultado(), equalTo("Baixo peso grave"));
	}
	
	@Test
	public void deveDiagnosticarComoBaixoPeso() {
		Paciente paciente = new Paciente(48.0, 1.63);
		Diagnostico diagnostico = new Diagnostico(paciente);
		
		assertThat(diagnostico.resultado(), equalTo("Baixo peso"));
	}
	
	@Test
	public void deveDiagnosticarComoPesoNormal() {
		Paciente paciente = new Paciente(66.0, 1.63);
		Diagnostico diagnostico = new Diagnostico(paciente);
		
		assertThat(diagnostico.resultado(), equalTo("Peso normal"));
	}
	
	@Test
	public void deveDiagnosticarComoSobrepeso() {
		Paciente paciente = new Paciente(70.0, 1.63);
		Diagnostico diagnostico = new Diagnostico(paciente);
		
		assertThat(diagnostico.resultado(), equalTo("Sobrepeso"));
	}
	
	@Test
	public void deveDiagnosticarComoObesidadeGrauI() {
		Paciente paciente = new Paciente(90.0, 1.63);
		Diagnostico diagnostico = new Diagnostico(paciente);
		
		assertThat(diagnostico.resultado(), equalTo("Obesidade grau I"));
	}
	
	@Test
	public void deveDiagnosticarComoObesidadeGrauII() {
		Paciente paciente = new Paciente(100.0, 1.63);
		Diagnostico diagnostico = new Diagnostico(paciente);
		
		assertThat(diagnostico.resultado(), equalTo("Obesidade grau II"));
	}
	
	@Test
	public void deveDiagnosticarComoObesidadeGrauIII() {
		Paciente paciente = new Paciente(110.0, 1.63);
		Diagnostico diagnostico = new Diagnostico(paciente);
		
		assertThat(diagnostico.resultado(), equalTo("Obesidade grau III (obesidade mórbida)"));
	}

}
