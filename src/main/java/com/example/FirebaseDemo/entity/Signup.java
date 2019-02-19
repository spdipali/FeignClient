package com.example.FirebaseDemo.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = Signup.TABLE_NAME)
public class Signup {

    public static final String TABLE_NAME="Signup";
    public static final String ID_COLUMN="signup_id";

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = Signup.ID_COLUMN)
    private String signupId;
    private String signupName;
    private String signupUname;

    @Override
    public String toString() {
        return "Signup{" +
                "signupId='" + signupId + '\'' +
                ", signupName='" + signupName + '\'' +
                ", signupUname='" + signupUname + '\'' +
                '}';
    }

    public String getSignupId() {
        return signupId;
    }

    public void setSignupId(String signupId) {
        this.signupId = signupId;
    }

    public String getSignupName() {
        return signupName;
    }

    public void setSignupName(String signupName) {
        this.signupName = signupName;
    }

    public String getSignupUname() {
        return signupUname;
    }

    public void setSignupUname(String signupUname) {
        this.signupUname = signupUname;
    }
}
