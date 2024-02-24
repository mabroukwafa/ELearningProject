package wafa.finetude.formation.service;

import java.util.List;

import wafa.finetude.formation.entities.Employe;

public interface EmployeService {

    Employe saveEmploye(Employe employe);

    Employe updateEmploye(Employe employe);

    void deleteEmploye(Employe employe);

    void deleteEmployeById(Long id);

    Employe getEmploye(Long id);

    List<Employe> getAllEmployes();

    List<Employe> findByUsername(String nom);

}
