package com.talentoTechGrupo3.redComunitaria.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "events")
@DiscriminatorValue("EVENT")
public class Event extends Publication{


    private String name;
    private String description;
    private LocalDateTime eventDate;
    @Enumerated(EnumType.STRING)
    private EventType eventType;
    private String duration;



}
