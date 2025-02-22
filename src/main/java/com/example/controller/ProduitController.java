package com.example.controller;

// Classe ProduitController
import com.example.dto.ProduitDto;
import com.example.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/produits")
public class ProduitController {

    @Autowired
    private ProduitService produitService;

    @GetMapping("/user")
    public List<ProduitDto> getAllProduits() {
        return produitService.getAllProduits();
    }

    @GetMapping("/{id}")
    public ProduitDto getProduitById(@PathVariable Long id) {
        return produitService.getProduitById(id);
    }

    @PostMapping("/admin")
    public ProduitDto createProduit(@RequestBody ProduitDto produitDto) {
        return produitService.createProduit(produitDto);
    }

    @PutMapping("/{id}")
    public ProduitDto updateProduit(@PathVariable Long id, @RequestBody ProduitDto produitDto) {
        return produitService.updateProduit(id, produitDto);
    }

    @DeleteMapping("/{id}")
    public void deleteProduit(@PathVariable Long id) {
        produitService.deleteProduit(id);
    }
}