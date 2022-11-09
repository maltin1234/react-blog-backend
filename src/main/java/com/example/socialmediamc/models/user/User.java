package com.example.socialmediamc.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 50, nullable = false)
    private String name;
    @OneToMany(mappedBy = "user")
    private Set<Post> posts;
}
