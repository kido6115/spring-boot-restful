package com.sungyeh.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "user")
public class User {

    @Id
    @Column(name = "username_")
    private String username;
    @Column(name = "password_")
    private String password;
    @Column(name = "name_")
    private String name;
    @Column(name = "person_id_")
    private String personId;
    @Column(name = "phone_")
    private String phone;


}
