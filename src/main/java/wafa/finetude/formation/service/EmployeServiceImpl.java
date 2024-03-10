package wafa.finetude.formation.service;

import java.util.List;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wafa.finetude.formation.entities.Employe;
import wafa.finetude.formation.repos.EmployeRepository;

@Service
public class EmployeServiceImpl implements EmployeService {

    @Autowired
    EmployeRepository employeRepository;

    @Override
    public Employe saveEmploye(Employe employe) {
        String hashedPassword = BCrypt.hashpw(employe.getPassword(), BCrypt.gensalt());
        employe.setPassword(hashedPassword);
        return employeRepository.save(employe);
    }

    @Override
    public Employe updateEmploye(Employe employe) {
        String hashedPassword = BCrypt.hashpw(employe.getPassword(), BCrypt.gensalt());
        employe.setPassword(hashedPassword);
        return employeRepository.save(employe);
    }

    @Override
    public void deleteEmploye(Employe employe) {
        employeRepository.delete(employe);
    }

    @Override
    public void deleteEmployeById(Long id) {
        employeRepository.deleteById(id);
    }

    @Override
    public Employe getEmploye(Long id) {
        return employeRepository.findById(id).get();
    }

    @Override
    public List<Employe> getAllEmployes() {
        return employeRepository.findAll();
    }

    @Override
    public List<Employe> findByUsername(String nom) {
        return employeRepository.findByUsername(nom);
    }

}
