package com.happypet.HappyPet.persistence.entity;



import com.happypet.HappyPet.enumerators.UserRole;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

/**
 * The user entity
 */

@Data
@Builder
@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 100)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false, unique = true)
    private String phoneNumber;
    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.ORDINAL)
    @Column(nullable = false)
    private UserRole role;
}