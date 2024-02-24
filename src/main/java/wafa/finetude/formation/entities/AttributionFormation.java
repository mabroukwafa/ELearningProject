package wafa.finetude.formation.entities;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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

    @ManyToOne
    @JoinColumn(name = "employe_id")
    @JsonIgnoreProperties("attributions")

    private Employe employe;

    @ManyToOne
    @JoinColumn(name = "formation_id")
    private Formation formation;

    @ManyToOne
    @JoinColumn(name = "admin_id")
    @JsonIgnoreProperties("attributionsEffectuees")

    private Admin admin;

    private LocalDate dateAttribution;

    public AttributionFormation(Long idFor, long idAttri, Employe employe, Formation formation, Admin admin,
            LocalDate dateAttribution) {

        this.idAttri = idAttri;
        this.employe = employe;
        this.formation = formation;
        this.admin = admin;
        this.dateAttribution = dateAttribution;
    }

    public AttributionFormation() {
    }

    public long getIdAttri() {
        return idAttri;
    }

    public void setIdAttri(long idAttri) {
        this.idAttri = idAttri;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
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
