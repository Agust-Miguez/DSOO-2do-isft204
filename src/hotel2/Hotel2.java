/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotel2;

import DAO.passanger_DAO;
import entitys.passengers;

/**
 *
 * @author feffo
 */
public class Hotel2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      int a = 123;
      Long s = Long.valueOf(a);
      
      
      passengers p = new passengers("dfg","dsf",s,s,"fd");
      passanger_DAO o = new passanger_DAO();
      o.save(p);
      
      
      
    }
    
}
