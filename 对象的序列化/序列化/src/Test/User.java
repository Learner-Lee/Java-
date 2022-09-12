package Test;

import java.io.Serializable;

public class User implements Serializable {// Serializable,开启序列化功能
    private int id;
    private String username;
    private String password;
    private double money;
    private String msg;

    public User() {
        super();
    }

    public User(int id, String username, String password, double money, String msg) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.money = money;
        this.msg = msg;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
