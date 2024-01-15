package wafa.finetude.formation.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

/**
 * Entité représentant une formation dans notre  système de gestion de formation.
 * @Entity : annotation JPA pour la persistance de données.
 */
@Entity
public class Formation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFor;
    private String titre;
    private String descriprion;
    // private ContenuNumerique contenuNumerique;

     // Association ManyToMany avec l'entité Employe.
    // Définit une table de jointure pour relier les employés aux formations.
    @ManyToMany
    @JoinTable(name = "employe_formation", joinColumns = @JoinColumn(name = "formation_id"), inverseJoinColumns = @JoinColumn(name = "employe_id"))
    private List<Employe> employes;

    // Association ManyToOne avec l'entité Formateur.
    // Chaque formation est associée à un formateur.
    @ManyToOne
    @JoinColumn(name = "formateur_id")
    private Formateur formateur;

    // Association OneToMany avec l'entité AttributionFormation.
    // Liste des attributions de la formation.
    @OneToMany(mappedBy = "formation")
    private List<AttributionFormation> attributions;

    public Formation(String titre, String descriprion, Formateur formateur) {

        this.titre = titre;
        this.descriprion = descriprion;
        this.formateur = formateur;

    }
    // Constructeur complet avec tous les champs.
    public Formation(Long idFor, String titre, String descriprion, List<Employe> employes, Formateur formateur,
            List<AttributionFormation> attributions) {
        this.idFor = idFor;
        this.titre = titre;
        this.descriprion = descriprion;
        this.employes = employes;
        this.formateur = formateur;
        this.attributions = attributions;
    }

    public Formation() {
        super();

    }

    public Long getIdFor() {
        return idFor;
    }

    public void setIdFor(Long idFor) {
        this.idFor = idFor;
    }

    public List<Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(List<Employe> employes) {
        this.employes = employes;
    }

    public Formateur getFormateur() {
        return formateur;
    }

    public void setFormateur(Formateur formateur) {
        this.formateur = formateur;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescriprion() {
        return descriprion;
    }

    public void setDescriprion(String descriprion) {
        this.descriprion = descriprion;
    }

    public List<AttributionFormation> getAttributions() {
        return attributions;
    }

    public void setAttributions(List<AttributionFormation> attributions) {
        this.attributions = attributions;
    }

}
