package org.example.entities;


import org.example.enumeration.TipoEvento;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity

public class PartitaDiCalcio extends Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String squadraDiCasa;
    private String squadraDiOspite;
    private String squadraVincente;
    private int golCasa;
    private int golOspite;


    public PartitaDiCalcio(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassimoPartecipanti, Location location, String squadraDiCasa, String squadraDiOspite, String squadraVincente, int golCasa, int golOspite) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti, location);
        this.squadraDiCasa = squadraDiCasa;
        this.squadraDiOspite = squadraDiOspite;
        this.squadraVincente = squadraVincente;
        this.golCasa = golCasa;
        this.golOspite = golOspite;
    }

    public PartitaDiCalcio() {
    }

    public String getSquadraDiCasa() {
        return squadraDiCasa;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    public void setSquadraDiCasa(String squadraDiCasa) {
        this.squadraDiCasa = squadraDiCasa;
    }

    public String getSquadraDiOspite() {
        return squadraDiOspite;
    }

    public void setSquadraDiOspite(String squadraDiOspite) {
        this.squadraDiOspite = squadraDiOspite;
    }

    public String getSquadraVincente() {
        return squadraVincente;
    }

    public void setSquadraVincente(String squadraVincente) {
        this.squadraVincente = squadraVincente;
    }

    public int getGolCasa() {
        return golCasa;
    }

    public void setGolCasa(int golCasa) {
        this.golCasa = golCasa;
    }

    public int getGolOspite() {
        return golOspite;
    }

    public void setGolOspite(int golOspite) {
        this.golOspite = golOspite;
    }

    @Override
    public String toString() {
        return "PartitaDiCalcio{" +
                "id=" + id +
                ", squadraDiCasa='" + squadraDiCasa + '\'' +
                ", squadraDiOspite='" + squadraDiOspite + '\'' +
                ", squadraVincente='" + squadraVincente + '\'' +
                ", golCasa=" + golCasa +
                ", golOspite=" + golOspite +
                '}';
    }
}
