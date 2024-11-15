/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entitys.DAOimplements.passenger_DAOImpl;
import entitys.passenger;
import java.util.List;

/**
 *
 * @author feffo
 */
public class PassengerService {
    private static PassengerService instance = null;
    private final passenger_DAOImpl dao;

    public PassengerService (){
        this.dao = passenger_DAOImpl.getInstance ();
    }
    
  
    public PassengerService getInstance() {
        if ( PassengerService.instance == null ) {
            PassengerService.instance = new PassengerService();
        }
        
        return instance;
    }
    
    public void deleteService (Long i){
        this.dao.delete(i);
}
    
    public void PassengerSave(passenger d) {
        this.dao.save(d);
    }
    
    public List<passenger> listPassengee() {
        return this.dao.listall();
    }
    
    public void updateService (Long i, passenger d){
        this.dao.update(i, d);
        
    }
     public passenger getByIdService(Long id) {
        return this.dao.getById((id));
    }
           
 }

    