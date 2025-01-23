package org.example.entities;


import org.example.enumeration.TipoEvento;
import org.example.enumeration.TipoGenere;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Concerto extends Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @Enumerated(EnumType.STRING)
    private TipoGenere genere;


    private boolean inStreaming;

    public Concerto(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassimoPartecipanti, Location location, TipoGenere genere, boolean inStreaming) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti, location);
        this.genere = genere;
        this.inStreaming = inStreaming;
    }

    public Concerto() {
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    public TipoGenere getGenere() {
        return genere;
    }

    public void setGenere(TipoGenere genere) {
        this.genere = genere;
    }

    public boolean isInStreaming() {
        return inStreaming;
    }

    public void setInStreaming(boolean inStreaming) {
        this.inStreaming = inStreaming;
    }

    @Override
    public String toString() {
        return "Concerto{" +
                "id=" + id +
                ", genere=" + genere +
                ", inStreaming=" + inStreaming +
                '}';
    }
}

