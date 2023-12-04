package business.entity;

import java.io.Serializable;

public class User implements Serializable {
    private Long userId;
    private String userName;
    private String password;
    private boolean status;

    public User() {
    }



    public Long getUserId() {
        return userId;
    }

    public boolean isStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", status=" + (status?"bình thường":"bị chặn" ) +
                '}';
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public User(Long userId, String userName, String password, boolean status) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.status = status;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
