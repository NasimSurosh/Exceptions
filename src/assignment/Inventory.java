package assignment;

import java.util.HashMap;

public class Inventory {
	private HashMap<Integer, Product> pro;

	public Inventory() {
		pro = new HashMap<>();
	}

	public void addProduct(Product product) {
		pro.put(product.productId, product);
		System.out.println("Product added! ");
	}

	public String getProductDetails(int productId) {
		try {
			Product product = pro.get(productId);
			if (product != null) {
				return product.toString();

			} else {
				throw new NullPointerException("Product not found");
			}
		} catch (NullPointerException e) {

			return e.getMessage();
		}
	}

}
