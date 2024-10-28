package model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.entitys.passenger;
import java.util.ArrayList;
import model.entitys.passenger;


/**
 *
 * @author feffo
 */
public class p_DAO implements DAO<passenger>{
    

    @Override
    public List<passenger> listall() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory ("system_hotel");
        EntityManager em = emf.createEntityManager();
        List <passenger> pass = new ArrayList <passenger> ();
    
    try {
        em.getTransaction().begin();  
        Query q = em.createNamedQuery("pass_finALl");
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
    public void update(passenger passenger) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory ("system_hotel");
        EntityManager em = emf.createEntityManager();
        
    try {
        em.getTransaction().begin();
        em.find( passenger.class , passenger.getId() );
        Query query = em.createQuery("UPDATE passenger p SET p.dni = ID WHERE p.id = :ID");
        query.setParameter(":p", passenger.class );  
        int i = query.executeUpdate(); 
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
    public void delete(passenger passenger) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory ("system_hotel");
        EntityManager em = emf.createEntityManager();
      
    try{
        em.getTransaction().begin();  
        Query q = em.createNamedQuery("pass_delete");
        em.remove(passenger);
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
    public passenger getById(passenger id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory ("system_hotel");
        EntityManager em = emf.createEntityManager();
    
    
    try{
        em.find(passenger.class, id);
        

    }
      catch (Exception e) {
        em.getTransaction().rollback();
    }
      finally {
    }
      return em.find(passenger.class, id);
        

    
  }

    @Override
    public void save(passenger passenger) {
        
        
       try {
           EntityManagerFactory emf = Persistence.createEntityManagerFactory ("system_hotel");
           em = emf.createEntityManager();
           em.getTransaction().begin();
           em.persist(passenger);
           em.getTransaction().commit();   
       }
       catch (Exception e){
           em.getTransaction().begin();
           em.persist(passenger);
           em.getTransaction().commit(); 
           System.out.println ("error");
           em.getTransaction().rollback();
           }
       finally{
           em.close();

       }
    }
  }  

