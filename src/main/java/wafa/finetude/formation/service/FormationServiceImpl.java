package wafa.finetude.formation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wafa.finetude.formation.entities.Categorie;
import wafa.finetude.formation.entities.Formateur;
import wafa.finetude.formation.entities.Formation;
import wafa.finetude.formation.repos.FormationRepository;

@Service
public class FormationServiceImpl implements FormationService {

    @Autowired
    FormationRepository formationRepository;

    @Override
    public Formation saveFormation(Formation formation) {
        return formationRepository.save(formation);
    }

    @Override
    public Formation updateFormation(Formation formation) {
        return formationRepository.save(formation);
    }

    @Override
    public void deleteFormation(Formation formation) {
        formationRepository.delete(formation);
    }

    @Override
    public void deleteformationById(Long id) {
        formationRepository.deleteById(id);
    }

    @Override
    public Formation getFormation(Long id) {
        return formationRepository.findById(id).get();
    }

    @Override
    public List<Formation> getAllFormations() {
        return formationRepository.findAll();
    }

    @Override
    public List<Formation> findByTitre(String titre) {
        return formationRepository.findByTitre(titre);
    }

    @Override
    public List<Formation> findByFormateur(Formateur formateur) {
        return formationRepository.findByFormateur(formateur);
    }

    @Override
    public List<Formation> findByFormateurNom(String nom) {
        return formationRepository.findByFormateurUsername(nom);
    }

    @Override
    public List<Formation> findByFormateurId(Long id) {
        return formationRepository.findByFormateurId(id);
    }

    @Override
    public List<Formation> findByCategorieNomCat(String nomCat){
        return formationRepository.findByCategorieNomCat(nomCat);
    }

}
