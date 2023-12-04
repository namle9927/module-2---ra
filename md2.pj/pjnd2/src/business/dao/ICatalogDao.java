package business.dao;

import business.entity.Catalog;

import java.util.List;

public interface ICatalogDao extends IGenericDao<Catalog, Long> {

    List<Catalog> findByCatalogName(String catalogName);
}
