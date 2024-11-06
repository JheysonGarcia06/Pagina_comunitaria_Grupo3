package com.talentoTechGrupo3.redComunitaria.entity;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "entrepreneurships")
@DiscriminatorValue("ENTREPRENEURSHIP")
public class Entrepreneurship extends Publication {


    private String nameCompany;
    private LocalDate startDate;
    private Double receivedInvestment;
    @Enumerated(EnumType.STRING)
    private TypeSector typeSector;





}
