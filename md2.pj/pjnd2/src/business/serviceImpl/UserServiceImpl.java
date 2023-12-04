package business.serviceImpl;

import business.dao.IUserDao;
import business.daoimpl.UserDaoImpl;
import business.entity.Catalog;
import business.entity.User;
import business.service.IUserService;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class UserServiceImpl implements IUserService {
    private static IUserDao userDao = new UserDaoImpl();

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
    @Override
    public void displayUser(List<User> userList){
        if (userList.isEmpty()){
            System.out.println("Danh sách tài khoản trống");
        }else userList.forEach(System.out::println);
    }
    @Override
    public List<User> findAllSortByName() {

        return userDao.findAll().stream().sorted((c1, c2) -> c2.getUserName().compareTo(c1.getUserName())).collect(Collectors.toList());
    }

    @Override
    public boolean checkLogIn(String userName, String password) {

        for (User u : userDao.findAll()
        ) {
            if (Objects.equals(u.getUserName(), userName) && Objects.equals(u.getPassword(), password)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void creatUser(User user) {
        userDao.add(user);
    }

    @Override
    public void updateUser(User user) {
        userDao.update(user);
    }

    @Override
    public List<User> findUserByName(String name) {
        return userDao.findByUserName(name);
    }

    @Override
    public User findById(Long id) {
        return userDao.findById(id);
    }

    @Override
    public Long getNewId() {
        Long idMax = 0L;
        for (User user : userDao.findAll()) {
            if (idMax < user.getUserId()) {
                idMax = user.getUserId();
            }
        }
        return idMax + 1;
    }
}
