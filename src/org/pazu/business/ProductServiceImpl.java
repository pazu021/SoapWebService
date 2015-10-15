package org.pazu.business;

import java.util.ArrayList;
import java.util.List;

import org.pazu.model.Product;

public class ProductServiceImpl {

	List<String> bookList = new ArrayList<>();
	List<String> musicList = new ArrayList<>();
	List<String> movieList = new ArrayList<>();

	public ProductServiceImpl() {
		bookList.add("book A");
		bookList.add("book B");
		bookList.add("book C");

		musicList.add("music A");
		musicList.add("music B");
		musicList.add("music C");

		movieList.add("movie A");
		movieList.add("movie B");
		movieList.add("movie C");
	}

	public List<String> getProductCategories() {
		List<String> categories = new ArrayList<String>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		return categories;
	}

	public List<String> getProducts(String category) {
		switch (category.toLowerCase()) {
		case "books":
			return bookList;
		case "music":
			return musicList;
		case "movies":
			return movieList;
		}
		return null;
	}

	public boolean addProduct(String category, String product) {
		switch (category.toLowerCase()) {
		case "books":
			bookList.add(product);
			break;
		case "music":
			musicList.add(product);
			break;
		case "movies":
			movieList.add(product);
			break;
		default:
			return false;
		}
		return true;
	}

	public List<Product> getProductsV2(String category) {

		List<Product> productList = new ArrayList<>();
		productList.add(new Product("product A", "123", 9999.99));
		productList.add(new Product("product B", "123", 123.1));
		return productList;

	}

}
