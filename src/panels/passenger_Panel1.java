/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package panels;

import entitys.passenger;
import java.awt.LayoutManager;
import java.util.Objects;
import java.util.logging.Logger;
import javax.accessibility.AccessibleContext;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.ComponentUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author feffo
 */
public class passenger_Panel1 extends javax.swing.JPanel {
    DefaultTableModel tablePass = new DefaultTableModel();
    passenger p = new passenger ();
    

    public passenger_Panel1(JButton buttonAdd, JButton delbutton, JLabel jLabel1, JLabel jLabel2, JLabel jLabel3, JLabel jLabel4, JLabel jLabel6, JLabel jLabel7, JScrollPane jScrollPane1, JTable jTable1, JButton modbutton, JButton seaIDbutton, JButton seabutton1, JTextField v_dni, JTextField v_email, JTextField v_lastname, JTextField v_name, JTextField v_phone, LayoutManager layout, boolean isDoubleBuffered) {
        super(layout, isDoubleBuffered);
        this.buttonAdd = buttonAdd;
        this.delbutton = delbutton;
        this.jLabel1 = jLabel1;
        this.jLabel2 = jLabel2;
        this.jLabel3 = jLabel3;
        this.jLabel4 = jLabel4;
        this.jLabel6 = jLabel6;
        this.jLabel7 = jLabel7;
        this.jScrollPane1 = jScrollPane1;
        this.jTable1 = jTable1;
        this.modbutton = modbutton;
        this.seaIDbutton = seaIDbutton;
        this.seabutton1 = seabutton1;
        this.v_dni = v_dni;
        this.v_email = v_email;
        this.v_lastname = v_lastname;
        this.v_name = v_name;
        this.v_phone = v_phone;
    }

    public passenger_Panel1(JButton buttonAdd, JButton delbutton, JLabel jLabel1, JLabel jLabel2, JLabel jLabel3, JLabel jLabel4, JLabel jLabel6, JLabel jLabel7, JScrollPane jScrollPane1, JTable jTable1, JButton modbutton, JButton seaIDbutton, JButton seabutton1, JTextField v_dni, JTextField v_email, JTextField v_lastname, JTextField v_name, JTextField v_phone, LayoutManager layout) {
        super(layout);
        this.buttonAdd = buttonAdd;
        this.delbutton = delbutton;
        this.jLabel1 = jLabel1;
        this.jLabel2 = jLabel2;
        this.jLabel3 = jLabel3;
        this.jLabel4 = jLabel4;
        this.jLabel6 = jLabel6;
        this.jLabel7 = jLabel7;
        this.jScrollPane1 = jScrollPane1;
        this.jTable1 = jTable1;
        this.modbutton = modbutton;
        this.seaIDbutton = seaIDbutton;
        this.seabutton1 = seabutton1;
        this.v_dni = v_dni;
        this.v_email = v_email;
        this.v_lastname = v_lastname;
        this.v_name = v_name;
        this.v_phone = v_phone;
    }

    public passenger_Panel1(JButton buttonAdd, JButton delbutton, JLabel jLabel1, JLabel jLabel2, JLabel jLabel3, JLabel jLabel4, JLabel jLabel6, JLabel jLabel7, JScrollPane jScrollPane1, JTable jTable1, JButton modbutton, JButton seaIDbutton, JButton seabutton1, JTextField v_dni, JTextField v_email, JTextField v_lastname, JTextField v_name, JTextField v_phone, boolean isDoubleBuffered) {
        super(isDoubleBuffered);
        this.buttonAdd = buttonAdd;
        this.delbutton = delbutton;
        this.jLabel1 = jLabel1;
        this.jLabel2 = jLabel2;
        this.jLabel3 = jLabel3;
        this.jLabel4 = jLabel4;
        this.jLabel6 = jLabel6;
        this.jLabel7 = jLabel7;
        this.jScrollPane1 = jScrollPane1;
        this.jTable1 = jTable1;
        this.modbutton = modbutton;
        this.seaIDbutton = seaIDbutton;
        this.seabutton1 = seabutton1;
        this.v_dni = v_dni;
        this.v_email = v_email;
        this.v_lastname = v_lastname;
        this.v_name = v_name;
        this.v_phone = v_phone;
    }

