/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import entitys.passenger;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ChangeListener;
import panels.pass_P;

public class controller_Passanger implements ActionListener{
    private passenger p = new passenger ();
    private pass_P  panel = new pass_P ();     

    public controller_Passanger(passenger passp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
   public void startP (){
       panel.getButtonAdd().addActionListener(this);
       panel.getDelbutton().addActionListener(this);
       panel.getModbutton().addActionListener(this);
       panel.getSeabutton1().addActionListener(this);
       panel.getSeaIDbutton().addActionListener(this);
       panel.setLocationRelativeTo(null);
       panel.setVisible(true);
   }

    public controller_Passanger(passenger p, pass_P panel) {
        this.p = new passenger ();
        this.panel = new pass_P ();
    } 
    
    
    
    public void actionPerformed(ActionEvent e) {
                        
    }
    
    
}
