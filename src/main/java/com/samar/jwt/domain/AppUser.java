package com.samar.jwt.domain;

import com.samar.jwt.enums.Role;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "user_detail")
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String name;
    private String email;

    @CollectionTable
    private Date createdAt;

    @UpdateTimestamp
    private Date updatedAt;

    private Role role;
}
