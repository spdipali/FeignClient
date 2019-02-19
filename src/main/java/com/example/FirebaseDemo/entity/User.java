package com.example.FirebaseDemo.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = User.TABLE_NAME)
public class User{


    public static final String TABLE_NAME="Signup";
    public static final String ID_COLUMN="signup_id";

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = User.ID_COLUMN)
    private String Id;
    private String username;
    private String password;
    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<Roles> rolesList;


    public User(String username, String password, List<Roles> rolesList) {
        this.username = username;
        this.password = password;
        this.rolesList = rolesList;
    }

    public List<Roles> getRolesList() {
        return rolesList;
    }

    public void setRolesList(List<Roles> rolesList) {
        this.rolesList = rolesList;
    }

    @Override
    public String toString() {
        return "Signup{" +
                "Id='" + Id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
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