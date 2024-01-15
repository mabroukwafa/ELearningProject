package wafa.finetude.formation.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

/**
 * La classe Admin éxtend de la classe User, représentant un administrateur dans le système.
 * Elle est annotée comme une entité JPA(@Entity), ce qui signifie qu'elle sera mappée à une table de base de données.
 */

@Entity
public class Admin extends User {

    @OneToMany(mappedBy = "admin")
    private List<AttributionFormation> attributionsEffectuees;

    public Admin() {
        super();
    }

    public Admin(String nom, String email, String password) {
        super(nom, email, password);
    }

    public Admin(String nom, String email, List<AttributionFormation> attributionsEffectuees, String password) {
        super(nom, email, password);
        this.attributionsEffectuees = attributionsEffectuees;
    }

    public List<AttributionFormation> getAttributionsEffectuees() {
        return attributionsEffectuees;
    }

    public void setAttributionsEffectuees(List<AttributionFormation> attributionsEffectuees) {
        this.attributionsEffectuees = attributionsEffectuees;
    }

}
