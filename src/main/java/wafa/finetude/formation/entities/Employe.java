package wafa.finetude.formation.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

/**
 * La classe Employe éxtend de la classe User et représente un employé dans le
 * système.
 * Elle est annotée comme une entité JPA pour être mappée à une table de base de
 * données.
 */

@Entity
public class Employe extends User {

    // Liste des formations auxquelles l'employé est associé.
    // Utilisation de l'annotation @ManyToMany pour représenter une relation
    // plusieurs-à-plusieurs
    // entre Employe et Formation.
    @ManyToMany(mappedBy = "employes")
    @JsonIgnore
    List<Formation> formations;

    // Liste des questions posées par l'employé.
    // Utilisation de l'annotation @OneToMany pour indiquer une relation
    // un-à-plusieurs
    // entre Employe et Question.
    @OneToMany(mappedBy = "employe")
    @JsonIgnore
    List<Question> questions;

    // Liste des attributions de formations à cet employé.
    // La relation est gérée par l'entité AttributionFormation.
    @OneToMany(mappedBy = "employe")
    @JsonIgnore
    private List<AttributionFormation> attributions;

    public Employe(List<Formation> formations, List<Question> questions,
            List<AttributionFormation> attributions) {

        this.formations = formations;
        this.questions = questions;
        this.attributions = attributions;
    }

    public Employe(String nom, String email, String status, List<Formation> formations, List<Question> questions,
            List<AttributionFormation> attributions, String password) {
        super(nom, email, password);
        this.formations = formations;
        this.questions = questions;
        this.attributions = attributions;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public List<AttributionFormation> getAttributions() {
        return attributions;
    }

    public void setAttributions(List<AttributionFormation> attributions) {
        this.attributions = attributions;
    }

    public Employe(String nom, String email, String password) {
        super(nom, email, password);
    }

    public Employe() {
        super();
    }

    public List<Formation> getFormations() {
        return formations;
    }

    public void setFormations(List<Formation> formations) {
        this.formations = formations;
    }

}
