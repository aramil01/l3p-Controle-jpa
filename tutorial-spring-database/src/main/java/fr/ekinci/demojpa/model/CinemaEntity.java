package fr.ekinci.demojpa.model;

import javax.persistence.*;

/**
 CREATE TABLE Cinema (
 id integer,
 name varchar,
 CONSTRAINT pk_Cinema PRIMARY KEY(id)
 );

 CREATE SEQUENCE sequence_Cinema OWNED BY Cinema.id;
 */
@Entity
@Table(name = "Cinema")
public class CinemaEntity {
    @Id
    @GeneratedValue(generator = "sequence_Cinema")
    private Long id;

    private String name;

    @OneToOne(mappedBy = "Cinema")
    private SocieteEntity Societe;

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

    public SalleEntity getSalle() { return Salle; }
}
