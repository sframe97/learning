package OOP.curs;

public class Cursuri {
	private String name;
	private int price;
	private Cursant cursant;
	
	public Cursuri(String name, int price, Cursant cursant) {
		this.setName(name);
		this.setPrice(price);
		this.setCursant(cursant);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Cursant getCursant() {
		return cursant;
	}

	public void setCursant(Cursant cursant) {
		this.cursant = cursant;
	}
}
