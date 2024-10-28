/*
package DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import entitys.reservation;

/**
 *
 * @author feffo
 *//*
public class reservation_DAO implements DAO <reservation> {
    
  @Override
  public void save(reservation data) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory ("hotel");
        EntityManager em = emf.createEntityManager();
        
       try {
           em.getTransaction().begin();
           em.persist(data);
           em.getTransaction().commit();   
       }
       catch (Exception e){
           em.getTransaction().rollback();
           }
       finally{
           em.close();

       }
           
       
    }

    @Override
    public List<reservation> listall() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory ("hotel");
        EntityManager em = emf.createEntityManager();
        List <reservation> pass = null;
    
    try {
        em.getTransaction().begin();  
        Query q = em.createNamedQuery("reservation_finALl");
        pass = q.getResultList();
        em.getTransaction().commit();
    }       
    catch (Exception e) {
        em.getTransaction().rollback();
    }             
    finally {
        em.close();
    }
    return pass;
    }
    
    @Override
    public void update(reservation data) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory ("hotel");
        EntityManager em = emf.createEntityManager();
        
    try {
        em.getTransaction().begin();
        Query q = em.createNamedQuery("reservation_update");
        em.persist(data);
        em.getTransaction().commit();   
    }
    catch (Exception e){
        em.getTransaction().rollback();
    }
    finally{
        em.close();

    }
           
       
    }

    @Override
    public void delete(reservation data) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory ("hotel");
        EntityManager em = emf.createEntityManager();
      
    try{
        em.getTransaction().begin();  
        Query q = em.createNamedQuery("reservation_delete");
        em.remove(data);
        em.getTransaction().commit();
    }
    catch (Exception e) {
        em.getTransaction().rollback();
    }
      finally{
        em.close();
      }
    }

    @Override
    public reservation getById(reservation id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory ("hotel");
        EntityManager em = emf.createEntityManager();
    
    
    try{
        em.find(reservation.class, id);
    }
      catch (Exception e) {
        em.getTransaction().rollback();
    }
      finally {
        return em.find(reservation.class, id); 
    }
        }
    }


*/
