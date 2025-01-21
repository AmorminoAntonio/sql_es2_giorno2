package org.example;

import entities.Evento;
import entities.scelte;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class EventoDAO {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("progettoMavenPersistenza");
    private static EntityManager em = emf.createEntityManager();

    public static void main(String[] args) {

        LocalDate dataEvento = LocalDate.parse("2025-02-23");

        Evento firstEvent = new Evento("covegno 5 stelle", dataEvento, "Ciao belli, vogliamo mangiarvi in testa anche quest'anno", scelte.Pubblico, 150);
        save(firstEvent);
        getById(10);
        //delete(firstEvent);

        emf.close();
        em.close();

    }

    // metodo SAVE + GETbyID + DELETE;

    public static void save(Evento evento) {
        em.getTransaction().begin();
        em.persist(evento);
        em.getTransaction().commit();
    }

    public static void getById(int id) {
        Evento evento = em.find(Evento.class, id);
        System.out.println(evento);
    }

    public static void delete(Evento evento) {
        em.getTransaction().begin();
        em.remove(evento);
        em.getTransaction().commit();

    }
}
