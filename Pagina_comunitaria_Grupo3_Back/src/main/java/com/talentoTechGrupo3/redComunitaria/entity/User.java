package com.talentoTechGrupo3.redComunitaria.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "roles")
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String email;

    @Column(nullable = false,columnDefinition = "TINYINT")
    private Boolean locked;

    @Column(nullable = false,columnDefinition = "TINYINT")
    private Boolean disabled;

    @OneToMany(mappedBy = "users")
    List<Comment>comments;

    @OneToMany(mappedBy = "users")
    List<Publication>publications;

    @ManyToOne
    private City cities;

}
