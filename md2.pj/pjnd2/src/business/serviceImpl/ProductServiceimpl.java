package business.serviceImpl;

import business.dao.IProductDao;
import business.daoimpl.ProductDaoImpl;
import business.entity.Catalog;
import business.entity.Product;
import business.service.ICatologService;
import business.service.IProductService;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductServiceimpl implements IProductService {
    private static IProductDao productDao = new ProductDaoImpl();

    @Override
    public List<Product> findAll() {
        return productDao.findAll();
    }

    @Override
    public List<Product> findProductByName(String productName) {
        return productDao.findByProductName(productName);
    }

    @Override
    public List<Product> findAllSortByPrice() {
        return productDao.findAll().stream().sorted(Comparator.comparingDouble(Product::getUnitPrice)).collect(Collectors.toList());
    }

    @Override
    public List<Product> findAllSortByCreatTime() {
        return productDao.findAll().stream().sorted(Comparator.comparing(Product::getCreat_at)).collect(Collectors.toList());
    }

    @Override
    public Product findById(Long id) {
        return productDao.findById(id);
    }

    @Override
    public void create(Product p) {
productDao.add(p);
    }

    @Override
    public void update(Product p) {
        productDao.update(p);
    }

    @Override
    public void deleteById(Long id) {
productDao.delete(id);
    }

    @Override
    public Long getNewId() {
        Long idMax = 0L;
        for (Product p: productDao.findAll()) {
            if(idMax<p.getProductId()){
                idMax = p.getProductId();
            }
        }
        return idMax+1;
    }
}
