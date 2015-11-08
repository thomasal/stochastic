package stochastic;


public class Good {
	protected static int index = 1;
	int id;
	String name;
	int minPrice;
	int averagePrice;
	
	public Good(String name, int minPrice, int averagePrice) {
		super();
		this.id = index++;
		this.name = name;
		this.minPrice = minPrice;
		this.averagePrice = averagePrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(int minPrice) {
		this.minPrice = minPrice;
	}

	public int getAveragePrice() {
		return averagePrice;
	}

	public void setAveragePrice(int averagePrice) {
		this.averagePrice = averagePrice;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Good [id=" + id + ", name=" + name + ", minPrice=" + minPrice + ", averagePrice=" + averagePrice + "]";
	}

	
	
}

