package com.example.dto;

// Classe ProduitDto (Data Transfer Object)
public class ProduitDto {
    private String ref;
    private String name;

    // Constructeurs
    public ProduitDto() {}

    public ProduitDto(String ref, String name) {
        this.ref = ref;
        this.name = name;
    }

    // Getters et Setters
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}