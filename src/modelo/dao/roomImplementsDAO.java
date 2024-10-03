package modelo.dao;

import Exceptions.DuplicateEntryException;
import Exceptions.NotfoundException;
import modelo.entidades.room;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NamedQuery;
import javax.persistence.Persistence;
import javax.persistence.Query;
import modelo.entidades.rooms;




public class roomImplementsDAO implements DAO<room> {

    private final List <rooms> room;
    
    
    
    public roomsImplementsDAO(List<rooms> room) {
        this.room = new ArrayList<>();
    }

    @Override
    public void save(room data) throws DuplicateEntryException {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory ("system_HotelPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        for (rooms s : this.room) {
            if ( s.getId()== data.getId())
            {
                throw new DuplicateEntryException("Room with ID " + data.getId() + " already exists. Use update to modify.");
            }
        }
        em.persist(data);
        em.getTransaction().commit();
    }

    
    @Override
    public rooms getId(long id) throws NotfoundException {
        for (rooms room : this.room) {
            if (room.getId() == id) {
                return room;
            }
        }
        throw new NotfoundException("Room with ID " + id + " not found.");
    }

    @Override
    public List<room> listall() {
      EntityManagerFactory emf = Persistence.createEntityManagerFactory ("system_HotelPU");
      EntityManager em = emf.createEntityManager();
      em.getTransaction().begin();  
      Query q = em.createNamedQuery("room_finALl");
      List <room> rooms = q.getResultList();
      em.getTransaction().commit();
        return rooms;
    }

    @Override
    public void update(room data) throws NotfoundException {
      EntityManagerFactory emf = Persistence.createEntityManagerFactory ("system_HotelPU");
      EntityManager em = emf.createEntityManager();
      em.getTransaction().begin();  
         for (rooms room : this.room) {
         if ( data.getId()== room.getId() ) {
            throw new NotfoundException("Room with ID " + data.getId() + " not found.");
        }
        em.persist(data);
        em.getTransaction().commit();
    }
  }

    @Override
    public void delete (room data) throws NotfoundException {
      EntityManagerFactory emf = Persistence.createEntityManagerFactory ("system_HotelPU");
      EntityManager em = emf.createEntityManager();
      em.getTransaction().begin();  
        for (rooms room : this.room) {
        if (room.getId() != data.getId() ) {
            throw new NotfoundException("Room with ID " + data.getId() + " not found.");
        }
        em.remove(data);
        em.getTransaction().commit();
    }
 }
    @Override
    public room getById(int id) throws NotfoundException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

    
    
    /*entrega*/