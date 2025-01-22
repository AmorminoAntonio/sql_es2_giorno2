package org.example.dao;

import org.example.entities.Evento;

import javax.persistence.EntityManager;

public class PartecipazioneDAO {


    EntityManager em;

    public PartecipazioneDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Evento e) {
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
    }
}
