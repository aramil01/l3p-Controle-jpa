package fr.ekinci.demojpa.model;

import javax.persistence.*;
import java.util.Date;

/**
 CREATE TABLE Film (
 id integer,
 realisateur varchar,
 name varchar,
 acteurs_pricipaux varchar,
 categorie varchar,
 Date_Sortie Date,
 Duree integer
 Classification varchar,
 CONSTRAINT pk_Film PRIMARY KEY(id)
 );

 CREATE SEQUENCE sequence_Film OWNED BY Film.id;
 */
@Entity
@Table(name = "Film")
public class FilmEntity {
    @Id
    @GeneratedValue(generator = "sequence_Film")
    private Long id;

    private String name;
    private String realisateur;
    private String acteurs_pricipaux;
    private String categorie;
    private Date Date_Sortie;
    private int Duree;
    private String Classification;

    @OneToMany(mappedBy = "Film")
    private SalleEntity Salle;

    @OneToMany(mappedBy = "Film")
    private SeanceEntity Seance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealisateur() {
        return realisateur;
    }
    public void setRealisateur (String realisateur) {
        this.realisateur = realisateur;
    }

    public String getActeurs_pricipaux() {
        return Acteurs_pricipaux;
    }
    public void setActeurs_pricipaux (String Acteurs_pricipaux) { this.Acteurs_pricipaux = Acteurs_pricipaux; }

    public String getCategorie() {
        return Categorie;
    }
    public void setCategorie (String Categorie) {
        this.Categorie = Categorie;
    }

    public Date getDate_Sortie() { return Date_Sortie;}
    public void setDate_Sortie (Date Date_Sortie) { this.Date_Sortie = Date_Sortie;}

    public Integer getDuree() { return Duree;}
    public void setDuree(int Duree) { this.Duree = Duree;}

    public String getClassification() {
        return Classification;
    }
    public void setClassification (String Classification) {
        this.Classification = Classification;
    }


    public SeanceEntity getSeance() { return Seance; }
}
