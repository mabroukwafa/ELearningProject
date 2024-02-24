package wafa.finetude.formation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wafa.finetude.formation.entities.Admin;
import wafa.finetude.formation.entities.Categorie;
import wafa.finetude.formation.repos.AdminRepository;
import wafa.finetude.formation.repos.CategorieRepository;

@Service
public class CategorieServiceImpl implements CategorieService {

    @Autowired
    CategorieRepository categorieRepository;

    @Override
    public Categorie saveCategorie(Categorie categorie) {
        return categorieRepository.save(categorie);
    }

    @Override
    public void deleteCategorie(Categorie categorie) {
        categorieRepository.delete(categorie);
    }

    @Override
    public void deleteCategById(Long id) {
        categorieRepository.deleteById(id);
    }

    @Override
    public List<Categorie> getAllCateg(){
        return categorieRepository.findAll();
    }
}
