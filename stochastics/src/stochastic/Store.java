package stochastic;

import java.util.HashMap;
import java.util.Map;

public class Store {
	public Store(int id, String name) {
		super();
		this.id = id;
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
	
}
