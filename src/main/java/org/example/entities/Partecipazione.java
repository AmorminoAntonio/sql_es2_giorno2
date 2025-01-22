package org.example.entities;


import org.example.enumeration.Stato;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "partecipazioni")

public class Partecipazione {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "persona_id")
    private Persona persona;

    @ManyToMany
    @JoinTable(
            name = "persone_partecipazioni",
            joinColumns = @JoinColumn(name = "persona_id"),
            inverseJoinColumns = @JoinColumn(name = "partecipazione_id")
    )
    private List<Persona> listaPartecipanti = new ArrayList<>();

    @Enumerated(EnumType.STRING)
    private Stato stato;


    public Partecipazione() {
    }

    public Partecipazione(Persona persona, List<Persona> listaPartecipanti, Stato stato) {
        this.persona = persona;
        this.listaPartecipanti = listaPartecipanti;
        this.stato = stato;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public List<Persona> getListaPartecipanti() {
        return listaPartecipanti;
    }

    public void setListaPartecipanti(List<Persona> listaPartecipanti) {
        this.listaPartecipanti = listaPartecipanti;
    }

    public Stato getStato() {
        return stato;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }

    @Override
    public String toString() {
        return "Partecipazione{" +
                "id=" + id +
                ", persona=" + persona +
                ", listaPartecipanti=" + listaPartecipanti +
                ", stato=" + stato +
                '}';
    }
}
