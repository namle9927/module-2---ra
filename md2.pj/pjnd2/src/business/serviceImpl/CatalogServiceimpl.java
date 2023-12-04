package business.serviceImpl;

import business.dao.ICatalogDao;
import business.daoimpl.CatalogDaoImpl;
import business.entity.Catalog;
import business.service.ICatologService;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CatalogServiceimpl implements ICatologService {
    private static ICatalogDao catalogDao = new CatalogDaoImpl();

    @Override
    public List<Catalog> findAllOrderSortByCreatedDate() {
        return catalogDao.findAll().stream().sorted((c1, c2) -> c2.getCreatedAt().compareTo(c1.getCreatedAt())).collect(Collectors.toList());
    }

    @Override
    public List<Catalog> findAll() {
        return catalogDao.findAll();
    }

    @Override
    public Catalog findById(Long id) {
        return catalogDao.findById(id);
    }

    @Override
    public boolean existByCatalogName(String name) {
        for (Catalog cat : catalogDao.findAll()
        ) {
            if (Objects.equals(cat.getCatalogName(), name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Long getNewId() {
        Long idMax = 0L;
        for (Catalog cat : catalogDao.findAll()) {
            if (idMax < cat.getCatalogId()) {
                idMax = cat.getCatalogId();
            }
        }
        return idMax + 1;
    }

    @Override
    public void creatCatalog(Catalog catalog) {
        catalog.setCreatedAt(LocalDateTime.now());
        catalogDao.add(catalog);
    }

    @Override
    public List<Catalog> findCatalogByName(String catalogname) {
        return catalogDao.findByCatalogName(catalogname);
    }

    @Override
    public void updateCatalog(Catalog catalog) {
        catalogDao.update(catalog);
    }

    @Override
    public void deleteCatalog(Long id) {
        catalogDao.delete(id);
    }

//    public Catalog findByName(String name) {
//        return null;
//    }

    @Override
    public boolean checkExistByCatalogName(String catalogName) {
        return false;
    }
}
