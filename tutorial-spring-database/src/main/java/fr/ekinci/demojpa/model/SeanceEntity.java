package fr.ekinci.demojpa.model;

import javax.persistence.*;

/**
 CREATE TABLE Seance (
 id integer,
 name varchar,
 langue varchar,
 prix float,
 CONSTRAINT pk_Salle PRIMARY KEY(id)
 );

 CREATE SEQUENCE sequence_Seance OWNED BY Seance.id;
 */
@Entity
@Table(name = "Seance")
public class SeanceEntity {
    @Id
    @GeneratedValue(generator = "sequence_Seance")
    private Long id;

    private String name;
    private String Langue;

    private Float prix;

    @OneToOne(mappedBy = "Seance")
    private FilmEntity Film;

    @OneToMany(mappedBy = "Seance")
    private AbonneEntity Abonne;

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

    public String getLangue() {
        return Langue;
    }

    public void setLangue(String Langue) {
        this.Langue = Langue;
    }

    public Float getPrix() { return prix; }
    public void setPrix(Float prix) {
        this.prix= prix;
    }


    public getAbonne getAbonne() { return Abonne; }
}

}
