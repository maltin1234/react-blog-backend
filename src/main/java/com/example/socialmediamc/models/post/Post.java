package com.example.socialmediamc.models.post.mappers;


import com.example.socialmediamc.models.user.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class PostMapper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String name;
    // Getters and setters
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}