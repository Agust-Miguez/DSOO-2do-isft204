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
import javax.persistence.TypedQuery;



public class passanger_DAO implements DAO<passengers>{
    
     /*funciona*/
    @Override
    public List<passengers> listall() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory ("hotel");
        EntityManager em = emf.createEntityManager();
        List <passengers> pass = new ArrayList <> ();
    
    try {
        em.getTransaction().begin();  
        TypedQuery<passengers> query = em.createQuery("SELECT p FROM passengers p", passengers.class);
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
    public void update(Long id, passengers p){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory ("hotel");
        EntityManager em = emf.createEntityManager();
        
    try {
        em.getTransaction().begin();
        
        passengers p_Upd = em.find( passengers.class , id);
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
    public passengers getById(Long id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory ("hotel");
        EntityManager em = emf.createEntityManager();
        passengers p= new passengers ();
    
    try{
        p = em.find(passengers.class, id);
        

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
    public void save(passengers passenger) {
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
        passengers p =  em.find(passengers.class, i);
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

