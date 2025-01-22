package org.example;
import org.example.dao.EventoDAO;
import org.example.entities.Evento;
import org.example.enumeration.TipoEvento;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

/**

 Hello world!**/
public class Main {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("progettoMavenPersistenza");
    private static EntityManager em = emf.createEntityManager();

    public static void main( String[] args ) {
//        EventoDAO eventoDao = new EventoDAO(em);

        /*Evento ev = new Evento("Lezione Java", LocalDate.now(), "Corso FS0824B", TipoEvento.PRIVATO, 28);
        eventoDao.save(ev);*/

        /*Evento getEv = eventoDao.getByID(1);
        System.out.println(getEv);*/

        // eventoDao.delete(getEv);

    }

}
