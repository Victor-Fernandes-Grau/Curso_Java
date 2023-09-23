package entities;

public class Funcionario {

	public String nome;
	public Double salBruto;
	public Double taxa;
	
	public double SalarioLiquido() {
		return salBruto - taxa;
	}
	
	public void IncrementoSalario(double porcentagem) {
		salBruto += salBruto * porcentagem / 100.0;
	}
	
	public String toString() {
		return nome + ", $ " + String.format("%.2f", SalarioLiquido());
		}
	
}
