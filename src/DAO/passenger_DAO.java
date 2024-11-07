package DAO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import entitys.passenger;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;



public class passenger_DAO implements DAO<passenger>{
    
     /*funciona*/
    @Override
    public List<passenger> listall() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory ("hotel");
        EntityManager em = emf.createEntityManager();
        List <passenger> pass = new ArrayList <> ();
    
    try {
        em.getTransaction().begin();  
        TypedQuery<passenger> query = em.createQuery("SELECT p FROM passengers p", passenger.class);
        pass = query.getResultList();
        em.getTransaction().commit();
    }       
    catch (Exception e) {
        
        System.out.println ("error");
        em.getTransaction().rollback();
    }             
    finally {
        em.close();
    }
    return pass;
    }
   
    @Override
    public void update(Long id, passenger p){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory ("hotel");
        EntityManager em = emf.createEntityManager();
        
    try {
        em.getTransaction().begin();
        
        passenger p_Upd = em.find(passenger.class , id);
        p_Upd.setName(p.getName()); 
        p_Upd.setLast_Name(p.getLast_Name());
        p_Upd.setDni(p.getDni());
        p_Upd.setPhone_Number(p.getPhone_Number());
        p_Upd.setEmail(p.getEmail());
        em.getTransaction().commit();  
    }
    catch (Exception e){
        System.out.println ("error");
        em.getTransaction().rollback();
    }
    finally{
        
        em.close();

    }
           
       
    }

    @Override
    public passenger getById(Long id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory ("hotel");
        EntityManager em = emf.createEntityManager();
        passenger p = em.find(passenger.class , id);
        
    
    try{
        p = em.find(passenger.class, id);
        

    }
      catch (Exception e) {
        em.getTransaction().rollback();
    }
      finally {
    }
      return p ;
        

    
  }
/*funciona*/
    @Override
    public void save(passenger passenger) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory ("hotel");
        EntityManager em = emf.createEntityManager();
        

        
       try {
           em.getTransaction().begin();  
           em.persist(passenger);
           em.getTransaction().commit();
       }
       catch (Exception e){
           System.out.println ("error");
           em.getTransaction().rollback();
           }
       finally{
           em.close();

       }
    }

 
/*funciona*/
    @Override
    public void delete(Long i) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory ("hotel");
        EntityManager em = emf.createEntityManager();
      
    try{
        em.getTransaction().begin();  
        passenger p =  em.find(passenger.class, i);
        em.remove(p);
        em.getTransaction().commit();
    }
    catch (Exception e) {
        em.getTransaction().rollback();
    }
      finally{
        em.close();
      }
    }
  }  

