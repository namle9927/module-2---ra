package business.service;

import business.entity.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();

    List<User> findAllSortByName();
    void displayUser(List<User> userList);
    void creatUser(User user);

    void updateUser(User user);

    List<User> findUserByName(String name);

    User findById(Long id);
    Long getNewId();
    boolean checkLogIn(String userName, String password);
}
