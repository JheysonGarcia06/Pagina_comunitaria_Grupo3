package com.talentoTechGrupo3.redComunitaria.entity;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "publications")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "type_publication")
public abstract class Publication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;

    @Enumerated(EnumType.STRING)
    private ReactionType reactionType;

    @ManyToOne
    private User users;

    @OneToMany(mappedBy = "publication")
    List<Comment>comments;


}
