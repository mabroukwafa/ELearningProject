package wafa.finetude.formation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wafa.finetude.formation.entities.Admin;
import wafa.finetude.formation.repos.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminRepository adminRepository;

    @Override
    public Admin saveAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public Admin updateAdmin(Admin admin) {
        return adminRepository.save(admin);

    }

    @Override
    public void deleteAdmin(Admin admin) {
        adminRepository.delete(admin);
    }

    @Override
    public void deleteAdmintById(Long id) {
        adminRepository.deleteById(id);
    }

    @Override
    public Admin getAdmin(Long id) {
        return adminRepository.findById(id).get();
    }

    @Override
    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    @Override
    public List<Admin> findByUsername(String nom) {
        return adminRepository.findByUsername(nom);
    }

}
