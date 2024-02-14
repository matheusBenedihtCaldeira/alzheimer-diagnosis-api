package com.benediht.msuser.models.entities;

import com.benediht.msuser.models.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "tb_users")
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String email;
    private String password;
    private Role role;
    @CreationTimestamp
    private LocalDateTime cratedAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;
}