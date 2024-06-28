package tn.esprit.rh.achat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import tn.esprit.rh.achat.entities.CategorieProduit;
import tn.esprit.rh.achat.repositories.CategorieProduitRepository;
import tn.esprit.rh.achat.services.CategorieProduitServiceImpl;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

public class CategorieProduitServiecImplTest {
    @Mock
    CategorieProduitRepository categorieProduitRepository;
    @InjectMocks
    CategorieProduitServiceImpl categorieProduitService;
    CategorieProduit categorieProduit;
    @BeforeEach
    void setUp(){
        MockitoAnnotations.initMocks(this);
        categorieProduit=new CategorieProduit();
        categorieProduit.setIdCategorieProduit(1L);
        categorieProduit.setLibelleCategorie("aaa");
        categorieProduit.setCodeCategorie("bbb");
    }
    @Test
    void retrieveAllCategories(){
        when(categorieProduitRepository.findAll())
                .thenReturn(Arrays.asList(categorieProduit));
        List<CategorieProduit> result=categorieProduitService.retrieveAllCategorieProduits();
        assertNotNull(result);
        assertEquals(1,result.size());

    }
}
