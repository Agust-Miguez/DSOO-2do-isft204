package DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import entitys.rooms;
import java.util.ArrayList;
import javax.persistence.TypedQuery;


public class rooms_DAO implements DAO<rooms> {

    
     /*funciona*/
    @Override
    public List<rooms> listall() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory ("hotel");
        EntityManager em = emf.createEntityManager();
        List <rooms> room = new ArrayList <> ();
    
    try {
        em.getTransaction().begin();  
        TypedQuery<rooms> query = em.createQuery("SELECT p FROM rooms p", rooms.class);
        room = query.getResultList();
        em.getTransaction().commit();
    }       
    catch (Exception e) {
        
        System.out.println ("error");
        em.getTransaction().rollback();
    }             
    finally {
        em.close();
    }
    return room;
    }
   
    @Override
    public void update(Long id, rooms p){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory ("hotel");
        EntityManager em = emf.createEntityManager();
        
    try {
        em.getTransaction().begin();
        
        rooms r_Upd = em.find( rooms.class , id);
        r_Upd.setDisponibilidad(p.getDisponibilidad());
        r_Upd.setDouble_Bed(p.getDouble_Bed());
        r_Upd.setPrice_For_Day(p.getPrice_For_Day());
        r_Upd.setSingle_Bed(p.getSingle_Bed());
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
    public rooms getById(Long id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory ("hotel");
        EntityManager em = emf.createEntityManager();
        rooms p= new rooms ();
    
    try{
        p = em.find(rooms.class, id);
        

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
    public void save(rooms rooms) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory ("hotel");
        EntityManager em = emf.createEntityManager();
        

        
       try {
           em.getTransaction().begin();  
           em.persist(rooms);
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
        rooms p =  em.find(rooms.class, i);
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