    public passenger_Panel1(JButton buttonAdd, JButton delbutton, JLabel jLabel1, JLabel jLabel2, JLabel jLabel3, JLabel jLabel4, JLabel jLabel6, JLabel jLabel7, JScrollPane jScrollPane1, JTable jTable1, JButton modbutton, JButton seaIDbutton, JButton seabutton1, JTextField v_dni, JTextField v_email, JTextField v_lastname, JTextField v_name, JTextField v_phone) {
        this.buttonAdd = buttonAdd;
        this.delbutton = delbutton;
        this.jLabel1 = jLabel1;
        this.jLabel2 = jLabel2;
        this.jLabel3 = jLabel3;
        this.jLabel4 = jLabel4;
        this.jLabel6 = jLabel6;
        this.jLabel7 = jLabel7;
        this.jScrollPane1 = jScrollPane1;
        this.jTable1 = jTable1;
        this.modbutton = modbutton;
        this.seaIDbutton = seaIDbutton;
        this.seabutton1 = seabutton1;
        this.v_dni = v_dni;
        this.v_email = v_email;
        this.v_lastname = v_lastname;
        this.v_name = v_name;
        this.v_phone = v_phone;
    }

    public DefaultTableModel getTablePass() {
        return tablePass;
    }

    public passenger getP() {
        return p;
    }


    public JButton getButtonAdd() {
        return buttonAdd;
    }

