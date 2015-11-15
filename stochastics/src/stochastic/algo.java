package stochastic;

import java.util.ArrayList;
import java.util.List;

public class algo {
	public static void main(String [ ] args)
	{
		List<Good> shoppingList = new ArrayList<Good>();
		shoppingList.add(new Good("cacao", 1, 7));
		shoppingList.add(new Good("lait", 2, 5));
		
		
		/* todo : create some goods*/
		
		
		for (Good g : shoppingList){
			System.out.println(g);
		}
		
		List<Store> storeList = new ArrayList<Store>();
		
		
		storeList.add(new Store("Zara"));
		
		/* Add goods to the store */
		storeList.get(0).addGood(shoppingList.get(0), 4);
		storeList.get(0).addGood(shoppingList.get(1), 3);
		
		/* todo : create some stores*/
		
		
		int[][] distance = new int[storeList.size()][storeList.size()];
		
		distance[1][0]=distance[0][1]=4; //distance between 0 and 1
	}
}
