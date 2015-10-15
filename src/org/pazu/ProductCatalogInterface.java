package org.pazu;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.pazu.model.Product;

//@WebService(name="TestCatalog")
@WebService
public interface ProductCatalogInterface {

	// @WebMethod(action="fetch_categories", operationName="fetchCategories")
	@WebMethod
	public abstract List<String> getProductCategories();

	@WebMethod
	public abstract List<String> getProducts(String category);

	@WebMethod
	public abstract boolean addProduct(String category, String product);

	@WebMethod
	@WebResult(name = "Product")
	public abstract List<Product> getProductsV2(String category);

}