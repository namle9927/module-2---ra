package business.dao;

import business.entity.Catalog;
import business.entity.Product;

import java.util.List;

public interface IProductDao extends IGenericDao<Product,Long> {
    List<Product> findByProductName(String productName);
}
