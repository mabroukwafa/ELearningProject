package wafa.finetude.formation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import wafa.finetude.formation.entities.Formateur;
import wafa.finetude.formation.repos.FormateurRepository;

public class FormateurServiceImpl implements FormateurService {

    @Autowired
    FormateurRepository formateurRepository;

    @Override
    public Formateur saveFormateur(Formateur formateur) {
        return formateurRepository.save(formateur);
    }

    @Override
    public Formateur updateFormateur(Formateur formateur) {
        return formateurRepository.save(formateur);
    }

    @Override
    public void deleteFormateur(Formateur formateur) {
        formateurRepository.delete(formateur);
    }

    @Override
    public void deleteFormateurById(Long id) {
        formateurRepository.deleteById(id);
    }

    @Override
    public Formateur getFormateur(Long id) {
        return formateurRepository.findById(id).get();
    }

    @Override
    public List<Formateur> getAllFormateurs() {
        return formateurRepository.findAll();
    }

    @Override
    public List<Formateur> findByNomFormateur(String nom) {
        return formateurRepository.findByUsername(nom);
    }

    /*
     * @Override
     * public List<Formateur> findByFormations(Formation formation) {
     * return formateurRepository.findByFormations(formation);
     * }
     * 
     * @Override
     * public List<Formateur> findByFormationsTitre(String titre) {
     * return formateurRepository.findByFormationsTitre(titre);
     * }
     */
}
