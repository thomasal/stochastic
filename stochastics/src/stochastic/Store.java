package stochastic;

import java.util.HashMap;
import java.util.Map;

public class Store {
	public Store(String name) {
		super();
		this.id = index++;
		this.name = name;
	}
	protected static int index = 1;
	int id;
	String name;
	Map<Integer,Float> goods = new HashMap<Integer,Float>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static int getIndex() {
		return index;
	}
	public int getId() {
		return id;
	}
	public Map<Integer, Float> getGoods() {
		return goods;
	}
	public void addGood(Good g, float price){
		goods.put(g.getId(), price);
	}
	
}
