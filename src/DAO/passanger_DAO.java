package DAO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import entitys.passengers;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class passanger_DAO implements DAO<passengers>{
    

    @Override
    public List<passengers> listall() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory ("hotel");
        EntityManager em = emf.createEntityManager();
        List <passengers> pass = new ArrayList <> ();
    
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
    public void update(passengers passenger) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory ("hotel");
        EntityManager em = emf.createEntityManager();
        
    try {
        em.getTransaction().begin();
        em.find( passengers.class , passenger.getId() );
        Query query = em.createQuery("UPDATE passenger p SET p.dni = ID WHERE p.id = :ID");
        query.setParameter(":p", passengers.class );  
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
    public void delete(passengers passenger) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory ("hotel");
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
    public passengers getById(passengers id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory ("hotel");
        EntityManager em = emf.createEntityManager();
    
    
    try{
        em.find(passengers.class, id);
        

    }
      catch (Exception e) {
        em.getTransaction().rollback();
    }
      finally {
    }
      return em.find(passengers.class, id);
        

    
  }

    @Override
    public void save(passengers passenger) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory ("hotel");
        EntityManager em = emf.createEntityManager();
        

        
       try {
           em.getTransaction().begin();  
           em.persist(passenger);
           
       }
       catch (Exception e){
           System.out.println ("error");
           em.getTransaction().rollback();
           }
       finally{
           em.getTransaction().commit();
           System.out.println ("HDP");
           em.close();

       }
    }
  }  

