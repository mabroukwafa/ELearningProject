package wafa.finetude.formation.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.ManyToOne;
/**
 * Entité représentant une question dans le système.
 * Cette classe est destinée à stocker des questions liées à des formations spécifiques .
 */
@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idQues;
    private String content;
    private String repense;

    // Relation ManyToOne avec l'entité Formateur.
    // Indique le formateur destinataire de la question.
    @ManyToOne
    @JoinColumn(name = "formateur_id")
    private Formateur formateur;// destinataire

     // Relation ManyToOne avec l'entité Employe.
    // Indique l'employé qui a posé la question.
    @ManyToOne
    @JoinColumn(name = "employe_id")
    private Employe employe;

    // Relation ManyToOne avec l'entité Formation.
    // Associe la question à une formation spécifique.
    @ManyToOne
    @JoinColumn(name = "formation_id")
    private Formation formation;

    public Question(Long idQues, String content, String repense, Formateur formateur, Employe employe,
            Formation formation) {
        this.idQues = idQues;
        this.content = content;
        this.repense = repense;
        this.formateur = formateur;
        this.employe = employe;
        this.formation = formation;
    }

    public Long getIdQues() {
        return idQues;
    }

    public void setIdQues(Long idQues) {
        this.idQues = idQues;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Formateur getFormateur() {
        return formateur;
    }

    public void setFormateur(Formateur formateur) {
        this.formateur = formateur;
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

    public String getRepense() {
        return repense;
    }

    public void setRepense(String repense) {
        this.repense = repense;
    }

}
