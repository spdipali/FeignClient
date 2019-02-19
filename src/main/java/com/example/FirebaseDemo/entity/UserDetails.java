package com.example.FirebaseDemo.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = UserDetails.TABLE_NAME)
public class UserDetails {

    public static final String TABLE_NAME="UserDetail";
    private static final String ID_COLUMN="Id";

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = UserDetails.ID_COLUMN)
    private String userDetailId;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "signup_id", nullable = false)
    private Signup signup;
    private String address;
    private String phoneNo;

    @Override
    public String toString() {
        return "UserDetails{" +
                "userDetailId='" + userDetailId + '\'' +
                ", signup=" + signup +
                ", address='" + address + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                '}';
    }

    public String getUserDetailId() {
        return userDetailId;
    }

    public void setUserDetailId(String userDetailId) {
        this.userDetailId = userDetailId;
    }

    public Signup getSignup() {
        return signup;
    }

    public void setSignup(Signup signup) {
        this.signup = signup;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}
