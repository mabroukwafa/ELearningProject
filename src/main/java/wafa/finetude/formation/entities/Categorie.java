package wafa.finetude.formation.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCat;
    private String nomCat;

    @JsonIgnore
    @OneToMany(mappedBy = "categorie")
    @JsonIgnoreProperties("categorie")
    private List<Formation> formations;

    public Categorie(Long idCat, String nomCat, List<Formation> formations) {
        this.idCat = idCat;
        this.nomCat = nomCat;
        this.formations = formations;
    }

    public Categorie(Long idCat, String nomCat) {
        this.idCat = idCat;
        this.nomCat = nomCat;
    }

    public Categorie() {
        super();
    }

    public Long getIdCat() {
        return idCat;
    }

    public void setIdCat(Long idCat) {
        this.idCat = idCat;
    }

    public String getNomCat() {
        return nomCat;
    }

    public void setNomCat(String nomCat) {
        this.nomCat = nomCat;
    }

    public List<Formation> getFormations() {
        return formations;
    }

    public void setFormations(List<Formation> formations) {
        this.formations = formations;
    }

}
