package fr.ekinci.demojpa.model;

import javax.persistence.*;

/**
 CREATE TABLE Salle (
 id integer,
 name varchar,
 CONSTRAINT pk_Salle PRIMARY KEY(id)
 );

 CREATE SEQUENCE sequence_Salle OWNED BY Salle.id;
 */
@Entity
@Table(name = "Salle")
public class SalleEntity {
    @Id
    @GeneratedValue(generator = "sequence_Salle")
    private Long id;

    private String name;

    private Integer nb_siege;

    @OneToOne(mappedBy = "Salle")
    private CinemaEntity Cinema;

    @OneToMany(mappedBy = "Salle")
    private FilmEntity Film;

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

    public Integer getNb_Siege() { return nb_siege;}

    public void setNb_Siege(Integer nb_siege) {
        this.nb_siege = nb_siege; }

    public FilmEntity getFilm() { return Film; }
}

}
