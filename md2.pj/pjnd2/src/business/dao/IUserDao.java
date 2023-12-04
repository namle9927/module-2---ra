package business.dao;

import business.entity.Catalog;
import business.entity.User;

import java.util.List;

public interface IUserDao extends IGenericDao<User,Long>{
    List<User> findByUserName(String userName);

}
