package com.csc340.crud_api;

import jakarta.persistence.*;

@Entity
@Table(name = "pokemon")
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long characterId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    private String type;
    private String ability;

    // Empty constructor (required by JPA)
    public Pokemon() {}

    // Constructor with all fields
    public Pokemon(String name, String description, String type, String ability) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.ability = ability;
    }

    // Getters and Setters
    public Long getCharacterId() { return characterId; }
    public void setCharacterId(Long characterId) { this.characterId = characterId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getAbility() { return ability; }
    public void setAbility(String ability) { this.ability = ability; }
}