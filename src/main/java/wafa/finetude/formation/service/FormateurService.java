package wafa.finetude.formation.service;

import java.util.List;

import wafa.finetude.formation.entities.Formateur;

public interface FormateurService {

    Formateur saveFormateur(Formateur formateur);

    Formateur updateFormateur(Formateur formateur);

    void deleteFormateur(Formateur formateur);

    void deleteFormateurById(Long id);

    Formateur getFormateur(Long id);

    List<Formateur> getAllFormateurs();

    List<Formateur> findByUsername(String nom);

    // List<Formateur> findByFormations(Formation formation);
    // List<Formateur> findByFormationsTitre(String titre);
    // List<Formateur> findByCategorie (Categorie categorie);
    // List<Formateur> findByCategorieNom(String nom);
    // List<Produit> findByOrderByNomProduitAsc();
    // List<Produit> trierProduitsNomsPrix();

}
