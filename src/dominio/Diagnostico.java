package dominio;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Diagnostico {
	private Paciente paciente;
	
	public Diagnostico(Paciente paciente) {
		this.paciente = paciente;
	}
	
	public double calcularImc() {
		return truncarImc(
				this.paciente.getPeso() / 
				(this.paciente.getAltura() * this.paciente.getAltura()));
	}
	
	public String resultado() {
		return calcularDiagnostico(calcularImc());
	}
	
	private double truncarImc(double imc) {
		DecimalFormat df = new DecimalFormat("#.##");
		df.setRoundingMode(RoundingMode.DOWN);
		
		return Double.valueOf(df.format(imc));
	}
	
	private String calcularDiagnostico(double imc) {
		if(imc < 16.00) return "Baixo peso muito grave";
		if(imc < 17.00) return "Baixo peso grave";
		if(imc < 18.50) return "Baixo peso";
		if(imc < 25.00) return "Peso normal";
		if(imc < 30.00) return "Sobrepeso";
		if(imc < 35.00) return "Obesidade grau I";
		if(imc < 40.00) return "Obesidade grau II";
		
		return "Obesidade grau III (obesidade mórbida)"; 
	}
}
