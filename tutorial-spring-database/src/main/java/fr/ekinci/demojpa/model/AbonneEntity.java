
package fr.ekinci.demojpa.model;

import javax.persistence.*;
import java.util.Date;

/**
 CREATE TABLE Abonne (
 id integer,
 name varchar,
 Date_naiss Date,
 CONSTRAINT pk_Abonne PRIMARY KEY(id)
 );

 CREATE SEQUENCE sequence_Abonne OWNED BY Abonne.id;
 */
@Entity
@Table(name = "Abonne")
public class AbonneEntity {
    @Id
    @GeneratedValue(generator = "sequence_Abonne")
    private Long id;

    private String name;

    private Date date_naiss;

    @OneToMany(mappedBy = "Abonne")
    private SeanceEntity Seance;



    public Long getId() { return id; }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Date getDate_naiss() { return Date_naiss;}
    public void setDate_naiss(Date Date_naiss) {this.Date_naiss = Date_naiss;}

    public SeanceEntity getSeance() { return Seance; }
}

}
