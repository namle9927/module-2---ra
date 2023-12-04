package business.service;

import business.entity.Catalog;

import java.util.List;

public interface ICatologService {

    List<Catalog> findAllOrderSortByCreatedDate();

    List<Catalog> findAll();

    void creatCatalog(Catalog catalog);


    void updateCatalog(Catalog catalog);

    void deleteCatalog(Long id);


//    Catalog findByName(String name);


    boolean checkExistByCatalogName(String catalogName);

    List<Catalog> findCatalogByName(String catalogname);

    Catalog findById(Long id);

    Long getNewId();
    boolean existByCatalogName(String name);
}
