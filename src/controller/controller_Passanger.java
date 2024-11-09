/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.passenger_DAO;
import entitys.passenger;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import panels.pass_P;

public class controller_Passanger implements ActionListener{
    public pass_P  panel = new pass_P ();
    List <passenger> passL = new ArrayList();
    passenger_DAO p_Dao = new passenger_DAO ();
    passenger p = new passenger ();
    JTable tableP = panel.getTable_pass();

    public controller_Passanger(passenger pass_P) {
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
    
    public void add (){
        String name = panel.getV_name().getText();
        String last_Name = panel.getV_name().getText();
        Long dni = Long.valueOf(panel.getV_dni().getText());
        String email = panel.getV_email().getText();
        Long phone = Long.valueOf(panel.getV_phone().getText());
        
        passenger x = new passenger (name, last_Name, dni, phone, email);
        p_Dao.save(x);
        String[] columnas = {"ID" ,"Nombre", "Apellido", "DNI", "Email", "Telefono"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
        tableP = new JTable(modelo);
        modelo.addRow(Objetc[] fila = { );
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }
    

    
    
