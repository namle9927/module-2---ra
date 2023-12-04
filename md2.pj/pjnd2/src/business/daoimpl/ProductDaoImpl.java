package business.daoimpl;

import business.dao.IProductDao;
import business.entity.Product;
import business.util.IOFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ProductDaoImpl implements IProductDao {
    private static List<Product> productList;

    public ProductDaoImpl() {

        productList = IOFile.getListFromFile(IOFile.PRODUCT_PATH);
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    /**
     * @param id
     * @return Product
     */
    @Override
    public Product findById(Long id) {
        for (Product p : productList
        ) {
            if (Objects.equals(p.getProductId(), id)) {
                return p;
            }
        }
        return null;
    }

    /**
     * @param product
     */
    @Override
    public void add(Product product) {
        productList.add(product);
        IOFile.writeToFile(IOFile.PRODUCT_PATH,productList);
    }

    /**
     * @param product
     */
    @Override
    public void update(Product product) {
        productList.set(productList.indexOf(findById(product.getProductId())), product);
        IOFile.writeToFile(IOFile.PRODUCT_PATH,productList);

    }

    @Override
    public void delete(Long id) {

        productList.remove(findById(id));
        IOFile.writeToFile(IOFile.PRODUCT_PATH,productList);

    }

    @Override
    public List<Product> findByProductName(String productName) {
        return productList.stream().filter((s) -> s.getProductName().contains(productName)).collect(Collectors.toList());
    }

    /**
     *
     * @param id
     */

}
