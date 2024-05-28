package riwi.RiwiApp.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import riwi.RiwiApp.enums.Role;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

@Entity(name = "user")
public class UserEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true, length = 150)
    private String userName;
    @Column(nullable = false, length = 150)
    private String password;
    @Column(nullable = false, unique = true, length = 150)
    private String email;
    @Column(nullable = false, length = 150)
    private String fullName;
    @Enumerated(EnumType.STRING)
    private Role role;
}
