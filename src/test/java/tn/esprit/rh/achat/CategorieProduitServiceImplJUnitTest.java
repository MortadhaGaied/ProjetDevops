package tn.esprit.rh.achat;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.rh.achat.entities.CategorieProduit;
import tn.esprit.rh.achat.services.ICategorieProduitService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@Slf4j
@SpringBootTest
class CategorieProduitServiceImplJUnitTest {/*
    @Autowired
    ICategorieProduitService categorieProduitService;
    @Test
    void testAddCategorieProduit(){
        CategorieProduit categorieProduit=new CategorieProduit();
        categorieProduit.setLibelleCategorie("aaa");
        categorieProduit.setCodeCategorie("bbb");
        log.info("test add new categorie");
        CategorieProduit result=categorieProduitService.addCategorieProduit(categorieProduit);
        log.info("assert that categorie produit id is not null");
        assertNotNull(result.getIdCategorieProduit());
        log.info("assert that categorie produit code is the same");
        assertEquals(result.getCodeCategorie(),categorieProduit.getCodeCategorie());
        log.info("delete categorie produit test");
        categorieProduitService.deleteCategorieProduit(result.getIdCategorieProduit());
    }*/
}