    public JButton getDelbutton() {
        return delbutton;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public JTable getjTable1() {
        return jTable1;
    }

    public JButton getModbutton() {
        return modbutton;
    }

    public JButton getSeaIDbutton() {
        return seaIDbutton;
    }

    public JButton getSeabutton1() {
        return seabutton1;
    }

    public JTextField getV_dni() {
        return v_dni;
    }

    public JTextField getV_email() {
        return v_email;
    }

    public JTextField getV_lastname() {
        return v_lastname;
    }

    public JTextField getV_name() {
        return v_name;
    }

    public JTextField getV_phone() {
        return v_phone;
    }

    public ComponentUI getUi() {
        return ui;
    }

    public EventListenerList getListenerList() {
        return listenerList;
    }

    public static int getWHEN_FOCUSED() {
        return WHEN_FOCUSED;
    }

    public static int getWHEN_ANCESTOR_OF_FOCUSED_COMPONENT() {
        return WHEN_ANCESTOR_OF_FOCUSED_COMPONENT;
    }

    public static int getWHEN_IN_FOCUSED_WINDOW() {
        return WHEN_IN_FOCUSED_WINDOW;
    }

    public static int getUNDEFINED_CONDITION() {
        return UNDEFINED_CONDITION;
    }

    public static String getTOOL_TIP_TEXT_KEY() {
        return TOOL_TIP_TEXT_KEY;
    }

    public static float getTOP_ALIGNMENT() {
        return TOP_ALIGNMENT;
    }

    public static float getCENTER_ALIGNMENT() {
        return CENTER_ALIGNMENT;
    }

    public static float getBOTTOM_ALIGNMENT() {
        return BOTTOM_ALIGNMENT;
    }

    public static float getLEFT_ALIGNMENT() {
        return LEFT_ALIGNMENT;
    }

    public static float getRIGHT_ALIGNMENT() {
        return RIGHT_ALIGNMENT;
    }

    public AccessibleContext getAccessibleContext() {
        return accessibleContext;
    }

    public static int getWIDTH() {
        return WIDTH;
    }

    public static int getHEIGHT() {
        return HEIGHT;
    }

    public static int getPROPERTIES() {
        return PROPERTIES;
    }

    public static int getSOMEBITS() {
        return SOMEBITS;
    }

    public static int getFRAMEBITS() {
        return FRAMEBITS;
    }

    public static int getALLBITS() {
        return ALLBITS;
    }

    public static int getERROR() {
        return ERROR;
    }

    public static int getABORT() {
        return ABORT;
    }

    public void setTablePass(DefaultTableModel tablePass) {
        this.tablePass = tablePass;
    }

    public void setP(passenger p) {
        this.p = p;
    }

    public void setButtonAdd(JButton buttonAdd) {
        this.buttonAdd = buttonAdd;
    }

    public void setDelbutton(JButton delbutton) {
        this.delbutton = delbutton;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public void setjTable1(JTable jTable1) {
        this.jTable1 = jTable1;
    }

    public void setModbutton(JButton modbutton) {
        this.modbutton = modbutton;
    }

    public void setSeaIDbutton(JButton seaIDbutton) {
        this.seaIDbutton = seaIDbutton;
    }

    public void setSeabutton1(JButton seabutton1) {
        this.seabutton1 = seabutton1;
    }

    public void setV_dni(JTextField v_dni) {
        this.v_dni = v_dni;
    }

    public void setV_email(JTextField v_email) {
        this.v_email = v_email;
    }

    public void setV_lastname(JTextField v_lastname) {
        this.v_lastname = v_lastname;
    }

    public void setV_name(JTextField v_name) {
        this.v_name = v_name;
    }

    public void setV_phone(JTextField v_phone) {
        this.v_phone = v_phone;
    }

    public void setUi(ComponentUI ui) {
        this.ui = ui;
    }

    public void setListenerList(EventListenerList listenerList) {
        this.listenerList = listenerList;
    }

    public void setAccessibleContext(AccessibleContext accessibleContext) {
        this.accessibleContext = accessibleContext;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.tablePass);
        hash = 19 * hash + Objects.hashCode(this.p);
        hash = 19 * hash + Objects.hashCode(this.buttonAdd);
        hash = 19 * hash + Objects.hashCode(this.delbutton);
        hash = 19 * hash + Objects.hashCode(this.jLabel1);
        hash = 19 * hash + Objects.hashCode(this.jLabel2);
        hash = 19 * hash + Objects.hashCode(this.jLabel3);
        hash = 19 * hash + Objects.hashCode(this.jLabel4);
        hash = 19 * hash + Objects.hashCode(this.jLabel6);
        hash = 19 * hash + Objects.hashCode(this.jLabel7);
        hash = 19 * hash + Objects.hashCode(this.jScrollPane1);
        hash = 19 * hash + Objects.hashCode(this.jTable1);
        hash = 19 * hash + Objects.hashCode(this.modbutton);
        hash = 19 * hash + Objects.hashCode(this.seaIDbutton);
        hash = 19 * hash + Objects.hashCode(this.seabutton1);
        hash = 19 * hash + Objects.hashCode(this.v_dni);
        hash = 19 * hash + Objects.hashCode(this.v_email);
        hash = 19 * hash + Objects.hashCode(this.v_lastname);
        hash = 19 * hash + Objects.hashCode(this.v_name);
        hash = 19 * hash + Objects.hashCode(this.v_phone);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final passenger_Panel1 other = (passenger_Panel1) obj;
        if (!Objects.equals(this.tablePass, other.tablePass)) {
            return false;
        }
        if (!Objects.equals(this.p, other.p)) {
            return false;
        }
        if (!Objects.equals(this.buttonAdd, other.buttonAdd)) {
            return false;
        }
        if (!Objects.equals(this.delbutton, other.delbutton)) {
            return false;
        }
        if (!Objects.equals(this.jLabel1, other.jLabel1)) {
            return false;
        }
        if (!Objects.equals(this.jLabel2, other.jLabel2)) {
            return false;
        }
        if (!Objects.equals(this.jLabel3, other.jLabel3)) {
            return false;
        }
        if (!Objects.equals(this.jLabel4, other.jLabel4)) {
            return false;
        }
        if (!Objects.equals(this.jLabel6, other.jLabel6)) {
            return false;
        }
        if (!Objects.equals(this.jLabel7, other.jLabel7)) {
            return false;
        }
        if (!Objects.equals(this.jScrollPane1, other.jScrollPane1)) {
            return false;
        }
        if (!Objects.equals(this.jTable1, other.jTable1)) {
            return false;
        }
        if (!Objects.equals(this.modbutton, other.modbutton)) {
            return false;
        }
        if (!Objects.equals(this.seaIDbutton, other.seaIDbutton)) {
            return false;
        }
        if (!Objects.equals(this.seabutton1, other.seabutton1)) {
            return false;
        }
        if (!Objects.equals(this.v_dni, other.v_dni)) {
            return false;
        }
        if (!Objects.equals(this.v_email, other.v_email)) {
            return false;
        }
        if (!Objects.equals(this.v_lastname, other.v_lastname)) {
            return false;
        }
        if (!Objects.equals(this.v_name, other.v_name)) {
            return false;
        }
        return Objects.equals(this.v_phone, other.v_phone);
    }

    @Override
    public String toString() {
        return "passenger_Panel1{" + "tablePass=" + tablePass + ", p=" + p + ", buttonAdd=" + buttonAdd + ", delbutton=" + delbutton + ", jLabel1=" + jLabel1 + ", jLabel2=" + jLabel2 + ", jLabel3=" + jLabel3 + ", jLabel4=" + jLabel4 + ", jLabel6=" + jLabel6 + ", jLabel7=" + jLabel7 + ", jScrollPane1=" + jScrollPane1 + ", jTable1=" + jTable1 + ", modbutton=" + modbutton + ", seaIDbutton=" + seaIDbutton + ", seabutton1=" + seabutton1 + ", v_dni=" + v_dni + ", v_email=" + v_email + ", v_lastname=" + v_lastname + ", v_name=" + v_name + ", v_phone=" + v_phone + '}';
    }
    
    
    
    public passenger_Panel1() {
        initComponents();
        jTable1.setModel (tablePass);
    }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        v_name = new javax.swing.JTextField();
        v_lastname = new javax.swing.JTextField();
        v_dni = new javax.swing.JTextField();
        delbutton = new javax.swing.JButton();
        modbutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        v_email = new javax.swing.JTextField();
        v_phone = new javax.swing.JTextField();
        seaIDbutton = new javax.swing.JButton();
        seabutton1 = new javax.swing.JButton();
        buttonAdd = new javax.swing.JButton();

        jLabel1.setText("Pasajeros");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("DNI");

        jLabel6.setText("Telefono");

        jLabel7.setText("Email");

        delbutton.setText("Eliminar");
        delbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delbuttonActionPerformed(evt);
            }
        });

        modbutton.setText("Modificar");
        modbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modbuttonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido", "Dni", "Email", "Telefono"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        seaIDbutton.setText("Buscar ID");
        seaIDbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seaIDbuttonActionPerformed(evt);
            }
        });

        seabutton1.setText("Buscar");
        seabutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seabutton1ActionPerformed(evt);
            }
        });

        buttonAdd.setText("Agregar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(v_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(v_name, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(v_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(v_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(v_email, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(delbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(modbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(seaIDbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(seabutton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(64, 78, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)
                                        .addGap(9, 9, 9))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(v_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(v_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(9, 9, 9))
                            .addComponent(v_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(v_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(v_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(buttonAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delbutton)
                        .addGap(18, 18, 18)
                        .addComponent(modbutton)
                        .addGap(18, 18, 18)
                        .addComponent(seabutton1)
                        .addGap(18, 18, 18)
                        .addComponent(seaIDbutton)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void delbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delbuttonActionPerformed
        
    }//GEN-LAST:event_delbuttonActionPerformed

    private void modbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modbuttonActionPerformed
        
    }//GEN-LAST:event_modbuttonActionPerformed

    private void seaIDbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seaIDbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seaIDbuttonActionPerformed

    private void seabutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seabutton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seabutton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton delbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton modbutton;
    private javax.swing.JButton seaIDbutton;
    private javax.swing.JButton seabutton1;
    private javax.swing.JTextField v_dni;
    private javax.swing.JTextField v_email;
    private javax.swing.JTextField v_lastname;
    private javax.swing.JTextField v_name;
    private javax.swing.JTextField v_phone;
    // End of variables declaration//GEN-END:variables
}
