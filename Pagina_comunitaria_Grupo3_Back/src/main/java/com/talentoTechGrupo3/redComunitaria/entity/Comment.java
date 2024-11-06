package com.talentoTechGrupo3.redComunitaria.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "Comments")
public class Comment  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime creationDate;

    private String content;

    @ManyToOne
    private User users;

    @ManyToOne
    private Publication publication;
}
