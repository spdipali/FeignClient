package com.example.FirebaseDemo.entity;

import javax.management.relation.Role;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = Roles.TABLE_NAME)
public class Roles {

    public static final String TABLE_NAME="Roles";

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    Roles() {}

    public Roles( String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
