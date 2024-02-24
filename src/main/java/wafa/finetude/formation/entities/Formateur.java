package wafa.finetude.formation.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

/**
 * Entité représentant un Formateur dans le système.
 * Hérite des propriétés et méthodes de la classe User.
 * 
 */
@Entity
public class Formateur extends User {

    // Liste des formations associées à ce formateur.
    // La relation est unidirectionnelle avec suppression orpheline et en cascade.
    @OneToMany(mappedBy = "formateur", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JsonIgnoreProperties("formateur")
    List<Formation> formations;

    // Liste des questions associées à ce formateur.
    // La relation est unidirectionnelle avec suppression orpheline et en cascade.
    @OneToMany(mappedBy = "idQues", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnoreProperties("formateur")
    List<Question> questions;

    public Formateur(List<Formation> formations, List<Question> questions) {
        this.formations = formations;
        this.questions = questions;
    }

    public Formateur(String nom, String email, List<Formation> formations, List<Question> questions, String password) {
        super(nom, email, password);
        this.formations = formations;
        this.questions = questions;
    }

    public Formateur() {
        super();
    }

    // Constructeur avec informations de base du formateur.
    public Formateur(String nom, String email, String password) {
        super(nom, email, password);
    }

    public List<Formation> getFormations() {
        return formations;
    }

    public void setFormations(List<Formation> formations) {
        this.formations = formations;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

}
