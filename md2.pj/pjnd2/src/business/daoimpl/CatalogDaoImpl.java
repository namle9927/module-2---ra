package business.daoimpl;

import business.dao.ICatalogDao;
import business.entity.Catalog;
import business.util.IOFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CatalogDaoImpl implements ICatalogDao {
    // khai bao list catalogs voi kieu du lieu Catalog
    private static List<Catalog> catalogs;

    public CatalogDaoImpl() {
        catalogs = IOFile.getListFromFile(IOFile.CATALOG_PATH);
    }
    //    // khoi tao du lieu mau de ko can
//    static {
//        catalogs.add(new Catalog());
//        catalogs.add(new Catalog());
//    }

    /**
     *
     * @return list Catalog
     */
    @Override
    public List<Catalog> findAll() {
        return catalogs;
    }

    /**
     *
     * @param id
     * @return Catalog
     */
    @Override
    public Catalog findById(Long id) {
        for (Catalog cat:catalogs
             ) {
            if (Objects.equals(cat.getCatalogId(), id)){
                return cat;
            }
        }
        return null;
    }

    /**
     *
     * @param catalog
     */
    @Override
    public void add(Catalog catalog) {
        catalogs.add(catalog);
        IOFile.writeToFile(IOFile.CATALOG_PATH,catalogs);

    }

    /**
     *
     * @param catalog
     */
    @Override
    public void update(Catalog catalog) {

        catalogs.set(catalogs.indexOf(findById(catalog.getCatalogId())),catalog);
        IOFile.writeToFile(IOFile.CATALOG_PATH,catalogs);
    }

    /**
     *
     * @param id
     */
    @Override
    public void delete(Long id) {

        catalogs.remove(findById(id));
        IOFile.writeToFile(IOFile.CATALOG_PATH,catalogs);
    }

    @Override
    public List<Catalog> findByCatalogName(String catalogName) {
        return catalogs.stream().filter((s)->s.getCatalogName().contains(catalogName)).collect(Collectors.toList());
    }
}
