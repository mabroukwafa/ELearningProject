package wafa.finetude.formation.service;

import java.util.List;

import wafa.finetude.formation.entities.Categorie;
import wafa.finetude.formation.entities.Formateur;
import wafa.finetude.formation.entities.Formation;

public interface FormationService {

	Formation saveFormation(Formation formation);

	Formation updateFormation(Formation formation);

	void deleteFormation(Formation formation);

	void deleteformationById(Long id);

	Formation getFormation(Long id);

	List<Formation> getAllFormations();

	List<Formation> findByTitre(String titre);

	List<Formation> findByFormateur(Formateur formateur);

	List<Formation> findByFormateurNom(String nom);

	List<Formation> findByFormateurId(Long id);

	List<Formation> findByCategorieNomCat(String nomcat);

	// List<Produit> findByNomPrix (String nom, Double prix);
	// List<Produit> findByCategorie (Categorie categorie);
	// List<Produit> findByCategorieIdCat(Long id);
	// List<Produit> findByOrderByNomProduitAsc();
	// List<Produit> trierProduitsNomsPrix();

}
