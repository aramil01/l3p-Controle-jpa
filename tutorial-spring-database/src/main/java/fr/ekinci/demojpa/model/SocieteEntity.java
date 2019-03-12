package fr.ekinci.demojpa.model;


        import javax.persistence.*;

/**
 CREATE TABLE Societe (
 id integer,
 name varchar,
 CONSTRAINT pk_Societe PRIMARY KEY(id)
 );

 CREATE SEQUENCE sequence_Societe OWNED BY Societe.id;
 */
@Entity
@Table(name = "Societe")
public class SocieteEntity {
    @Id
    @GeneratedValue(generator = "sequence_Societe")
    private Long id;

    private String name;

    @OneToMany(mappedBy = "Societe")
    private CinemaEntity Cinema;

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
    public CinemaEntity getCinema() { return Cinema; }

}
