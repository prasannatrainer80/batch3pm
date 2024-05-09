package com.java.shop.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.shop.model.Products;

public interface ProductsDao {

	List<Products> showProductsDao() throws ClassNotFoundException, SQLException;
	Products searchByProductId(int id) throws ClassNotFoundException, SQLException;
}
