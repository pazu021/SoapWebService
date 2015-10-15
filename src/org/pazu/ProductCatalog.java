package org.pazu;

import java.util.List;

import javax.jws.WebService;

import org.pazu.business.ProductServiceImpl;
import org.pazu.model.Product;

//@WebService(endpointInterface="org.pazu.ProductCatalogInterface", portName= "TestCatalogPort", serviceName="TestCatalogService", targetNamespace="http://localhost:8080/")
@WebService(endpointInterface = "org.pazu.ProductCatalogInterface")
public class ProductCatalog implements ProductCatalogInterface {

	ProductServiceImpl productService = new ProductServiceImpl();

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pazu.ProductCatalogInterface#getProductCategories()
	 */
	@Override
	public List<String> getProductCategories() {
		return productService.getProductCategories();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pazu.ProductCatalogInterface#getProducts(java.lang.String)
	 */
	@Override
	public List<String> getProducts(String category) {
		return productService.getProducts(category);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pazu.ProductCatalogInterface#addProduct(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public boolean addProduct(String category, String product) {
		return productService.addProduct(category, product);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pazu.ProductCatalogInterface#getProductsV2(java.lang.String)
	 */
	@Override
	public List<Product> getProductsV2(String category) {
		return productService.getProductsV2(category);
	}

}
