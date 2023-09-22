package entities;

public class Retangulo {

	public double altura;
	public double largura;

	public double Area() {
		return altura * largura;
	}

	public double Perimetro() {
		return altura + altura + largura + largura;
	}
	
	public double Diagonal() {
		return Math.sqrt(altura * altura + largura * largura);
	}
	
	public String toString() {
		return "Altura "
		+ String.format("%.2f", altura)
		+ " Largura "
		+ String.format("%.2f", largura)
		+ " Area = "
		+ String.format("%.2f", Area())
		+ " Perimetro = "
		+ String.format("%.2f", Perimetro())
		+ " Diagonal = "
		+ String.format("%.2f", Diagonal());
		}	
	
}
