package wafa.finetude.formation.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import wafa.finetude.formation.entities.Employe;
import wafa.finetude.formation.repos.EmployeRepository;

public class EmployeServiceImpl implements EmployeService {
  
    @Autowired
    EmployeRepository employeRepository;

    @Override
    public Employe saveEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public Employe updateEmploye(Employe employe) {
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
    public List<Employe> findByNomEmploye(String nom) {
        return employeRepository.findByUsername(nom);
    }

}
