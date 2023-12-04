package business.service;

import business.entity.Catalog;
import business.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    List<Product> findAllSortByPrice();
    List<Product> findAllSortByCreatTime();
    Product findById(Long id);
    void create(Product p);
    void update(Product p);
    void deleteById(Long id);
    Long getNewId();
    List<Product> findProductByName (String productName);

}
