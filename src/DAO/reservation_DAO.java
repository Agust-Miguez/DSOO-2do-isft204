
package DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import entitys.reservation;
import java.util.ArrayList;
import javax.persistence.TypedQuery;

/**
 *
 * @author feffo
 */
public class reservation_DAO implements DAO <reservation> {
    
@Override
    public List<reservation> listall() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory ("hotel");
        EntityManager em = emf.createEntityManager();
        List <reservation> pass = new ArrayList <> ();
    
    try {
        em.getTransaction().begin();  
        TypedQuery<reservation> query = em.createQuery("SELECT p FROM reservation p", reservation.class);
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
    public void update(Long id, reservation p){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory ("hotel");
        EntityManager em = emf.createEntityManager();
        
    try {
        em.getTransaction().begin();
        
        reservation r_Upd = em.find( reservation.class , id);
        r_Upd.setDate_Check_In(p.getDate_Check_In());
        r_Upd.setDate_Chek_Out(p.getDate_Chek_Out());
        
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
    public reservation getById(Long id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory ("hotel");
        EntityManager em = emf.createEntityManager();
        reservation p= new reservation ();
    
    try{
        p = em.find(reservation.class, id);
        

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
    public void save(reservation reservation) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory ("hotel");
        EntityManager em = emf.createEntityManager();
        

        
       try {
           em.getTransaction().begin();  
           em.persist(reservation);
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
        reservation p =  em.find(reservation.class, i);
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
