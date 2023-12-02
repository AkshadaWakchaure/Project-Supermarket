package com.cdac.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.ProductDao;
import com.cdac.entities.Product;

@Service
public class ProductServiceimpl implements ProductService {
	@Autowired
	private ProductDao productDao;
	
	
	
	public ProductServiceimpl() {

	}
	
	@Override
	public List<Product> getProducts() {
		
		
		return productDao.findAll(); //get from db make object add in list & givit to u
	}

	@SuppressWarnings("deprecation")
	@Override
	public Product getProduct(long productId) {
		

		return productDao.getOne(productId);
	}

	@Override
	public Product addProduct(Product product) {
		// list.add(product);
		productDao.save(product);
		return product ;
	}

	@Override
	public Product updateProduct(Product product) {
		

		productDao.save(product);
		
		return product;
	}

	@Override
	public void deleteProduct(long parseLong) {
		
		
		@SuppressWarnings("deprecation")
		Product entity = productDao.getOne(parseLong);
		productDao.delete(entity);
	} 

}
