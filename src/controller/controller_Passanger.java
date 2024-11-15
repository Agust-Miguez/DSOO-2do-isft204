/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import entitys.passenger;
import java.awt.event.ActionEvent;
import service.PassengerService;
import table_Model.Pass_Table_Model;


public class controller_Passanger{
   
private PassengerService PassengerService ;

    public controller_Passanger(PassengerService PassengerService) {    
        this.PassengerService = PassengerService;
           }
   
    
 
    public void add (String name, String last_Name, Long dni, String email, Long phone){
        if (PassengerService.getInstance() == null) {
            PassengerService.getInstance();
        }
        
        passenger p = new passenger (name,last_Name,dni,phone, email);
        PassengerService.PassengerSave(p);
    }

    public controller_Passanger() {
    }
    }
  
       
   
    
