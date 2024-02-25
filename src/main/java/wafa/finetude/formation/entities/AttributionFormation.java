package wafa.finetude.formation.entities;

import java.time.LocalDate;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

/**
 * La classe AttributionFormation représente l'attribution d'une formation à un
 * employé.
 * Elle est annotée comme une entité JPA pour être mappée à une table dans la
 * base de données.
 */

@Entity
public class AttributionFormation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAttri;

    @ManyToMany
    // @JoinTable(name = "employe_attribution", joinColumns = @JoinColumn(name =
    // "formation_id"), inverseJoinColumns = @JoinColumn(name = "employe_id"))
    @JsonIgnoreProperties("attributions")
    private List<Employe> employe;

    @ManyToOne
    @JoinColumn(name = "formation_id")
    @JsonIgnoreProperties("attributions")
    private Formation formation;

    @ManyToOne
    @JoinColumn(name = "admin_id")
    @JsonIgnoreProperties("attributionsEffectuees")
    private Admin admin;

    private LocalDate dateAttribution;

    public AttributionFormation() {
    }

    public long getIdAttri() {
        return idAttri;
    }

    public void setIdAttri(long idAttri) {
        this.idAttri = idAttri;
    }

    public List<Employe> getEmployes() {
        return employe;
    }

    public void setEmployes(List<Employe> employes) {
        this.employe = employes;
    }

    public Formation getFormation() {
        return formation;
    }

    public void setFormation(Formation formation) {
        this.formation = formation;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public LocalDate getDateAttribution() {
        return dateAttribution;
    }

    public void setDateAttribution(LocalDate dateAttribution) {
        this.dateAttribution = dateAttribution;
    }

}
