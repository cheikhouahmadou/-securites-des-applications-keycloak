package com.example.mapping;

// Classe ProduitMapper
import com.example.Entities.Produit;
import com.example.dto.ProduitDto;
import org.springframework.stereotype.Component;

@Component
public class ProduitMapper {

    // Mapper de Produit vers ProduitDto
    public ProduitDto toDto(Produit produit) {
        if (produit == null) {
            return null;
        }
        return new ProduitDto(produit.getRef(), produit.getName());
    }

    // Mapper de ProduitDto vers Produit
    public Produit toEntity(ProduitDto dto) {
        if (dto == null) {
            return null;
        }
        Produit produit = new Produit();
        produit.setRef(dto.getRef());
        produit.setName(dto.getName());
        return produit;
    }
}
