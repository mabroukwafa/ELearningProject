package wafa.finetude.formation.service;

import java.util.List;

import wafa.finetude.formation.entities.Admin;

public interface AdminService {

    Admin saveAdmin(Admin admin);

    Admin updateAdmin(Admin admin);

    void deleteAdmin(Admin admin);

    void deleteAdmintById(Long id);

    Admin getAdmin(Long id);

    List<Admin> getAllAdmins();

    List<Admin> findByUsername(String nom);
}
