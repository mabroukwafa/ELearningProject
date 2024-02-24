package wafa.finetude.formation.service;

import java.util.List;

import wafa.finetude.formation.entities.Categorie;

public interface CategorieService {

    Categorie saveCategorie(Categorie categorie);

    void deleteCategorie(Categorie categorie);

    List<Categorie> getAllCateg();

    void deleteCategById(Long id);

}
