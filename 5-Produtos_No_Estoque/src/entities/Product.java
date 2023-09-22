package entities;

public class Product {

	public String name;
	public Double price;
	public int quantity;
	
	public double totValoueInStock() {
		return price * quantity ;
	}
	
	public void AddProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void RemoveProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	//Sobre pondo o toString padrao do Object
	public String toString() {
		return name
		+ ", $ "
		+ String.format("%.2f", price)
		+ ", "
		+ quantity
		+ " units, Total: $ "
		+ String.format("%.2f", totValoueInStock());
		}
	
}
