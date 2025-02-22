package com.example.service;

// Classe ProduitService
import com.example.Entities.Produit;
import com.example.dto.ProduitDto;
import com.example.mapping.ProduitMapper;
import com.example.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProduitService {

    @Autowired
    private ProduitRepository produitRepository;

    @Autowired
    private ProduitMapper produitMapper;

    public List<ProduitDto> getAllProduits() {
        return produitRepository.findAll()
                .stream()
                .map(produitMapper::toDto)
                .collect(Collectors.toList());
    }

    public ProduitDto getProduitById(Long id) {
        return produitRepository.findById(id)
                .map(produitMapper::toDto)
                .orElse(null);
    }

    public ProduitDto createProduit(ProduitDto produitDto) {
        Produit produit = produitMapper.toEntity(produitDto);
        produit = produitRepository.save(produit);
        return produitMapper.toDto(produit);
    }

    public ProduitDto updateProduit(Long id, ProduitDto produitDto) {
        return produitRepository.findById(id)
                .map(existingProduit -> {
                    existingProduit.setRef(produitDto.getRef());
                    existingProduit.setName(produitDto.getName());
                    Produit updatedProduit = produitRepository.save(existingProduit);
                    return produitMapper.toDto(updatedProduit);
                })
                .orElse(null);
    }

    public void deleteProduit(Long id) {
        produitRepository.deleteById(id);
    }
}