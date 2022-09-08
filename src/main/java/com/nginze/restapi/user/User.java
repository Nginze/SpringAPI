package com.nginze.restapi.user;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName ;

    public User(){}
    public User(String firstName, String lastName ){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Long getId(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
}
