package com.talentoTechGrupo3.redComunitaria.users.entities;

import jakarta.persistence.DiscriminatorValue;

@DiscriminatorValue("EXPLORER")

public class Explorer extends User{

    private String fullName;
    private String contact;

}
