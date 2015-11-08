package stochastic;


public class Good {
	protected static int index = 1;
	int id;
	String name;
	float minPrice;
	float averagePrice;
	float price;
	
	public Good(String name, float minPrice, float averagePrice) {
		super();
		this.id = index++;
		this.name = name;
		this.minPrice = minPrice;
		this.averagePrice = averagePrice;
	}



	@Override
	public String toString() {
		return "Good [id=" + id + ", name=" + name + ", minPrice=" + minPrice + ", averagePrice=" + averagePrice + "]";
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public float getMinPrice() {
		return minPrice;
	}



	public void setMinPrice(float minPrice) {
		this.minPrice = minPrice;
	}



	public float getAveragePrice() {
		return averagePrice;
	}



	public void setAveragePrice(float averagePrice) {
		this.averagePrice = averagePrice;
	}



	public float getPrice() {
		return price;
	}



	public void setPrice(float price) {
		this.price = price;
	}



	public static int getIndex() {
		return index;
	}



	public int getId() {
		return id;
	}

	
	
}

