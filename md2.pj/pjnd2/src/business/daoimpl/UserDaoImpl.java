package business.daoimpl;

import business.dao.IUserDao;
import business.entity.User;
import business.util.IOFile;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class UserDaoImpl implements IUserDao {
    private static List<User> userList;

    public UserDaoImpl() {
        userList = IOFile.getListFromFile(IOFile.USER_PATH);
    }

    @Override
    public List<User> findAll() {
        return userList;
    }

    @Override
    public User findById(Long id) {
        for (User user : userList) {
            if (Objects.equals(user.getUserId(), id)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public void add(User user) {
        userList.add(user);
        IOFile.writeToFile(IOFile.USER_PATH, userList);
    }

    @Override
    public void update(User user) {
        userList.set(userList.indexOf(findById(user.getUserId())), user);
        IOFile.writeToFile(IOFile.USER_PATH, userList);

    }

    @Override
    public List<User> findByUserName(String userName) {
        return userList.stream().filter((s)->s.getUserName().contains(userName)).collect(Collectors.toList());
    }

    @Override
    public void delete(Long id) {
userList.remove(findById(id));
        IOFile.writeToFile(IOFile.USER_PATH,userList);
    }

}
