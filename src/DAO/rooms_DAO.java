/*package DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import entitys.rooms;


public class rooms_DAO implements DAO<rooms> {

  @Override
  public void save(rooms data) {
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
    public List<rooms> listall() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory ("hotel");
        EntityManager em = emf.createEntityManager();
        List <rooms> pass = null;
    try {
        em.getTransaction().begin();  
        Query q = em.createNamedQuery("room_finALl");
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
    public void update(rooms data) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory ("hotel");
        EntityManager em = emf.createEntityManager();
        
    try {
        em.getTransaction().begin();
        Query q = em.createNamedQuery("room_update");
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
    public void delete(rooms data) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory ("hotel");
        EntityManager em = emf.createEntityManager();
      
    try{
        em.getTransaction().begin();  
        Query q = em.createNamedQuery("room_delete");
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
    public rooms getById (rooms id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory ("hotel");
        EntityManager em = emf.createEntityManager();
    
    
    try{
        em.find(rooms.class, id);
    }
      catch (Exception e) {
        em.getTransaction().rollback();
    }
      finally {
        return em.find(rooms.class, id); 
    }
        }
    }
*/