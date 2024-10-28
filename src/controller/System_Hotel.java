/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controller;
import java.util.List;
import model.dao.p_DAO;
import java.util.ArrayList;
import model.entitys.passenger;



/**
 *
 * @author feffo
 */
public class system_hotel {

   
    public static void main(String[] args) {
        
        
        int a =31256;
        Long o = Long.valueOf(a);
       
        List <passenger> aa = new ArrayList <passenger> ();
        
        p_DAO pdao = new p_DAO ();
        
        passenger p = new passenger ("jdfh","jdfgh",o, o,"jfdgf");
        passenger w = new passenger ("jdfh","jdfgh",o, o,"jfdgf");
        passenger v = new passenger ("jdfh","jdfgh",o, o,"jfdgf");
        passenger c = new passenger ("jdfh","jdfgh",o, o,"jfdgf");
        
        System.out.println(p.toString());
        pdao.save(p);
       
        pdao.save(w);
        pdao.save(c);
        pdao.save(v);
        
        
        aa = pdao.listall();
        
         for (passenger yut : aa) {
            System.out.println(yut);
        }
         
                 
        }
    }
           

        
    
