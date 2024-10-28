/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotel2;

import DAO.passanger_DAO;
import entitys.passengers;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author feffo
 */
public class Hotel2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      int a = 35;
      Long s = Long.valueOf(a);
      int u = 2;
      Long up = Long.valueOf(u);
      List <passengers> pass_List = new ArrayList <>();
      
      passengers p = new passengers("dfdg","dssdf",s,s,"fsdd");
      passanger_DAO o = new passanger_DAO();
           
      /*o.save(p);*/
     /* o.delete(s);*/
      passengers us = o.getById(up);
      
      
      System.out.println(us.toString());
      
      
      o.update(up, p);
      
      pass_List = o.listall();
      for (passengers x: pass_List){
          System.out.println(x.toString());
      }
      
    }
    
}
