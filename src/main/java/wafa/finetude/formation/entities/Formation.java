package wafa.finetude.formation.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

/**
 * Entité représentant une formation dans notre système de gestion de formation.
 * 
 * @Entity : annotation JPA pour la persistance de données.
 */
@Table(name = "formation", uniqueConstraints = {
        @UniqueConstraint(columnNames = { "formateur_id", "titre" })
})
@Entity
public class Formation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFor;
    private String titre;
    private String description;
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
    @JsonIgnoreProperties("formations")

    private Formateur formateur;

    // Association OneToMany avec l'entité AttributionFormation.
    // Liste des attributions de la formation.
    @OneToMany(mappedBy = "formation")
    @JsonIgnoreProperties("formations")
    private List<AttributionFormation> attributions;

    @ManyToOne
    @JsonIgnoreProperties("formations")
    private Categorie categorie;

    public Formation(String titre, String description, Formateur formateur, Categorie categorie) {

        this.titre = titre;
        this.description = description;
        this.formateur = formateur;
        this.categorie = categorie;

    }

    // Constructeur complet avec tous les champs.
    public Formation(Long idFor, String titre, String description, List<Employe> employes, Formateur formateur,
            Categorie categorie, List<AttributionFormation> attributions) {
        this.idFor = idFor;
        this.titre = titre;
        this.description = description;
        this.employes = employes;
        this.formateur = formateur;
        this.attributions = attributions;
        this.categorie = categorie;
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

    public String getDescription() {
        return description;
    }

    public void setDescriprion(String description) {
        this.description = description;
    }

    public List<AttributionFormation> getAttributions() {
        return attributions;
    }

    public void setAttributions(List<AttributionFormation> attributions) {
        this.attributions = attributions;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

}
